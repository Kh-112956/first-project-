package com.example.demo.repositories;

import com.example.demo.entites.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmoloyeeRepository extends JpaRepository<Employee,Integer> {
}
