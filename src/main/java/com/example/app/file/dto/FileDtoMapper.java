package com.example.app.file.dto;

import com.example.app.file.domain.File;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FileDtoMapper {
  FileDtoMapper INSTANCE = Mappers.getMapper(FileDtoMapper.class);

  FileDto.Response toResponse(File file);

  FileDto.CreateMultipartUploadResponse toCreateMultipartUploadResponse(File file);

}
