package io.redis.redisdemo.service;

public interface ProgrammerService {
	
	void setProgrammerAsString(String idKey, String programmer);
	
	String getProgrammerAsString(String key);

}
