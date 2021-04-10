drop table if exists contact_db cascade;
drop sequence if exists contact_sequence;

create sequence contact_sequence;
create table contact
(
    id                  int8          not null,
    name                varchar(255)  not null,
    mobile_number       varchar(20)   not null,
    primary key (id)
);
