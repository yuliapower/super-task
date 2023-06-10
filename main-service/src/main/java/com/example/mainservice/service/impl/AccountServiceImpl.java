package com.example.mainservice.service.impl;

import com.example.mainservice.client.AccountFeignClient;
import com.example.mainservice.service.AccountService;
import com.example.userapi.model.AccountCriteriaFilter;
import com.example.userapi.model.AccountDtoRequest;
import com.example.userapi.model.AccountDtoResponse;
import com.example.userapi.model.PageAccountResponse;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountFeignClient accountFeignClient;

    @Override
    public ResponseEntity<AccountDtoResponse> createAccount(AccountDtoRequest accountDtoRequest) {

        return accountFeignClient.addAccount(accountDtoRequest);
    }

    @Override
    public AccountDtoResponse updatePasswordForAccount(UUID id,
        AccountDtoRequest accountDtoRequest) {
        return null;
    }

    @Override
    public ResponseEntity<PageAccountResponse> getListOfAccountByCriteria(AccountCriteriaFilter filter) {

        return accountFeignClient.finaAllAccountsByCriteria(filter);
    }

    @Override
    public void deleteAccountById(UUID id) {

    }
}
