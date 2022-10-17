package com.gl.caseStudy4Application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gl.caseStudy4Application.bean.MyUsers;
import com.gl.caseStudy4Application.repository.MyUsersRepository;

@Service
public class MyUsersService implements UserDetailsService  {
	
	@Autowired
	private MyUsersRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		
		return repository.findById(username).get();
	}
	public void save(MyUsers users) {
		repository.save(users);
	}
}
