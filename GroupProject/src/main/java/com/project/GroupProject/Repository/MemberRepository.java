package com.project.GroupProject.Repository;

import com.project.GroupProject.Domain.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<User, Long> {
}
