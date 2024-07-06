package com.project.GroupProject.Domain.User;

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
    @JoinColumn(name="id")
    private User user;
}
