package com.henrique.taskmanager.repositories;

import com.henrique.taskmanager.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepo extends JpaRepository<User, String> {
    UserDetails findByLogin(String login);
}
