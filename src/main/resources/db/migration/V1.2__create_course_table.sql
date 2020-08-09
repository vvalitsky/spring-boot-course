-- Author: Vladislav Valitsky
-- Date: 2020-08-09

-- Step #1: Creating table employee

create table if not exists course.employee
(
    id bigint not null,
    first_name varchar(128) not null,
    last_name varchar(128) not null,
    middle_name varchar(128) not null,
    work_number varchar(128),
    primary key (id)
);

comment on table course.employee is 'Example table for course';
comment on column course.employee.first_name is 'Employee first name';
comment on column course.employee.middle_name is 'Employee middle name';
comment on column course.employee.last_name is 'Employee last name';
comment on column course.employee.work_number is 'Employee work number';