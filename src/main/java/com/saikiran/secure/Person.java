package com.saikiran.secure;




import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    private int employee_id;
    private String first_name;
    private String last_name;
    private String company;

    public Person(){

    }


    public Person(int employee_id, String first_name, String last_name, String company) {
        super();
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.company = company;
    }



    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return String.format("EmployeeID : %d , FirstName : %s , LastName : %s",employee_id,first_name,last_name);
    }
}
