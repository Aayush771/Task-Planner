package com.sprint.taskpalanner.Service;

import com.sprint.taskpalanner.Entity.User;
import com.sprint.taskpalanner.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {

        Optional<User> opt = userRepository.findById(user.getUserId());

        if (opt.isPresent()) {

            User existingUser = opt.get();

            return userRepository.save(user);
        } else
            throw new ClassCastException("Invalid customer Details..");
    }
}
