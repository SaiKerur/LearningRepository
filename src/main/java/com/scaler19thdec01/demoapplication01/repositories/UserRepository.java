package com.scaler19thdec01.demoapplication01.repositories;

import com.scaler19thdec01.demoapplication01.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
