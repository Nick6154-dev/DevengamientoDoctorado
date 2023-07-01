package uce.edu.ec.accrualBack.service.entityService.interfaces;


import uce.edu.ec.accrualBack.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Long id);

    User findUserByUsername(String username);

    User save(User user);

    void deleteById(Long id);

    void update(Long id, User user);

}
