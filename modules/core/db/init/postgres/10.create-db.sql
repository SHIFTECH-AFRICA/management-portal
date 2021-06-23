-- begin MANAGEMENTPORTAL_ATTENDANCE
create table MANAGEMENTPORTAL_ATTENDANCE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    START_TIME timestamp not null,
    GUARD_ID uuid,
    TYPE_ varchar(255) not null,
    DURATION integer not null,
    --
    primary key (ID)
)^
-- end MANAGEMENTPORTAL_ATTENDANCE
-- begin MANAGEMENTPORTAL_SUPPLIER
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
)^
-- end MANAGEMENTPORTAL_SUPPLIER
-- begin MANAGEMENTPORTAL_CLIENT
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
)^
-- end MANAGEMENTPORTAL_CLIENT
-- begin MANAGEMENTPORTAL_GUARD
create table MANAGEMENTPORTAL_GUARD (
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
    POSTED_SECTION varchar(255) not null,
    PHONE_NUMBER integer not null,
    ACTIVE boolean not null,
    --
    primary key (ID)
)^
-- end MANAGEMENTPORTAL_GUARD
-- begin MANAGEMENTPORTAL_PAYMENT
create table MANAGEMENTPORTAL_PAYMENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    AMOUNT double precision not null,
    TRANSACTION_CODE varchar(255) not null,
    PAYMENT_TYPE varchar(255) not null,
    CLIENT_ID uuid,
    GUARD_ID uuid,
    SUPPLIER_ID uuid,
    --
    primary key (ID)
)^
-- end MANAGEMENTPORTAL_PAYMENT
