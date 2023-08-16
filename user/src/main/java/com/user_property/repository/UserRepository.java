package com.user_property.repository;


import com.user_property.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);



}