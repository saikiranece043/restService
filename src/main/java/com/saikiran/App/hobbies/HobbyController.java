package com.saikiran.App.hobbies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HobbyController {

    @Autowired
private HobbyService hobbyService;

    @RequestMapping("/persons/{id}/hobbies")
    public List<Hobby> getAllHobbies(@PathVariable int id){
           return hobbyService.getHobby(id);
    }


    @RequestMapping(value = "/persons/{id}/hobbies",method = RequestMethod.POST)
    public void createHobby(@PathVariable int id, @RequestBody Hobby hobby){
              hobbyService.createHobby(id,hobby);
    }

}
