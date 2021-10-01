create table doctors
(
    doctor_id           integer generated always as identity
        constraint doctors_pkey
            primary key,
    doctor_specialty_id integer      not null
        constraint doctors_doctor_specialty_id_fkey
            references doctor_specialties
            on update cascade,
    doctor_category_id  integer      not null
        constraint doctors_doctor_category_id_fkey
            references doctor_categories
            on update cascade,
    first_name          varchar(255) not null,
    last_name           varchar(255) not null,
    middle_name         varchar(255)
);

alter table doctors
    owner to postgres;

INSERT INTO public.doctors (doctor_specialty_id, doctor_category_id, first_name, last_name, middle_name) VALUES (4, 1, 'Андрей', 'Савельев', 'Александрович');
INSERT INTO public.doctors (doctor_specialty_id, doctor_category_id, first_name, last_name, middle_name) VALUES (2, 3, 'Юлия', 'Прядко', 'Михайловна');
INSERT INTO public.doctors (doctor_specialty_id, doctor_category_id, first_name, last_name, middle_name) VALUES (3, 2, 'Эвелина', 'Быкова', 'Дмитриевна');
INSERT INTO public.doctors (doctor_specialty_id, doctor_category_id, first_name, last_name, middle_name) VALUES (3, 4, 'Михаил', 'Александров', 'Андреевич');
INSERT INTO public.doctors (doctor_specialty_id, doctor_category_id, first_name, last_name, middle_name) VALUES (1, 3, 'Елизавета', 'Звонкая', 'Михайловна');
INSERT INTO public.doctors (doctor_specialty_id, doctor_category_id, first_name, last_name, middle_name) VALUES (1, 1, 'Михаил', 'Игнатьев', 'Александрович');
INSERT INTO public.doctors (doctor_specialty_id, doctor_category_id, first_name, last_name, middle_name) VALUES (3, 2, 'Дмитрий', 'Михалков', 'Евгеньевич');