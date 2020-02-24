package com.workfront.demo.services.user;

import com.workfront.demo.models.User;
import com.workfront.demo.repositories.UserRepository;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {
    final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUser(Long id) {
        User user = this.userRepository.findById(id).get();
        System.out.println(user);
        return user;
    }
}
