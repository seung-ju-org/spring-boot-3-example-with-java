package com.example.app.config.service;

import com.example.app.config.domain.Config;
import com.example.app.config.domain.ConfigRepository;
import com.example.app.config.dto.ConfigDto;
import com.example.app.config.dto.ConfigDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ConfigService {

    private final ConfigRepository configRepository;

    @Transactional(readOnly = true)
    public ConfigDto.Response get() {
        Config config = this.configRepository.findTopByOrderByIdDesc().orElseGet(Config::new);
        return ConfigDtoMapper.INSTANCE.toResponse(config);
    }

    @Transactional
    public ConfigDto.Response update(ConfigDto.Update request) {
        Config config = ConfigDtoMapper.INSTANCE.toEntity(request);
        config = configRepository.save(config);
        return ConfigDtoMapper.INSTANCE.toResponse(config);
    }

}
