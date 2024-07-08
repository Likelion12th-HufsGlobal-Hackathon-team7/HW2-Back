package com.project.GroupProject.Domain.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class CreateFolderResponseDTO {
    private Long folder_id;


    public CreateFolderResponseDTO(Long folder_id) {
        this.folder_id = folder_id;
    }
}
