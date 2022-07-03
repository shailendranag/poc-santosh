package com.nag.system.poc.repository;

import com.nag.system.poc.domain.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface userRepository extends JpaRepository<user, Integer> {
}
