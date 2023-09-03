package com.viceversa.ai.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PhotoGalleryDto {

    private String galContentId;

    private String galContentTypeId;

    private String galTitle;

    private String galWebImageUrl;

    private String galCreatedTime;

    private String galModifiedTime;

    private String galPhotographyMonth;

    private String galPhotographyLocation;

    private String galPhotographer;

    private String galSearchKeyword;
}
