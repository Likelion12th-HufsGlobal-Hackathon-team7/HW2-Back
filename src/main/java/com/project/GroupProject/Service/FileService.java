package com.project.GroupProject.Service;

import com.project.GroupProject.Domain.DTO.FileCreateRequestDTO;
import com.project.GroupProject.Domain.DTO.FileCreateResponseDTO;
import com.project.GroupProject.Domain.DTO.FileUpdateDTO;
import com.project.GroupProject.Domain.Folder.Folder;
import com.project.GroupProject.Domain.User.User;
import com.project.GroupProject.Domain.file.File;
import com.project.GroupProject.Exception.ResourceNotFoundException;
import com.project.GroupProject.Repository.FileRepository;
import com.project.GroupProject.Repository.FolderRepository;
import com.project.GroupProject.Repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class FileService {

    private final FileRepository fileRepository;
    private final UserRepository userRepository;
    private final FolderRepository folderRepository;

    //파일 페이지
    public List<File> getFiles(Long idx) {return fileRepository.findByUserIdx(idx);}

    //파일 생성
    public FileCreateResponseDTO createFile(Long Idx, Long folderIdx, FileCreateResponseDTO dto) {
        User user = userRepository.findById(Idx)
                .orElseThrow(()-> new ResourceNotFoundException("해당 유저를 찾을 수 없습니다."));
        Folder folder = folderRepository.findById(folderIdx)
                .orElseThrow(()-> new ResourceNotFoundException("해당 폴더를 찾을 수 없습니다."));;

        File newFile = new File();
        newFile.setFileTitle(dto.getFileTitle());
        newFile.setFileContent(dto.getFileContent());
        newFile.setFolder(folder);

        File savedFile = fileRepository.save(newFile);

<<<<<<< HEAD
        return new FileCreateResponseDTO(savedFile.getFile_id());
=======
        return new FileCreateResponseDTO(savedFile.getFileId());
>>>>>>> 9da23492aff19b42672bf871d6137d05e4f4ebae
    }

    //파일 조회
    @Transactional
<<<<<<< HEAD
    public FileCreateRequestDTO getFileById(Long file_id) {
        File file = fileRepository.findById(file_id)
                .orElseThrow(() -> new ResourceNotFoundException("해당 파일을 찾을 수 없습니다."));

        return new FileCreateRequestDTO(file.getFile_id(),file.getFileTitle(), file.getFileContent());
=======
    public FileCreateRequestDTO getFileById(Long fileId) {
        File file = fileRepository.findById(fileId)
                .orElseThrow(() -> new ResourceNotFoundException("해당 파일을 찾을 수 없습니다."));

        return new FileCreateRequestDTO(file.getFileId(),file.getFileTitle(), file.getFileContent());
>>>>>>> 9da23492aff19b42672bf871d6137d05e4f4ebae
    }

    //파일 수정
    @Transactional
<<<<<<< HEAD
    public FileCreateRequestDTO updateFile(Long file_id, FileUpdateDTO fileUpdateDTO) {
        File file = fileRepository.findById(file_id)
=======
    public FileCreateRequestDTO updateFile(Long fileId, FileUpdateDTO fileUpdateDTO) {
        File file = fileRepository.findById(fileId)
>>>>>>> 9da23492aff19b42672bf871d6137d05e4f4ebae
                .orElseThrow(() -> new ResourceNotFoundException("해당 파일을 찾을 수 없습니다."));

        file.setFileTitle(fileUpdateDTO.getFileTitle());
        file.setFileContent(fileUpdateDTO.getFileContent());

        File updatedFile = fileRepository.save(file);

<<<<<<< HEAD
        return new FileCreateRequestDTO(updatedFile.getFile_id(), updatedFile.getFileTitle(), updatedFile.getFileContent());
    }

    //파일 삭제
    @Transactional
    public void deleteFile(Long file_id) {
        File file = fileRepository.findById(file_id)
                .orElseThrow(() -> new ResourceNotFoundException("해당 파일을 찾을 수 없습니다."));

        fileRepository.deleteById(file_id);
=======
        return new FileCreateRequestDTO(updatedFile.getFileId(), updatedFile.getFileTitle(), updatedFile.getFileContent());
>>>>>>> 9da23492aff19b42672bf871d6137d05e4f4ebae
    }

}
