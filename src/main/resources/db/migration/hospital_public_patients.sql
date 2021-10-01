create table patients
(
    patient_id       integer      not null
        constraint patients_pkey
            primary key,
    patient_category integer      not null
        constraint patients_patient_category_fkey
            references patient_categories,
    first_name       varchar(255) not null,
    last_name        varchar(255) not null,
    middle_name      varchar(255),
    birth_date       date         not null
);

alter table patients
    owner to postgres;

INSERT INTO public.patients (patient_id, patient_category, first_name, last_name, middle_name, birth_date) VALUES (2, 2, 'Дмитрий', 'Попов', 'Егорьевич', '1992-01-22');
INSERT INTO public.patients (patient_id, patient_category, first_name, last_name, middle_name, birth_date) VALUES (4, 3, 'Александр', 'Жданов', 'Михайлович', '1962-10-15');
INSERT INTO public.patients (patient_id, patient_category, first_name, last_name, middle_name, birth_date) VALUES (5, 1, 'Валерия', 'Кузнецова', 'Александровна', '1995-11-08');
INSERT INTO public.patients (patient_id, patient_category, first_name, last_name, middle_name, birth_date) VALUES (1, 1, 'Илья', 'Федоров', 'Владимирович', '1998-07-26');
INSERT INTO public.patients (patient_id, patient_category, first_name, last_name, middle_name, birth_date) VALUES (3, 4, 'Руслан', 'Семенов', 'Андреевич', '1986-04-26');