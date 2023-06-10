package com.example.mainservice.service;

import com.example.userapi.model.PageUserResponse;
import com.example.userapi.model.RegistrationUserDTO;
import com.example.userapi.model.UserCriteriaFilter;
import com.example.userapi.model.UserRequestDTOForUpdate;
import com.example.userapi.model.UserResponseDTO;
import java.util.UUID;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<UserResponseDTO> createUser(RegistrationUserDTO registrationUserDTO);

    ResponseEntity<UserResponseDTO> updateUser(UUID uuid,
        UserRequestDTOForUpdate userRequestDTOForUpdate);

    ResponseEntity<PageUserResponse> getListOfAccountByCriteria(UserCriteriaFilter filter);

    void deleteUserById(UUID id);
}
