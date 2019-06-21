package 田畑陽一朗.Ex0002;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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
		service.addHuman(new Human("1000", "佐藤", true));
		service.addHuman(new Human("2000", "鈴木", false));
		service.addHuman(new Human("3000", "高橋", true));

		List<Human> HumanList = service.getHumanList();
		assertThat(HumanList.size(), is(3));
		assertThat(HumanList.get(0).getID(), is(1000));
		assertThat(HumanList.get(0).getName(), is("佐藤"));
		assertThat(HumanList.get(0).isAttend(), is(true));
		assertThat(HumanList.get(1).getID(), is(2000));
		assertThat(HumanList.get(1).getName(), is("鈴木"));
		assertThat(HumanList.get(1).isAttend(), is(false));
		assertThat(HumanList.get(2).getID(), is(3000));
		assertThat(HumanList.get(2).getName(), is("高橋"));
		assertThat(HumanList.get(2).isAttend(), is(true));
	}

	@Test
	public void testNoMember() throws Exception {
		List<Human> HumanList = service.getHumanList();
		assertThat(HumanList.size(), is(0));
	}

	@Test
	public void testOverlapsPerson() throws Exception {
		expectedException.expect(SameIdExistsException.class);
		expectedException.expectMessage("ID:2000が重複した");
		service.addHuman(new Human("1000", "佐藤", true));
		service.addHuman(new Human("2000", "鈴木", false));
		service.addHuman(new Human("3000", "高橋", true));
		service.addHuman(new Human("2000", "伊藤", true));
	}
}
