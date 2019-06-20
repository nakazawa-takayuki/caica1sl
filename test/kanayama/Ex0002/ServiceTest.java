package kanayama.Ex0002;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * テストクラス
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
	public void test01() throws IdException{
		Human human1 = new Human(1,"田中一郎",true);
		Human human2 = new Human(2,"田中二郎",false);
		Human human3 = new Human(3,"田中三郎",true);

		service.addEntrantList(human1);
		service.addEntrantList(human2);
		service.addEntrantList(human3);

		List<Human> list = new ArrayList<>();
		list = service.getEntrantList();
		assertThat(list.get(0).getEntryId(),is(1));
		assertThat(list.get(0).getEntryName(),is("田中一郎"));
		assertThat(list.get(0).isEntryAvailability(),is(true));
		assertThat(list.get(1).getEntryId(),is(2));
		assertThat(list.get(1).getEntryName(),is("田中二郎"));
		assertThat(list.get(1).isEntryAvailability(),is(false));
		assertThat(list.get(2).getEntryId(),is(3));
		assertThat(list.get(2).getEntryName(),is("田中三郎"));
		assertThat(list.get(2).isEntryAvailability(),is(true));
	}
	@Test
	public void test02() throws IdException{
		Manegement manegement = service.getManegement();
		List<Human> entrantList = manegement.getEntrantList();

		assertThat(entrantList.size(),is(0));

	}
	@Test
	public void test03() throws IdException{
		expectedException.expect(IdException.class);
		expectedException.expectMessage("IDが重複しています。");


		Human human1 = new Human(1,"田中一郎",true);
		Human human2 = new Human(2,"田中二郎",false);
		Human human3 = new Human(3,"田中三郎",true);

		service.addEntrantList(human1);
		service.addEntrantList(human2);
		service.addEntrantList(human3);
		service.addEntrantList(human3);
	}
}
