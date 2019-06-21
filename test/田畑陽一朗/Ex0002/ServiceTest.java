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
	public void testNoMember() throws Exception {
		List<Human> HumanList = service.getHumanList();
		assertThat(HumanList.size(), is(0));
	}
}
