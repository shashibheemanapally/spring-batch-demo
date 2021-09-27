package com.qwert.springbatchdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qwert.springbatchdemo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
