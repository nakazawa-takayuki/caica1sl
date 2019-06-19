package 高藝珈.Ex0002;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * 【課題2】
 * テストケース
 * 合計3名 参加2名
 * 合計0名
 * 合計4名 参加3名 ID重複1名
 *
 * @author 高藝珈
 */

public class AttendanceServiceTest {

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	private AttendanceService service;

	@Before
	public void setUp() {
		service = new AttendanceService();
	}

	@Test
	public void testAdd_3person() throws Exception {

		service.add(new Person(1, "大島先輩", true));
		service.add(new Person(2, "鶴田先輩", true));
		service.add(new Person(3, "中沢先輩", false));

		Event event = service.getEvent();
		List<Person> personList = event.getPersonList();

		assertThat(personList.size(), is(3));
		assertThat(personList.get(0).getId(), is(1));
		assertThat(personList.get(0).getName(), is("大島先輩"));
		assertThat(personList.get(0).isAttendance(), is(true));
		assertThat(personList.get(1).getId(), is(2));
		assertThat(personList.get(1).getName(), is("鶴田先輩"));
		assertThat(personList.get(1).isAttendance(), is(true));
		assertThat(personList.get(2).getId(), is(3));
		assertThat(personList.get(2).getName(), is("中沢先輩"));
		assertThat(personList.get(2).isAttendance(), is(false));
	}

	@Test
	public void testAdd_noPerson() throws Exception {

		Event event = service.getEvent();
		List<Person> personList = event.getPersonList();
		assertThat(personList.size(), is(0));
	}

	@Test
	public void testAdd_duplicateId() throws Exception {

		expectedException.expect(SameIdException.class);
		expectedException.expectMessage("重複ID1");

		service.add(new Person(1, "大島先輩", true));
		service.add(new Person(2, "鶴田先輩", true));
		service.add(new Person(3, "中沢先輩", false));
		service.add(new Person(1, "タン先輩", true));
	}

}
