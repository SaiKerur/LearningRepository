package com.scaler19thdec01.demoapplication01.services;

import com.scaler19thdec01.demoapplication01.models.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long id);

    User createUser(User user);

    User updateUser(Long id, User userDetails);

    void deleteUser(Long id);
}
