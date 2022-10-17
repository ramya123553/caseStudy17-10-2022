package com.gl.caseStudy4Application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.caseStudy4Application.bean.MyUsers;

@Repository
public interface MyUsersRepository extends JpaRepository<MyUsers, String> {
	Optional<MyUsers> findUserByUsername(String username);
}
