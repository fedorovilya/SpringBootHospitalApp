create table doctor_specialties
(
    doctor_specialty_id integer      not null
        constraint doctor_specialties_pkey
            primary key,
    doctor_specialty    varchar(255) not null
);

alter table doctor_specialties
    owner to postgres;

INSERT INTO public.doctor_specialties (doctor_specialty_id, doctor_specialty) VALUES (1, 'Терапевт');
INSERT INTO public.doctor_specialties (doctor_specialty_id, doctor_specialty) VALUES (2, 'Окулист');
INSERT INTO public.doctor_specialties (doctor_specialty_id, doctor_specialty) VALUES (3, 'ЛОР');
INSERT INTO public.doctor_specialties (doctor_specialty_id, doctor_specialty) VALUES (4, 'Хирург');