package kanayama.Ex0002;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ServiceTest {

	@Test
	public void test01() throws Exception{
		Human human1 = new Human(1,"田中一郎",true);
		Human human2 = new Human(2,"田中二郎",false);
		Human human3 = new Human(3,"田中三郎",true);
		Service service = new Service();

		service.addEntrantList(human1);
		service.addEntrantList(human2);
		service.addEntrantList(human3);
		//service.addEntrantList(human3);

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
		//fail("まだ実装されていません");
	}
	@Test
	public void test02() throws Exception{
		Human human1 = new Human(1,"田中一郎",true);
		Human human2 = new Human(2,"田中二郎",false);
		Human human3 = new Human(3,"田中三郎",true);
		Service service = new Service();
		/*
		service.addEntrantList(human1);
		service.addEntrantList(human2);
		service.addEntrantList(human3);
		service.addEntrantList(human3);
		 */

		List<Human> list = new ArrayList<>();
		list = service.getEntrantList();
		/*
		assertThat(list.get(0).getEntryId(),is(1));
		assertThat(list.get(0).getEntryName(),is("田中一郎"));
		assertThat(list.get(0).isEntryAvailability(),is(true));
		assertThat(list.get(1).getEntryId(),is(2));
		assertThat(list.get(1).getEntryName(),is("田中二郎"));
		assertThat(list.get(1).isEntryAvailability(),is(false));
		assertThat(list.get(2).getEntryId(),is(3));
		assertThat(list.get(2).getEntryName(),is("田中三郎"));
		assertThat(list.get(2).isEntryAvailability(),is(true));
		 */
		//fail("まだ実装されていません");
	}
	@Test
	public void test03() throws Exception{
		Human human1 = new Human(1,"田中一郎",true);
		Human human2 = new Human(2,"田中二郎",false);
		Human human3 = new Human(3,"田中三郎",true);
		Service service = new Service();

		service.addEntrantList(human1);
		service.addEntrantList(human2);
		service.addEntrantList(human3);
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
		assertThat(list.get(3).getEntryId(),is(3));
		assertThat(list.get(3).getEntryName(),is("田中三郎"));
		assertThat(list.get(3).isEntryAvailability(),is(true));

		//fail("まだ実装されていません");
	}
}
