package com.handwriting.repository;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.handwriting.entity.User;

@Transactional
public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByUsername(String username);
}
