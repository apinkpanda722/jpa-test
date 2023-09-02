package com.viceversa.ai.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "TB_PHOTO_GALLERY")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PhotoGallery {

    @Id
    @Column(length = 20, nullable = false, name = "GAL_CONTENT_ID")
    private String galContentId;

    @Column(length = 4, nullable = false, name = "GAL_CONTENT_TYPE_ID")
    private String galContentTypeId;

    @Column(length = 256, nullable = false, name = "GAL_TITLE")
    private String galTitle;

    @Column(length = 512, nullable = false, name = "GAL_WEB_IMAGE_URL")
    private String galWebImageUrl;

    @Column(length = 20, name = "GAL_CREATED_TIME")
    private String galCreatedTime;

    @Column(length = 20, name = "GAL_MODIFIED_TIME")
    private String galModifiedTime;

    @Column(length = 20, name = "GAL_PHOTOGRAPHY_MONTH")
    private String galPhotographyMonth;

    @Column(length = 256, name = "GAL_PHOTOGRAPHY_LOCATION")
    private String galPhotographyLocation;

    @Column(length = 20, name = "GAL_PHOTOGRAPHER")
    private String galPhotographer;

    @Column(length = 256, name = "GAL_SEARCH_KEYWORD")
    private String galSearchKeyword;
}
