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
);