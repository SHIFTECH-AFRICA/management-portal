create table MANAGEMENTPORTAL_CLIENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255),
    COMPANY varchar(255) not null,
    PHONE_NUMBER varchar(255) not null,
    EMAIL varchar(255) not null,
    ACTIVE boolean not null,
    --
    primary key (ID)
);