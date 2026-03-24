package com.example.task6.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.task6.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User>findByEmail(String email);
}