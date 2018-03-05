package com.saikiran.App.secure;




import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    private int employeeId;
    private String first_name;
    private String last_name;
    private String company;


    public Person(int employeeId, String first_name, String last_name, String company) {
        super();
        this.employeeId = employeeId;
        this.first_name = first_name;
        this.last_name = last_name;
        this.company = company;
    }

    public Person(){

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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
        return String.format("EmployeeID : %d , FirstName : %s , LastName : %s", employeeId,first_name,last_name);
    }
}
