package com.project.GroupProject.Controller;

import com.project.GroupProject.Domain.DTO.CreateFolderRequestDTO;
import com.project.GroupProject.Domain.DTO.CreateFolderResponseDTO;
import com.project.GroupProject.Domain.DTO.DeleteFolderRequestDTO;
import com.project.GroupProject.Domain.DTO.MainPageResponseDTO;
import com.project.GroupProject.Domain.Folder.Folder;
import com.project.GroupProject.Service.FolderService;
import jakarta.persistence.EntityNotFoundException;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@NoArgsConstructor
@RequestMapping("/api/v1/folders")
public class FolderController {
    @Autowired
    private FolderService folderService;

    @GetMapping("/{idx}")
    public ResponseEntity<List<Folder>> getFolders(@PathVariable Long idx) {
        List<Folder> folders = folderService.getFolders(idx);
        return ResponseEntity.ok(folders);
    }

    @PostMapping("/{idx}/create")
    public CreateFolderResponseDTO createFolder(@PathVariable Long idx, @RequestBody CreateFolderRequestDTO dto) {
        return folderService.createFolder(idx, dto);
    }

    @DeleteMapping("/{idx}")
    public ResponseEntity<Void> deleteFolders(@PathVariable Long idx, @RequestBody List<DeleteFolderRequestDTO> dto) {
        folderService.deleteFolders(dto);
        return ResponseEntity.ok().build();
    }
}
