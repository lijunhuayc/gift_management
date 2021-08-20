CREATE DATABASE
    if not EXISTS
    gift_management
    DEFAULT CHARACTER SET utf8mb4;

drop table if exists school;

create table if not exists school
(
    id        integer primary key auto_increment,
    s_name    varchar(64) not null,
    s_address varchar(128) default null,
    province  varchar(16),
    city      varchar(16)
) default charset = utf8mb4 comment ='学校表';



