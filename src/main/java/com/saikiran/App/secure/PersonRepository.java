package com.saikiran.App.secure;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface PersonRepository extends CrudRepository<Person,Integer> {

public List<Person> findByCompany(String a);

}
