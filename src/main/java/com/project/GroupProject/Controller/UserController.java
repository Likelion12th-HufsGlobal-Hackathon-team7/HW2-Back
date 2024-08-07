package com.project.GroupProject.Controller;

import com.project.GroupProject.Domain.DTO.LoginRequestDTO;
import com.project.GroupProject.Domain.DTO.LoginResponseDTO;
import com.project.GroupProject.Domain.DTO.RegisterRequestDTO;
import com.project.GroupProject.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
<<<<<<< HEAD
@RequestMapping("/users")
=======
@RequestMapping("api/v1/users")
>>>>>>> 9da23492aff19b42672bf871d6137d05e4f4ebae
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody RegisterRequestDTO dto) {
        userService.registerUser(dto);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    public LoginResponseDTO getUserId(@RequestBody LoginRequestDTO dto) {
        return userService.loginUser(dto);
    }
}
