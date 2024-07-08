package com.project.GroupProject.Repository;

import com.project.GroupProject.Domain.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByIdx(long idx);
    User findByUserIdAndPassword(String userId, String password);
}
