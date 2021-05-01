
    create table cases (
       id integer not null auto_increment,
        description varchar(255),
        severity integer,
        status integer,
        title varchar(255),
        user_id integer,
        primary key (case_id)
    ) type=MyISAM

    create table notes (
       id integer not null auto_increment,
        details varchar(255),
        case_id integer,
        primary key (note_id)
    ) type=MyISAM

    create table users (
       id integer not null auto_increment,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        primary key (user_id)
    ) type=MyISAM

    alter table cases 
       add constraint FKb6qqw5491l22w6eo9d5xdkgs1 
       foreign key (user_id)
       references users (id)


    alter table notes 
       add constraint FK3a4wjhdh56emab6dtvy6j2nrx 
       foreign key (case_id)
       references cases (id)

    create table cases (
       case_id integer not null auto_increment,
        description varchar(255),
        severity integer,
        status integer,
        title varchar(255),
        user_user_id integer,
        primary key (case_id)
    ) type=MyISAM

    create table cases_notes (
       caseeo_case_id integer not null,
        notes_note_id integer not null
    ) type=MyISAM

    create table notes (
       note_id integer not null auto_increment,
        details varchar(255),
        case_eo_case_id integer,
        primary key (note_id)
    ) type=MyISAM

    create table users (
       user_id integer not null auto_increment,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        primary key (user_id)
    ) type=MyISAM

    alter table cases_notes 
       add constraint UK_jxude93uv7di65y5cxjbn952o unique (notes_note_id)

    alter table cases 
       add constraint FKb6qqw5491l22w6eo9d5xdkgs1 
       foreign key (user_user_id) 
       references users (user_id)

    alter table cases_notes 
       add constraint FKno4biwqb7cmbkrojnkrr5ks97 
       foreign key (notes_note_id) 
       references notes (note_id)

    alter table cases_notes 
       add constraint FKmxpijvl345nte0vhnxk4rn5g6 
       foreign key (caseeo_case_id) 
       references cases (case_id)

    alter table notes 
       add constraint FK3a4wjhdh56emab6dtvy6j2nrx 
       foreign key (case_eo_case_id) 
       references cases (case_id)

    create table cases (
       case_id integer not null auto_increment,
        description varchar(255),
        severity integer,
        status integer,
        title varchar(255),
        user_user_id integer,
        primary key (case_id)
    ) type=MyISAM

    create table cases_notes (
       caseeo_case_id integer not null,
        notes_note_id integer not null
    ) type=MyISAM

    create table notes (
       note_id integer not null auto_increment,
        details varchar(255),
        case_eo_case_id integer,
        primary key (note_id)
    ) type=MyISAM

    create table users (
       user_id integer not null auto_increment,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        primary key (user_id)
    ) type=MyISAM

    alter table cases_notes 
       add constraint UK_jxude93uv7di65y5cxjbn952o unique (notes_note_id)

    alter table cases 
       add constraint FKb6qqw5491l22w6eo9d5xdkgs1 
       foreign key (user_user_id) 
       references users (user_id)

    alter table cases_notes 
       add constraint FKno4biwqb7cmbkrojnkrr5ks97 
       foreign key (notes_note_id) 
       references notes (note_id)

    alter table cases_notes 
       add constraint FKmxpijvl345nte0vhnxk4rn5g6 
       foreign key (caseeo_case_id) 
       references cases (case_id)

    alter table notes 
       add constraint FK3a4wjhdh56emab6dtvy6j2nrx 
       foreign key (case_eo_case_id) 
       references cases (case_id)

    create table cases (
       case_id integer not null auto_increment,
        description varchar(255),
        severity integer,
        status integer,
        title varchar(255),
        user_user_id integer,
        primary key (case_id)
    ) type=MyISAM

    create table notes (
       note_id integer not null auto_increment,
        details varchar(255),
        case_eo_case_id integer,
        primary key (note_id)
    ) type=MyISAM

    create table users (
       user_id integer not null auto_increment,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        primary key (user_id)
    ) type=MyISAM

    alter table cases 
       add constraint FKb6qqw5491l22w6eo9d5xdkgs1 
       foreign key (user_user_id) 
       references users (user_id)

    alter table notes 
       add constraint FK3a4wjhdh56emab6dtvy6j2nrx 
       foreign key (case_eo_case_id) 
       references cases (case_id)

    create table cases (
       case_id integer not null auto_increment,
        description varchar(255),
        severity integer,
        status integer,
        title varchar(255),
        user_user_id integer,
        primary key (case_id)
    ) type=MyISAM

    create table notes (
       note_id integer not null auto_increment,
        details varchar(255),
        case_eo_case_id integer,
        primary key (note_id)
    ) type=MyISAM

    create table users (
       user_id integer not null auto_increment,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        primary key (user_id)
    ) type=MyISAM

    alter table cases 
       add constraint FKb6qqw5491l22w6eo9d5xdkgs1 
       foreign key (user_user_id) 
       references users (user_id)

    alter table notes 
       add constraint FK3a4wjhdh56emab6dtvy6j2nrx 
       foreign key (case_eo_case_id) 
       references cases (case_id)

    create table cases (
       case_id integer not null auto_increment,
        description varchar(255),
        severity integer,
        status integer,
        title varchar(255),
        user_user_id integer,
        primary key (case_id)
    ) type=MyISAM

    create table notes (
       note_id integer not null auto_increment,
        details varchar(255),
        case_id integer,
        primary key (note_id)
    ) type=MyISAM

    create table users (
       user_id integer not null auto_increment,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        primary key (user_id)
    ) type=MyISAM

    alter table cases 
       add constraint FKb6qqw5491l22w6eo9d5xdkgs1 
       foreign key (user_user_id) 
       references users (user_id)

    alter table notes 
       add constraint FKl6srtpclqohj9ie3ewear5yu0 
       foreign key (case_id) 
       references cases (case_id)

    create table cases (
       case_id integer not null auto_increment,
        description varchar(255),
        severity integer,
        status integer,
        title varchar(255),
        user_user_id integer,
        primary key (case_id)
    ) type=MyISAM

    create table notes (
       note_id integer not null auto_increment,
        details varchar(255),
        case_id integer,
        primary key (note_id)
    ) type=MyISAM

    create table users (
       user_id integer not null auto_increment,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        primary key (user_id)
    ) type=MyISAM

    alter table cases 
       add constraint FKb6qqw5491l22w6eo9d5xdkgs1 
       foreign key (user_user_id) 
       references users (user_id)

    alter table notes 
       add constraint FKl6srtpclqohj9ie3ewear5yu0 
       foreign key (case_id) 
       references cases (case_id)

    create table cases (
       case_id integer not null auto_increment,
        description varchar(255),
        severity integer,
        status integer,
        title varchar(255),
        user_user_id integer,
        primary key (case_id)
    ) type=MyISAM

    create table notes (
       note_id integer not null auto_increment,
        details varchar(255),
        case_id integer,
        primary key (note_id)
    ) type=MyISAM

    create table users (
       user_id integer not null auto_increment,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        primary key (user_id)
    ) type=MyISAM

    alter table cases 
       add constraint FKb6qqw5491l22w6eo9d5xdkgs1 
       foreign key (user_user_id) 
       references users (user_id)

    alter table notes 
       add constraint FKl6srtpclqohj9ie3ewear5yu0 
       foreign key (case_id) 
       references cases (case_id)
