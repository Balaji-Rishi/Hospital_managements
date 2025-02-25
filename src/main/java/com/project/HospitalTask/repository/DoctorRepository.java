package com.project.HospitalTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.HospitalTask.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}

