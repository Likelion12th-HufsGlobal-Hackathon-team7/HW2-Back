package com.project.GroupProject.Repository;

import com.project.GroupProject.Domain.Folder.Folder;
import com.project.GroupProject.Domain.file.File;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FileRepository extends JpaRepository<File, Long> {
    List<File> findByUserIdx(Long idx);
}
