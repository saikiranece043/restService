package com.saikiran.App.hobbies;

import com.saikiran.App.secure.Person;


import javax.persistence.*;

@Entity
public class Hobby {

    @Id
    @GeneratedValue
    private int id;
    private String hobbyName;


@ManyToOne(fetch = FetchType.LAZY)
    private Person p;

    public Hobby()
    {

    }

    public Hobby(int id,String hobbyName,int personId) {
        this.hobbyName = hobbyName;
        this.id = id;
        this.p = new Person(personId,null,null,null);
    }





    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }
}
