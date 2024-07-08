package com.project.GroupProject.Domain.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class FileCreateResponseDTO {
    private Long file_id;

    @Getter
    private String fileTitle;

    @Getter
    private String fileContent;

    public FileCreateResponseDTO(Long file_id) {this.file_id = file_id;}

}
