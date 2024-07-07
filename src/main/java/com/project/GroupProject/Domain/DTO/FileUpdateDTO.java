package com.project.GroupProject.Domain.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class FileUpdateDTO {

    private String fileTitle;
    private String fileContent;


    public FileUpdateDTO(String fileTitle, String fileContent) {
        this.fileTitle = fileTitle;
        this.fileContent = fileContent;
    }

}
