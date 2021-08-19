package io.redis.redisdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.redis.redisdemo.dao.ProgrammerRepository;

@Service
public class ProgrammerServiceImpl implements ProgrammerService {

	@Autowired
	ProgrammerRepository repository;
	
	@Override
	public void setProgrammerAsString(String idKey, String programmer) {
		
		repository.setProgrammerAsString(idKey, programmer);
		
	}

	@Override
	public String getProgrammerAsString(String key) {
		return repository.getProgrammerAsString(key);
	}

}
