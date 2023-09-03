package com.viceversa.ai.controller;

import com.viceversa.ai.dto.PhotoGalleryDto;
import com.viceversa.ai.service.CrawlingService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/apis/v1")
public class CrawlingController {

    private final CrawlingService crawlingService;
    @GetMapping("/crawling")
    public List<PhotoGalleryDto> crawlingPhotoGalleryData(
            @RequestParam(value = "galTitle", required = false) String galTitle)
    {
        return crawlingService.selectCrawlingData(galTitle);
    }
}
