package com.project.GroupProject.Domain.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class LoginRequestDTO {
    private String userId;
    private String password;

    public LoginRequestDTO(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }
}
