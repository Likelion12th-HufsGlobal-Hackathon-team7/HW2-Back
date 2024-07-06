package com.project.GroupProject.Repository;

import com.project.GroupProject.Domain.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findById(Long id);
    User findByUserIdAndPassword(String userId, String password);
}
