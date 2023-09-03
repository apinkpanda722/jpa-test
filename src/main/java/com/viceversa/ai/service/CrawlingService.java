package com.viceversa.ai.service;

import com.viceversa.ai.dto.PhotoGalleryDto;
import com.viceversa.ai.Repository.qureydsl.PhotoGalleryRepositoryCustomImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class CrawlingService {

    private final PhotoGalleryRepositoryCustomImpl photoGalleryRepositoryCustomImpl;

    public Page<PhotoGalleryDto> selectCrawlingData(String galTitle, Pageable page) {
        return photoGalleryRepositoryCustomImpl.findAll(galTitle, page);
    }
}
