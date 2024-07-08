package com.project.GroupProject.Service;

import com.project.GroupProject.Domain.DTO.CreateFolderRequestDTO;
import com.project.GroupProject.Domain.DTO.CreateFolderResponseDTO;
import com.project.GroupProject.Domain.DTO.DeleteFolderRequestDTO;
import com.project.GroupProject.Domain.Folder.Folder;
import com.project.GroupProject.Domain.User.User;
import com.project.GroupProject.Repository.FolderRepository;
import com.project.GroupProject.Repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;
import com.project.GroupProject.Exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@NoArgsConstructor
public class FolderService {
    @Autowired
    private FolderRepository folderRepository;

    @Autowired
    private UserRepository userRepository;

    // 메인 페이지: 유저에 따른 폴더 보여주기
    public List<Folder> getFolders(Long idx) {
        return folderRepository.findByUserIdx(idx);
    }

    // 폴더 생성
    public CreateFolderResponseDTO createFolder(Long idx, CreateFolderRequestDTO dto) {
        User user = userRepository.findByIdx(idx)
                .orElseThrow(()-> new ResourceNotFoundException("해당 유저를 찾을 수 없습니다."));

        Folder newFolder = new Folder();
        newFolder.setFolder_name(dto.getFolder_name());
        newFolder.setUser(user);

        Folder savedFolder = folderRepository.save(newFolder);

        return new CreateFolderResponseDTO(savedFolder.getFolder_id());
    }

    // 폴더 삭제 : folder_id 받아서 삭제하기
    @Transactional
    public void deleteFolders(List<DeleteFolderRequestDTO> dto) {
        for (DeleteFolderRequestDTO request : dto) {
            Long folder_id = request.getFolder_id();
            folderRepository.findById(folder_id)
                    .orElseThrow(() -> new ResourceNotFoundException("해당 폴더를 찾을 수 없습니다."));
            folderRepository.deleteById(folder_id);
        }
    }
}
