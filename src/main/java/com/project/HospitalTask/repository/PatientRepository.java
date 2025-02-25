package com.project.HospitalTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.HospitalTask.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}

