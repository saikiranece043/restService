package com.saikiran.App.hobbies;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface HobbyRepository extends CrudRepository<Hobby,Integer> {

    public List<Hobby> findByPEmployeeId(int id);
}
