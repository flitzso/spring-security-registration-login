package com.springjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springjava.entity.User;
public interface UserRepository extends JpaRepository<User, Integer> {
    boolean existsByUserName(String userName);
    boolean existsByEmail(String email);
    User findByUserNameOrEmail(String username, String email);
}