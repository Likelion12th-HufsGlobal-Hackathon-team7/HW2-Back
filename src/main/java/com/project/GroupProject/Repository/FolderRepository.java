package com.project.GroupProject.Repository;

import com.project.GroupProject.Domain.Folder.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findByUserIdx(Long idx);
    Optional<Folder> findById(Long folder_id);
}
