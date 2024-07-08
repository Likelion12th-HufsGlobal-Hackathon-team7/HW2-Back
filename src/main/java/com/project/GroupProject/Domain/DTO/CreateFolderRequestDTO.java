package com.project.GroupProject.Domain.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class CreateFolderRequestDTO {
    private String folder_name;

    public CreateFolderRequestDTO(String folder_name) {
        this.folder_name = folder_name;
    }
}
