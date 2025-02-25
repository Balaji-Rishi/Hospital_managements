package com.project.HospitalTask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.HospitalTask.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}

