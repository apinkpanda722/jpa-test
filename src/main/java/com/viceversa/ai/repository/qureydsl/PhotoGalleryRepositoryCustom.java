package com.viceversa.ai.repository.qureydsl;

import com.viceversa.ai.dto.PhotoGalleryDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PhotoGalleryRepositoryCustom {

    List<PhotoGalleryDto> findAll(
            String galTitle
    );
}
