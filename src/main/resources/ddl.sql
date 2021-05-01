
create table cases (
                       id integer not null auto_increment,
                       description varchar(255),
                       severity integer,
                       status integer,
                       title varchar(255),
                       user_id integer,
                       primary key (id)
) ;

create table notes (
                       id integer not null auto_increment,
                       details varchar(255),
                       case_id integer,
                       primary key (id)
) ;

create table users (
                       id integer not null auto_increment,
                       email varchar(255),
                       first_name varchar(255),
                       last_name varchar(255),
                       primary key (id)
);

alter table cases
    add constraint FKb6qqw5491l22w6eo9d5xdkgs1
        foreign key (user_id)
            references users (id);


alter table notes
    add constraint FK3a4wjhdh56emab6dtvy6j2nrx
        foreign key (case_id)
            references cases (id);
