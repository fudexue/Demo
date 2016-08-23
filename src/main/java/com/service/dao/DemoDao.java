package com.service.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.service.entity.DemoEntity;

@Repository
public interface DemoDao {
	
	public List<DemoEntity> getDemoList();
}
