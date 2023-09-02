package com.viceversa.ai.service;

import com.viceversa.ai.Dto.PhotoGalleryDto;
import com.viceversa.ai.Repository.qureydsl.PhotoGalleryRepositoryCustomImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class CrawlingService {

    private final PhotoGalleryRepositoryCustomImpl photoGalleryRepositoryCustomImpl;

    public List<PhotoGalleryDto> selectCrawlingData(String galTitle) {
        return photoGalleryRepositoryCustomImpl.findAll(galTitle);
    }
}
