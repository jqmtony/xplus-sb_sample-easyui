package org.xplus.sample.serviceImpl.basic;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.xplus.sample.entity.basic.Menu;
import org.xplus.sample.service.basic.MenuService;

@Service
public class MenuServiceImpl implements MenuService {
	private static final Logger log = LoggerFactory.getLogger(MenuServiceImpl.class);

	@Override
	public List<Menu> findTree() {
		// TODO Auto-generated method stub
		return null;
	}
}
