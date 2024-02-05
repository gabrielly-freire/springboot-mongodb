package com.studies.springbootmongodb.services;

import com.studies.springbootmongodb.domain.User;
import com.studies.springbootmongodb.dto.UserDto;
import com.studies.springbootmongodb.repositories.UserRepository;
import com.studies.springbootmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(String id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("User not found"));
    }

    public User insert(User user){
        return userRepository.insert(user);
    }

    public User fromDto(UserDto userDto){
        return new User(userDto.getId(), userDto.getName(), userDto.getName());
    }
}
