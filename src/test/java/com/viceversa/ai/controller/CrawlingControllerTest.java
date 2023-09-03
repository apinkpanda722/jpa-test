package com.viceversa.ai.controller;

import com.viceversa.ai.dto.PhotoGalleryDto;
import com.viceversa.ai.service.CrawlingService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CrawlingController.class)
public class CrawlingControllerTest {

    @Autowired
    MockMvc mvc;

    @MockBean
    CrawlingService crawlingService;

    @Test
    @DisplayName("관광사진갤러리 전체 목록 조회 테스트")
    void getPhotoGalleryListTest() throws Exception {
        List<PhotoGalleryDto> photoGalleries = new ArrayList<>();
        photoGalleries.add(PhotoGalleryDto.builder().build());

        given(crawlingService.selectCrawlingData(null)).willReturn(photoGalleries);

        mvc.perform(get("/apis/v1/crawling"))
                .andExpect(status().isOk());
    }
}