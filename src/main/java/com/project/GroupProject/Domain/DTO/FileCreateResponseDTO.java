package com.project.GroupProject.Domain.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class FileCreateResponseDTO {
    private Long fileId;

    @Getter
    private String fileTitle;

    @Getter
    private String fileContent;

    public FileCreateResponseDTO(Long fileId) {this.fileId = fileId;}

}
