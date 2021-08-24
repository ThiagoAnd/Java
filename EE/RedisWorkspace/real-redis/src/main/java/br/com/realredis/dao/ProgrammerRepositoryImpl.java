package br.com.realredis.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.stereotype.Repository;

import br.com.realredis.model.Programmer;


@Repository
public class ProgrammerRepositoryImpl implements ProgrammerRepository {
	
	//Precisamos usar o redis template bean que foi criado anteriormente
	//na classe SpringConfig, 
	//@Resource estava funcionando com resource, ver a diferença para autowired
	
	//Aqui vamos setar alguns nomes de chaves para serem usadas
	
	public static final String REDIS_LIST_KEY = "ProgrammerList";
	public static final String REDIS_SET_KEY  = "ProgrammerSET";
	public static final String REDIS_HASH_KEY = "ProgrammerHash";
	
	
	@Autowired
	private RedisTemplate<String,Object> redisTemplate;
	
	@Autowired
	@Qualifier("listOperations")
	private ListOperations<String, Programmer> listOps;
	
//	@Autowired
//	@Qualifier("setOperations")
	 private SetOperations<String, Programmer> setOps;	
	
//	@Autowired
	HashOperations<String, Integer, Programmer> hashOps;

	
	//String
	@Override
	public void setProgrammerAsString(String idKey, String programmer) {
		redisTemplate.opsForValue().set(idKey, programmer);
		redisTemplate.expire(idKey, 10,TimeUnit.SECONDS);
	}

	@Override
	public String getProgrammerAsString(String idKey) {
		return (String) redisTemplate.opsForValue().get(idKey); 
	}

	@Override
	public void addToProgrammersList(Programmer programmer) {
		listOps.leftPush(REDIS_LIST_KEY, programmer);
	}

	@Override
	public List<Programmer> getProgrammersListMembers() {
		
		return listOps.range(REDIS_LIST_KEY, 0, -1);
	}

	@Override
	public Long getProgrammerListCount() {
		
		return listOps.size(REDIS_LIST_KEY);
	}
	
	//********** Set *************

	@Override
	public void AddToProgrammersSet(Programmer... programmers) {
		setOps.add(REDIS_SET_KEY, programmers);
		
	}

	@Override
	public Set<Programmer> getProgrammersSetMembers() {
		// TODO Auto-generated method stub
		return setOps.members(REDIS_SET_KEY);
	}

	@Override
	public boolean isSetMember(Programmer programmer) {
		// TODO Auto-generated method stub
		return setOps.isMember(REDIS_SET_KEY,programmer);
	}

	 //********** Hash *************
	
	@Override
	public void saveHash(Programmer programmer) {
		hashOps.put(REDIS_HASH_KEY, programmer.getId(), programmer);
		
	}

	@Override
	public void updateHash(Programmer programmer) {
		hashOps.put(REDIS_HASH_KEY, programmer.getId(), programmer);
		
	}

	@Override
	public Map<Integer, Programmer> findAllHash() {
		// TODO Auto-generated method stub
		return hashOps.entries(REDIS_HASH_KEY);
	}

	@Override
	public Programmer findInHash(int id) {
		return hashOps.get(REDIS_HASH_KEY, id);
	}

	@Override
	public void deleteHash(int id) {
		hashOps.delete(REDIS_HASH_KEY, id);
		
	}
	
	
	

}
