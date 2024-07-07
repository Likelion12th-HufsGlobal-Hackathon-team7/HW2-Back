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
    private Long fileId;

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
