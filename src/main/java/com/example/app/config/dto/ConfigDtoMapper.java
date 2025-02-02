package com.example.app.config.dto;

import com.example.app.config.domain.Config;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface ConfigDtoMapper {

    ConfigDtoMapper INSTANCE = Mappers.getMapper(ConfigDtoMapper.class);

    ConfigDto.Response toResponse(Config config);

    Config toEntity(ConfigDto.Update update);

}
