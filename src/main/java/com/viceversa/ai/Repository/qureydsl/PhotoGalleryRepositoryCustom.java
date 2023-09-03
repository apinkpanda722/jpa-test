package com.viceversa.ai.Repository.qureydsl;

import com.viceversa.ai.dto.PhotoGalleryDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PhotoGalleryRepositoryCustom {

    Page<PhotoGalleryDto> findAll(
            String galTitle,
            Pageable pageable
    );
}
