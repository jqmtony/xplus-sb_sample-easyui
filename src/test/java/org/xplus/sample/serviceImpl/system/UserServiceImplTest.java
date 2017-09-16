package org.xplus.sample.serviceImpl.system;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.xplus.sample.entity.system.User;
import org.xplus.sample.service.system.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceImplTest {

	private static final Logger log = LoggerFactory.getLogger(UserServiceImplTest.class);

	@Autowired
	UserService userService;

	@Test
	public void testFindAllIntIntListOfStringListOfString() {
		// fail("Not yet implemented");
		List<User> users = userService.findAll();
		if (!users.isEmpty()) {
			users.forEach(user -> {
				log.info(user.toString());
			});
		}
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
