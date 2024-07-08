package com.project.GroupProject.Domain.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class FileCreateRequestDTO {
    private String fileTitle;

    public FileCreateRequestDTO(Long fileId, String fileTitle, String fileContent) {this.fileTitle = fileTitle;}
}
