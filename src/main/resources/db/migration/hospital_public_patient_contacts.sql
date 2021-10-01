create table patient_contacts
(
    patient_contact_id integer      not null
        constraint patient_contacts_pkey
            primary key,
    patient_id         integer      not null
        constraint patient_contacts_patient_id_fkey
            references patients
            on update cascade on delete cascade,
    patient_phone      varchar(255) not null,
    patient_adress     varchar(255),
    patient_email      varchar(255)
        constraint patient_contacts_patient_email_check
            check ((patient_email)::text ~~ '%@%.%'::text)
);

alter table patient_contacts
    owner to postgres;

INSERT INTO public.patient_contacts (patient_contact_id, patient_id, patient_phone, patient_adress, patient_email) VALUES (3, 2, '89627876456', 'Москва, ул.Больничная, д.33, кв.55', 'hello@mail.ru');
INSERT INTO public.patient_contacts (patient_contact_id, patient_id, patient_phone, patient_adress, patient_email) VALUES (5, 4, '89159998877', 'Одинцово, ул. Трубная, д.1, кв.33', 'Odincovo133@gmail.com');
INSERT INTO public.patient_contacts (patient_contact_id, patient_id, patient_phone, patient_adress, patient_email) VALUES (2, 5, '89153729547', 'Химки, ул. 3-я химическая, д.22, кв.1', 'Himik22@yandex.ru');
INSERT INTO public.patient_contacts (patient_contact_id, patient_id, patient_phone, patient_adress, patient_email) VALUES (1, 1, '89163729546', 'Москва, ул. Домашняя, д.10, кв.20', 'ABCD@gmail.com');
INSERT INTO public.patient_contacts (patient_contact_id, patient_id, patient_phone, patient_adress, patient_email) VALUES (4, 3, '89623332211', 'Москва, ул. Больничная, д.11, кв.66', 'ABCD@mail.ru');