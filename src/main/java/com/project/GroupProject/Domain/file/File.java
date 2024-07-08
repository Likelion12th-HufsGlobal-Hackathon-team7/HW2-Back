package com.project.GroupProject.Domain.file;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.GroupProject.Domain.Folder.Folder;
import com.project.GroupProject.Domain.User.User;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
@Table(name = "file")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    private Long file_id;
=======
    private Long fileId;
>>>>>>> 9da23492aff19b42672bf871d6137d05e4f4ebae

    @Column(nullable = false)
    private String fileTitle;
    private String fileContent;

    @ManyToOne
    @JoinColumn(name = "Idx")
    @JsonIgnore
    private User user;

    @ManyToOne
    private Folder folder;


}
