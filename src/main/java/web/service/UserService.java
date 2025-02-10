package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> showUsers();

    User getUser(Long id);

    void addUser(String name, String surname);

    void deleteUser(Long id);

    void updateUser(Long id, String name, String surname);
}