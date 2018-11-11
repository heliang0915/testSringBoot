package com.hl.testSpirngBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hl.testSpirngBoot.domain.User;

public interface UserDao extends JpaRepository<User, Integer> {
}
