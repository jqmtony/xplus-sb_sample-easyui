package org.xplus.sample.serviceImpl.system;

import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.xplus.sample.entity.basic.User;
import org.xplus.sample.service.basic.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceImplTest {

	private static final Logger log = LoggerFactory.getLogger(UserServiceImplTest.class);

	@Autowired
	UserService userService;

	@Test
	public void testFindAllIntIntListOfStringListOfString() {
		// fail("Not yet implemented");
		int pageNo = 1;
		int pageSize = 10;
		List<String> sort = Arrays.asList("id,no".split(","));
		List<String> order = Arrays.asList("asc,asc".split(","));
		/*Page<User> page = userService.findAll(pageNo, pageSize, sort, order);
		if (page.getSize() > 0) {
			for (User user : page.getContent()) {
				log.info(user.toString());
			}
		}*/
	}

	@Test
	public void testFindAllIntIntListOfStringListOfStringMapOfStringObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteListOfString() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteString() {
		fail("Not yet implemented");
	}

}
