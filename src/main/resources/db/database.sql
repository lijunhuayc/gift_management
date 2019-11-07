CREATE DATABASE
    if not EXISTS
    gift_management
    DEFAULT CHARACTER SET utf8;

create table if not exists school
(
    id             integer primary key auto_increment,
    school_name    varchar(64) not null,
    school_address varchar(128) default null,
    province       varchar(16),
    city           varchar(16)
);



