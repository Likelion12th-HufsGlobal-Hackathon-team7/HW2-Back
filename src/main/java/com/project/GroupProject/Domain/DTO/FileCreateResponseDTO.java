package com.project.GroupProject.Domain.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class FileCreateResponseDTO {
<<<<<<< HEAD
    private Long file_id;
=======
    private Long fileId;
>>>>>>> 9da23492aff19b42672bf871d6137d05e4f4ebae

    @Getter
    private String fileTitle;

    @Getter
    private String fileContent;

<<<<<<< HEAD
    public FileCreateResponseDTO(Long file_id) {this.file_id = file_id;}
=======
    public FileCreateResponseDTO(Long fileId) {this.fileId = fileId;}
>>>>>>> 9da23492aff19b42672bf871d6137d05e4f4ebae

}
