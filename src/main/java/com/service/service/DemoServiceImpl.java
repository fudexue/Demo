package com.service.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.service.dao.DemoDao;
import com.service.entity.DemoEntity;
@Service
public class DemoServiceImpl implements DemoService {
	public static final Logger logger = Logger.getLogger(DemoServiceImpl.class);
	@Resource
	private DemoDao demoDao;
	@Override
	public List<DemoEntity> getDemoList() {
		logger.info("service test");
		List<DemoEntity> demoList = demoDao.getDemoList();
		return demoList;
	}
}
