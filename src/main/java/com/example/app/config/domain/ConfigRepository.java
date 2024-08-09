package com.example.app.config.domain;

import com.example.jpa.domain.BaseRepository;

import java.util.Optional;

public interface ConfigRepository extends BaseRepository<Config, Long> {

    Optional<Config> findTopByOrderByIdDesc();

}
