package com.example.mainservice.service;

import com.example.userapi.model.AccountCriteriaFilter;
import com.example.userapi.model.AccountDtoRequest;
import com.example.userapi.model.AccountDtoResponse;
import com.example.userapi.model.PageAccountResponse;
import java.util.UUID;
import org.springframework.http.ResponseEntity;

public interface AccountService {

    ResponseEntity<AccountDtoResponse> createAccount(AccountDtoRequest accountDtoRequest);

    AccountDtoResponse updatePasswordForAccount(UUID id, AccountDtoRequest accountDtoRequest);

    ResponseEntity<PageAccountResponse> getListOfAccountByCriteria(AccountCriteriaFilter filter);

    void deleteAccountById(UUID id);
}
