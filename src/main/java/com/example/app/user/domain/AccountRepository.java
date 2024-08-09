package com.example.app.user.domain;

import com.example.jpa.domain.BaseRepository;

import java.util.Optional;

public interface AccountRepository extends BaseRepository<Account, Long> {

    Optional<Account> findByUsername(String username);
}
