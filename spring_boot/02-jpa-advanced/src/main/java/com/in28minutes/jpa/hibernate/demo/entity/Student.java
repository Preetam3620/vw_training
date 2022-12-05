package com.in28minutes.jpa.hibernate.demo.entity;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 

@Entity
public  class Student {
 
    @Id
    @GeneratedValue
    private Long id;
    private int rollno;
 
    @Column(nullable = false)
    private String name;
 
    protected Student() {
    }
 
    public Student(String name) {
        this.name = name;
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
    
 
    public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", rollno=" + rollno + ", name=" + name + "]";
	}
	
}