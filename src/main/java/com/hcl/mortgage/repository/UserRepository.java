package com.hcl.mortgage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.mortgage.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
