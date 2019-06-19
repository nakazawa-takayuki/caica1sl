package TajimaRen.Ex0002;

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

	Service service;

	@Before
	public void setUp() {
		service = new Service();
	}

	@Test
	public void test1() throws Exception{
		service.addPerson(new Person(1,"佐藤",true));
		service.addPerson(new Person(2,"田中",true));
		service.addPerson(new Person(3,"田島",false));

		Event event = service.getEvent();
		List<Person> personList = event.getPersonList();

		assertThat(personList.size(),is(3));
		assertThat(personList.get(0).getId(),is(1));
		assertThat(personList.get(0).getName(),is("佐藤"));
		assertThat(personList.get(0).isEntry(),is(true));
		assertThat(personList.get(1).getId(),is(2));
		assertThat(personList.get(1).getName(),is("田中"));
		assertThat(personList.get(1).isEntry(),is(true));
		assertThat(personList.get(2).getId(),is(3));
		assertThat(personList.get(2).getName(),is("田島"));
		assertThat(personList.get(2).isEntry(),is(false));
	}

	@Test
	public void test2() throws Exception{
		Event event = service.getEvent();
		List<Person> personList = event.getPersonList();

		assertThat(personList.size(),is(0));
	}

	@Test
	public void test3() throws Exception{
		expectedException.expect(SameIdAlreadyExistsException.class);
		service.addPerson(new Person(1,"佐藤",true));
		service.addPerson(new Person(2,"田中",true));
		service.addPerson(new Person(3,"田島",true));
		service.addPerson(new Person(3,"山田",false));
	}
}