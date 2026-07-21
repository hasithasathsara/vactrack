package com.sathsara.vactrack.repository;

import com.sathsara.vactrack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByNic(String nic);

    boolean existsByNic(String nic);
}