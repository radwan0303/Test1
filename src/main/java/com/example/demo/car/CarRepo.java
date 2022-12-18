package com.example.demo.car;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<CarModel, Long> {
}
