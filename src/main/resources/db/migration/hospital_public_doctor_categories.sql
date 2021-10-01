create table doctor_categories
(
    doctor_category_id integer      not null
        constraint doctor_categories_pkey
            primary key,
    doctor_category    varchar(255) not null
);

alter table doctor_categories
    owner to postgres;

INSERT INTO public.doctor_categories (doctor_category_id, doctor_category) VALUES (1, 'Врач высшей категории');
INSERT INTO public.doctor_categories (doctor_category_id, doctor_category) VALUES (2, 'Врач первой категории');
INSERT INTO public.doctor_categories (doctor_category_id, doctor_category) VALUES (3, 'Врач второй категории');
INSERT INTO public.doctor_categories (doctor_category_id, doctor_category) VALUES (4, 'Врач без категории');