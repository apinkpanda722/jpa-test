package com.viceversa.ai.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/apis/v1")
public class CrawlingController {

    @GetMapping("/crawling")
    public void crawlingPhotoGalleryData(HttpServletRequest request) {

    }
}
