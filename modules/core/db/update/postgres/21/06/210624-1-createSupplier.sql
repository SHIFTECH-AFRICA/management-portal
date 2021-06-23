create table MANAGEMENTPORTAL_SUPPLIER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    EMAIL varchar(255) not null,
    LOCATION varchar(255),
    ACTIVE boolean not null,
    --
    primary key (ID)
);