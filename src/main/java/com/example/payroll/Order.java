package com.example.payroll;

import ch.qos.logback.core.status.Status;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER_ORDER" )

public class Order {

    private @Id
    @GeneratedValue Long id;

    private String description;
    private Status status;

    public Order(){}

    Order(String description, Status status){
        this.description= description;
        this.status = status;
    }




    public  Long getID(){
        return this.id;
    }

    public String getDescription(){
        return this.description;
    }


    public Status getStatus(){
        return this.status;
    }

    public void setID(Long id){
        this.id = id;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setStatus(Status status){
        this.status =status;
    }



}
