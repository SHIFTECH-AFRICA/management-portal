alter table MANAGEMENTPORTAL_ATTENDANCE add constraint FK_MANAGEMENTPORTAL_ATTENDANCE_ON_GUARD foreign key (GUARD_ID) references MANAGEMENTPORTAL_GUARD(ID);
create index IDX_MANAGEMENTPORTAL_ATTENDANCE_ON_GUARD on MANAGEMENTPORTAL_ATTENDANCE (GUARD_ID);
create index IDX_MANAGEMENTPORTAL_ATTENDANCE_TYPE_ on MANAGEMENTPORTAL_ATTENDANCE (TYPE_);
