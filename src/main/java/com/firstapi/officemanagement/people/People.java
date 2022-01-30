package com.firstapi.officemanagement.people;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class People {
    @Id
    @SequenceGenerator(
        name = "people_sequence",
        sequenceName = "people_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.AUTO,
        generator = "people_sequence"
    )
    private Long id;
    private String name;
    private Integer age;
    private LocalDate dob;
    private String email;

    public People(){

    }

    public People(Long id, 
                String name,
                String email,  
                LocalDate dob,
                Integer age
                ){
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public People(
                String name,
                String email,  
                LocalDate dob,
                Integer age){
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "Person{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", email='"+ email + '\'' +
            ", dob=" + dob +
            ", age="+ age+ 
            '}';
    }
}