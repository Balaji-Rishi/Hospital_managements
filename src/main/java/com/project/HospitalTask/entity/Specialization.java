package com.project.HospitalTask.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Specialization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    
    public Specialization() {
    }
    
    @Override
	public String toString() {
		return "Specialization [id=" + id + ", name=" + name + "]";
	}

    public Long getId() {
		return id;
	}

	public Specialization(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

    // Getters, Setters, Constructors
}

