package org.xplus.sample.service.system;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.xplus.sample.entity.system.User;
import org.xplus.sample.vo.system.UserVO;

public interface UserService {

	List<User> findAll();

	Page<User> findAll(int pageNo, int pageSize, List<String> sort, List<String> order);

	Page<User> findAll(int pageNo, int pageSize, List<String> sort, List<String> order, Map<String, Object> params);

	Object save(UserVO vo);

	Object delete(List<String> ids);

	Object delete(String id);

}
