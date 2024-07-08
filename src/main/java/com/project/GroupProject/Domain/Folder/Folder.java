package com.project.GroupProject.Domain.Folder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.GroupProject.Domain.User.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
@Table(name = "folder")
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long folder_id;

    @Column(nullable = false, length = 100)
    private String folder_name;

    @ManyToOne
    @JoinColumn(name = "idx")
    @JsonIgnore
    private User user;
}
