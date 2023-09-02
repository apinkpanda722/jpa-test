package com.viceversa.ai.Repository;

import com.viceversa.ai.Repository.qureydsl.PhotoGalleryRepositoryCustom;
import com.viceversa.ai.entity.PhotoGallery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoGalleryRepository extends
        JpaRepository<PhotoGallery, String>,
        PhotoGalleryRepositoryCustom {
}
