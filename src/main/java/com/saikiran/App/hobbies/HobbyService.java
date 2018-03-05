package com.saikiran.App.hobbies;

import com.saikiran.App.secure.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HobbyService {

    @Autowired
    private HobbyRepository hobbyRepository;

    public List<Hobby> getHobby(int id){
        List<Hobby> hobbies=new ArrayList<>();
        hobbyRepository.findByPEmployeeId(id).forEach(a -> hobbies.add(a));
        return hobbies;
    }


    public void createHobby(int id,Hobby hobby){
        hobby.setP(new Person(id,null,null,null));
        hobbyRepository.save(hobby);
    }
}
