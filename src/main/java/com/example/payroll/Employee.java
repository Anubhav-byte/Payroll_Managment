package com.example.payroll;

import org.hibernate.annotations.RowId;
import org.springframework.context.annotation.Primary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String role;

    public Employee(){
    }

    public Employee(String firstName, String lastName , String role){
        this.firstName=firstName;
        this.lastName= lastName;
        this.role=role;
    }

    public Long getId(){
        return this.id;
    }
    public String getName(){

        return this.firstName+" "+ this.lastName;
    }
    public String getRole(){
        return role;
    }


    public String getFirstName(){ return this.firstName; }

    public String getLastName() {
        return this.lastName;
    }

    public void setId(Long id){
        this.id=id;
    }

    public void setName(String name) {
        String[] parts = name.split(" ");
        this.firstName=parts[0];
        this.lastName = parts[1];
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(!(o instanceof Employee))
            return false;

        Employee employee = (Employee)o;
        return Objects.equals(this.id,employee.id)
                && Objects.equals(this.role,employee.role)
                && Objects.equals(this.firstName , employee.firstName)
                && Objects.equals(this.lastName,employee.lastName);
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.id,this.firstName, this.lastName,this.role);
    }

   @Override
   public String toString(){
        return "Employee{" + "Id=" + this.id+ ", First Name= "+ this.firstName + ", Last name="+
                this.lastName   +   ", Role="+ this.role + "}";
   }


}
