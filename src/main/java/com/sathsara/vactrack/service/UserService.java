package com.sathsara.vactrack.service;

import com.sathsara.vactrack.model.User;
import com.sathsara.vactrack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public User registerPatient(User user) {
        if (user.getIdType() == null || user.getIdNumber() == null || user.getIdNumber().isBlank()) {
            throw new IllegalArgumentException("An ID type and ID number are required.");
        }

        if (userRepository.existsByIdNumber(user.getIdNumber())) {
            throw new IllegalArgumentException("A user with this ID number already exists.");
        }

        user.setPasswordHash(passwordEncoder.encode(user.getPasswordHash()));
        user.setRole(User.Role.PATIENT);
        user.setStatus(User.Status.ACTIVE);

        return userRepository.save(user);
    }
}