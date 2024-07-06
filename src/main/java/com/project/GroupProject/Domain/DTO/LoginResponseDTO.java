package com.project.GroupProject.Domain.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class LoginResponseDTO {
    private Long id;

    public LoginResponseDTO(Long id) {
        this.id = id;
    }
}
