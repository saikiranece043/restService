package com.saikiran.secure;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerG {


@Autowired
private PersonService personService;

//getting persons from database
@RequestMapping("/persons")
    public List<Person> getPersons(){
    return personService.getPersons();
}

//Adding a person to the database
@RequestMapping(value = "/persons",method = RequestMethod.POST)
    public void addPerson(@RequestBody Person person){
       personService.addPerson(person);
}

    //Adding list of persons to the database
    @RequestMapping(value = "/persons/add",method = RequestMethod.POST)
    public void addPersons(@RequestBody List<Person> persons){
            personService.addPersons(persons);
    }

//getting person with a specific id
@RequestMapping("/persons/{id}")
public Person getPerson(@PathVariable int id){
        return personService.getPerson(id);
}


    //getting person working in a company
    @RequestMapping("/persons/com/{name}")
    public List<Person> getPerson(@PathVariable String name){
        return personService.getPersonByCompany(name);
    }






//Deleting a person
@RequestMapping(value = "/persons/{id}",method = RequestMethod.DELETE)
    public void deletePerson(@PathVariable int id){
               personService.deletePerson(id);
    }

}
