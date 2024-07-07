package com.project.GroupProject.Controller;

import com.project.GroupProject.Domain.DTO.DeleteFolderRequestDTO;
import com.project.GroupProject.Domain.DTO.FileCreateRequestDTO;
import com.project.GroupProject.Domain.DTO.FileCreateResponseDTO;
import com.project.GroupProject.Domain.DTO.FileUpdateDTO;
import com.project.GroupProject.Domain.file.File;
import com.project.GroupProject.Service.FileService;
import com.project.GroupProject.Service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/folders/{idx}/{folder_id}")
public class FileController {

    @Autowired
    private FileService fileService;
    @Autowired
    private FolderService folderService;

    //폴더페이지
    @GetMapping
    public ResponseEntity<List<File>> getFiles(@PathVariable Long idx, @PathVariable Long folder_id) {
        List<File> files = fileService.getFiles(idx);
        return ResponseEntity.ok(files);
    }

    //파일생성
    @PostMapping("/create")
    public FileCreateResponseDTO CreateFile(@PathVariable Long idx, @PathVariable Long folder_id, @RequestBody FileCreateResponseDTO dto) {
        return fileService.createFile(idx, folder_id, dto);
    }


    //파일조회
    @GetMapping("/{file_id}")
    public FileCreateRequestDTO getFileById(@PathVariable Long file_id) {
        return fileService.getFileById(file_id);
    }

    //파일수정
    @PatchMapping("/{file_id}/revise")
    public FileCreateRequestDTO updateFile(@PathVariable Long file_id, @RequestBody FileUpdateDTO fileUpdateDTO) {
        return fileService.updateFile(file_id, fileUpdateDTO);
    }

    //파일삭제
    @DeleteMapping("/{file_id}")
    public ResponseEntity<Void> deleteFile(@PathVariable Long idx, @PathVariable Long file_id, @PathVariable Long folder_id, @RequestBody List<DeleteFolderRequestDTO> dto) {
        folderService.deleteFolders(dto);
        return ResponseEntity.ok().build();
    }
}
