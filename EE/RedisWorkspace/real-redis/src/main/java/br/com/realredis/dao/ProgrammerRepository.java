package br.com.realredis.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.realredis.model.Programmer;

public interface ProgrammerRepository {

	// String
	void setProgrammerAsString(String idKey, String programmer);

	String getProgrammerAsString(String idKey);

	// List

	void addToProgrammersList(Programmer programmer);

	List<Programmer> getProgrammersListMembers();

	Long getProgrammerListCount();

	// Set
	void AddToProgrammersSet(Programmer... programmers);

	Set<Programmer> getProgrammersSetMembers();

	boolean isSetMember(Programmer programmer);

	// Hash
	void saveHash(Programmer programmer);

	void updateHash(Programmer programmer);

	Map<Integer, Programmer> findAllHash();

	Programmer findInHash(int id);

	void deleteHash(int id);

}
