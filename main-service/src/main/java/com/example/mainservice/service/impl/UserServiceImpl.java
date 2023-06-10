package com.example.mainservice.service.impl;

import com.example.mainservice.client.UserFeignClient;
import com.example.mainservice.service.UserService;
import com.example.userapi.model.PageUserResponse;
import com.example.userapi.model.RegistrationUserDTO;
import com.example.userapi.model.UserCriteriaFilter;
import com.example.userapi.model.UserRequestDTOForUpdate;
import com.example.userapi.model.UserResponseDTO;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserFeignClient client;

    @Override
    public ResponseEntity<UserResponseDTO> createUser(RegistrationUserDTO registrationUserDTO) {
        return client.addUser(registrationUserDTO);
    }

    @Override
    public ResponseEntity<UserResponseDTO> updateUser(UUID uuid,
        UserRequestDTOForUpdate userRequestDTOForUpdate) {
        return client.updateUserById(uuid, userRequestDTOForUpdate);
    }

    @Override
    public ResponseEntity<PageUserResponse> getListOfAccountByCriteria(UserCriteriaFilter filter) {
        return client.finaAllUsersByCriteria(filter);
    }

    @Override
    public void deleteUserById(UUID id) {
        client.deleteUserById(id);
    }
}
