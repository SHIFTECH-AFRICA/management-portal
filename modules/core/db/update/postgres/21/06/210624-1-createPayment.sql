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
);