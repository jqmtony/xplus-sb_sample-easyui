package org.xplus.sample.serviceImpl.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.xplus.sample.commons.pojo.PagedResult;
import org.xplus.sample.commons.utils.jpa.Criteria;
import org.xplus.sample.commons.utils.jpa.Restrictions;
import org.xplus.sample.entity.basic.User;
import org.xplus.sample.repository.basic.SexRepository;
import org.xplus.sample.repository.basic.UserRepository;
import org.xplus.sample.repository.basic.UserStatusRepository;
import org.xplus.sample.repository.basic.UserTypeRepository;
import org.xplus.sample.service.basic.UserService;
import org.xplus.sample.vo.basic.UserVO;

@Service
@Transactional(noRollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	UserRepository userRepository;

	@Autowired
	SexRepository sexRepository;

	@Autowired
	UserTypeRepository userTypeRepository;

	@Autowired
	UserStatusRepository userStatusRepository;

	@Override
	public PagedResult<UserVO> findAll(int pageNo, int pageSize, List<String> sort, List<String> order) {
		Sort sorts = sortGenerate(sort, order);
		List<UserVO> vos = new ArrayList<UserVO>();
		List<User> users = null;
		Pageable pageable = new PageRequest(pageNo, pageSize, sorts);
		Page page = userRepository.findAll(pageable);
		if (page.getTotalElements() > 0) {
			users = page.getContent();
			for (User user : users) {
				UserVO vo = new UserVO(user);
				vos.add(vo);
			}
		}
		// ......
		return new PagedResult<>(page.getTotalElements(), vos);
	}

	@Override
	public Page<User> findAll(int pageNo, int pageSize, List<String> sort, List<String> order,
			Map<String, Object> params) {
		Page<User> page = null;
		Sort sorts = sortGenerate(sort, order);
		Pageable pageable = new PageRequest(pageNo, pageSize, sorts);
		String v_no = params.get("no").toString();
		String v_name = params.get("name").toString();
		// ......
		page = userRepository.findAll(new Specification<User>() {
			@Override
			public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicates = new ArrayList<>();

				if (StringUtils.isNotBlank(v_no)) {

					if (v_no.indexOf("*") >= 0) {
						predicates.add(cb.like(root.get("no"), v_no.replace("*", "%")));
					} else {
						predicates.add(cb.equal(root.get("no"), v_no));
					}
				}
				if (StringUtils.isNotBlank(v_name)) {

					if (v_name.indexOf("*") >= 0) {
						predicates.add(cb.like(root.get("name"), v_name.replace("*", "%")));
					} else {
						predicates.add(cb.equal(root.get("name"), v_name));
					}
				}

				return cb.and(predicates.toArray(new Predicate[predicates.size()]));
			}
		}, pageable);
		return page;
	}

	@Override
	public User findByUsername(String username) {
		Criteria<User> criteria = new Criteria<>();
		criteria.add(Restrictions.eq("username", username));
		return userRepository.findOne(criteria);
	}

	public static Sort sortGenerate(List<String> orderFields, List<String> orderTypes) {
		List<Order> orders = new ArrayList<Order>();
		if (!orderFields.isEmpty() && orderFields.size() == orderTypes.size()) {
			for (int i = 0; i < orderFields.size(); i++) {
				orders.add(new Order(Direction.fromString(orderTypes.get(i)), orderFields.get(i)));
			}
		}
		return new Sort(orders);
	}

	@Override
	public Object save(UserVO vo) {
		Map<String, Object> result = new HashMap<>();
		try {
			String voId = vo.getId();
			User entity = null;
			if (StringUtils.isBlank(voId)) {
				entity = new User();
				entity.setNo(vo.getNo());
				entity.setUsername(vo.getUsername());
			} else {
				entity = userRepository.findOne(voId);
			}

			// ......
			entity.setName(vo.getName());
			entity.setEnName(vo.getEnName());
			entity.setPassword(vo.getPassword());
			entity.setSex(sexRepository.findOne(vo.getSex()));
			entity.setBirthday(vo.getBirthday());
			entity.setUserType(userTypeRepository.findOne(vo.getUserType()));
			entity.setUserStatus(userStatusRepository.findOne(vo.getUserStatus()));
			// ......
			User returnEntity = userRepository.save(entity);
			if (returnEntity != null) {
				result.put("success", true);
				result.put("msg", "保存成功.");
			} else {
				result.put("success", false);
				result.put("msg", "保存错误.");
			}
		} catch (Exception e) {
			result.put("success", false);
			result.put("msg", e.getMessage());
		}
		return result;
	}

	@Override
	public Object delete(List<String> ids) {
		// ......
		Map<String, Object> result = new HashMap<>();
		String resultStr = "";
		if (ids.size() > 0) {
			for (String id : ids) {
				if (userRepository.exists(id)) {
					userRepository.delete(id);
				} else {

				}
			}
			result.put("success", true);
			result.put("msg", "删除成功.");
		} else {
			result.put("success", false);
			result.put("msg", "删除错误.");
		}
		return result;
	}

	@Override
	public Object delete(String id) {
		Map<String, Object> result = new HashMap<>();
		if (userRepository.exists(id)) {
			userRepository.delete(id);
			result.put("success", true);
			result.put("msg", "删除成功.");
		} else {
			result.put("success", false);
			result.put("msg", "删除错误.");
		}
		return result;
	}

}
