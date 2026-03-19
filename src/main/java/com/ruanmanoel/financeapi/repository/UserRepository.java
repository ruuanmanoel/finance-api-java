package com.ruanmanoel.financeapi.repository;

import com.ruanmanoel.financeapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
