create table jpa_test.TB_PHOTO_GALLERY
(
    gal_content_id	varchar(20) not null
        primary key,
    gal_content_type_id varchar(4) not null,
    gal_title varchar(256) not null,
    gal_web_image_url varchar(512) not null,
    gal_created_time varchar(20),
    gal_modified_time varchar(20),
    gal_photography_month varchar(20),
    gal_photography_location varchar(256),
    gal_photographer varchar(20),
    gal_search_keyword varchar(256)
);