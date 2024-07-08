package com.project.GroupProject.Domain.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class LoginResponseDTO {
    private Long idx;

    public LoginResponseDTO(Long idx) {
        this.idx = idx;
    }
}
