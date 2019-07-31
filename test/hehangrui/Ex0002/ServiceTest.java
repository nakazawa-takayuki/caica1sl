package hehangrui.Ex0002;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * サービスのテストクラス
 *
 * @author Adrian
 */
public class ServiceTest {

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	private Service service;

	@Before
	public void setUp() {
		service = new Service();
	}

	@Test
	public void testCalcJoinning() throws Exception {
		service.addPerson(new People(1000, "佐藤", true));
		service.addPerson(new People(2000, "鈴木", false));
		service.addPerson(new People(3000, "高橋", true));

		List<People> peopleList = service.getPeopleList();
		assertThat(peopleList.size(), is(3));
		assertThat(peopleList.get(0).getId(), is(1000));
		assertThat(peopleList.get(0).getName(), is("佐藤"));
		assertThat(peopleList.get(0).join(), is(true));
		assertThat(peopleList.get(1).getId(), is(2000));
		assertThat(peopleList.get(1).getName(), is("鈴木"));
		assertThat(peopleList.get(1).join(), is(false));
		assertThat(peopleList.get(2).getId(), is(3000));
		assertThat(peopleList.get(2).getName(), is("高橋"));
		assertThat(peopleList.get(2).join(), is(true));
	}

	@Test
	public void testNoMember() throws Exception {
		List<People> peopleList = service.getPeopleList();
		assertThat(peopleList.size(), is(0));
	}

	@Test
	public void testOverlapsPerson() throws Exception {
		expectedException.expect(SameIDAlreadyExistsException.class);
		expectedException.expectMessage("ID:2000が重複した");
		service.addPerson(new People(1000, "佐藤", true));
		service.addPerson(new People(2000, "鈴木", false));
		service.addPerson(new People(3000, "高橋", true));
		service.addPerson(new People(2000, "伊藤", true));
	}

}
