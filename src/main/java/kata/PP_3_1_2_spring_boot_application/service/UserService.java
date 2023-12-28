package kata.PP_3_1_2_spring_boot_application.service;


import kata.PP_3_1_2_spring_boot_application.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void saveOrUpdateUser(User user);
    User getUserById(Long id);
    void deleteUser(User user);
}
