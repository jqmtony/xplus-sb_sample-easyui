package org.xplus.sample.service.basic;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.xplus.sample.commons.pojo.PagedResult;
import org.xplus.sample.entity.basic.User;
import org.xplus.sample.vo.basic.UserVO;

public interface UserService {

	PagedResult<UserVO> findAll(int pageNo, int pageSize, List<String> sort, List<String> order);
	
	//Page<User> findAll(int pageNo, int pageSize, List<String> sort, List<String> order);

	Page<User> findAll(int pageNo, int pageSize, List<String> sort, List<String> order, Map<String, Object> params);

	Object save(UserVO vo);

	Object delete(List<String> ids);

	Object delete(String id);

}
