package com.project.GroupProject.Service;

import com.project.GroupProject.Domain.DTO.LoginRequestDTO;
import com.project.GroupProject.Domain.DTO.LoginResponseDTO;
import com.project.GroupProject.Domain.DTO.RegisterRequestDTO;
import com.project.GroupProject.Domain.User.User;
import com.project.GroupProject.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // 회원가입
    public void registerUser(RegisterRequestDTO dto) {
        User newUser = new User();
        newUser.setUserId(dto.getUserId());
        newUser.setPassword(dto.getPassword());
        userRepository.save(newUser);
    }

    // 로그인
    public LoginResponseDTO loginUser(LoginRequestDTO dto) {
        User selectedUser = userRepository.findByUserIdAndPassword(dto.getUserId(), dto.getPassword());

        if (selectedUser != null) {
            return new LoginResponseDTO(selectedUser.getId());
        } else {
            throw new RuntimeException("존재하지 않는 회원입니다.");
        }
    }
}
