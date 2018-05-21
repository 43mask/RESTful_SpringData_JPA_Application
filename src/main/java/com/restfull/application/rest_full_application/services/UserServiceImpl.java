package com.restfull.application.rest_full_application.services;

import com.restfull.application.rest_full_application.models.User;
import com.restfull.application.rest_full_application.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User findUserById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }


    @Override
    public void save(User user) {
        userRepository.save(user);
    }

}

