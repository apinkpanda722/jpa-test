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
    @Column(length = 20, nullable = false, name = "gal_content_id")
    private String galContentId;

    @Column(length = 4, nullable = false, name = "gal_content_type_id")
    private String galContentTypeId;

    @Column(length = 256, nullable = false, name = "gal_title")
    private String galTitle;

    @Column(length = 512, nullable = false, name = "gal_web_image_url")
    private String galWebImageUrl;

    @Column(length = 20, name = "gal_created_time")
    private String galCreatedTime;

    @Column(length = 20, name = "gal_modified_time")
    private String galModifiedTime;

    @Column(length = 20, name = "gal_photography_month")
    private String galPhotographyMonth;

    @Column(length = 256, name = "gal_photography_location")
    private String galPhotographyLocation;

    @Column(length = 20, name = "gal_photographer")
    private String galPhotographer;

    @Column(length = 256, name = "gal_search_keyword")
    private String galSearchKeyword;
}
