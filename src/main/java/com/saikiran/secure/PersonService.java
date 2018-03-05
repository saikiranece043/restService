package com.saikiran.secure;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;


    public List<Person> getPersons(){
        List<Person> persons=new ArrayList<>();
         personRepository.findAll().forEach(person -> persons.add(person));
         return persons;
    }

    public void addPerson(Person p){
        personRepository.save(p);
    }


    public Person getPerson(int id){
        return personRepository.findOne(id);
    }


    public void addPersons(List<Person> persons){
        persons.forEach(p -> personRepository.save(p));
    }


    public void deletePerson(int id){
        personRepository.delete(id);

    }

}
