package dev.newdate.users.service;

import dev.newdate.users.model.User;

public interface UserService {
    Iterable<User> getUsers();
    User createUser(User user);
    User getUser(String username);
    User login(String username, String password);
    User updateUser(User user);
}
