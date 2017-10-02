package org.xplus.sample.repository.basic;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.xplus.sample.commons.utils.jpa.Criteria;
import org.xplus.sample.commons.utils.jpa.Restrictions;
import org.xplus.sample.entity.basic.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTest {

	private static final Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);

	/*
	 * @Before public void setUp() throws Exception { }
	 */

	/*
	 * @After public void tearDown() throws Exception { }
	 */

	@Autowired
	UserRepository userRepository;

	@Test
	public void test() {

		Criteria<User> criteria = new Criteria<>();

		// 等于 name = ‘test’
		criteria.add(Restrictions.eq("name", "user01"));

		// 等于 name like %test%
		// criteria.add(Restrictions.like("name", "user01",
		// Criterion.MatchMode.ANYWHERE));

		// age between(1, 20)
		// criteria.add(Restrictions.between("age", 1, 20));

		// ISNOTEMPTY(name)
		// criteria.add(Restrictions.isNotEmpty("name"));
		// List<String> list = new ArrayList<>();
		// list.add("Alice");
		// list.add("Mick");
		// name in ('Alice','Mick')
		// criteria.add(Restrictions.in("name", list));

		// length(name) = 5
		// criteria.add(Restrictions.eq(Projections.Length("name"), 5));

		// max(name) = 5
		// criteria.add(Restrictions.gt(Projections.Max("name"), 5));

		// (name = 'tt' or name = 'qq')
		// criteria.add(Restrictions.or(Restrictions.eq("name", "tt"),
		// Restrictions.eq("name", "qq")));

		List<User> userList = userRepository.findAll(criteria);

		if (!userList.isEmpty()) {
			for (User user : userList) {
				System.out.print(user.toString());
			}
		}
	}

}
