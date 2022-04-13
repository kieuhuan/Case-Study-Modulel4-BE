package com.codegym.case_study_m4.repository;

import com.codegym.case_study_m4.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long>  {
    User findByUsername(String username);
}
