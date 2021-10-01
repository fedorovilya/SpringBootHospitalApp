create table patient_categories
(
    patient_category integer       not null
        constraint patient_categories_pkey
            primary key,
    category_name    varchar(255)  not null,
    discount         numeric(4, 2) not null
        constraint patient_categories_discount_check
            check (discount >= (0)::numeric)
);

alter table patient_categories
    owner to postgres;

INSERT INTO public.patient_categories (patient_category, category_name, discount) VALUES (1, 'Стандарт', 0.00);
INSERT INTO public.patient_categories (patient_category, category_name, discount) VALUES (2, 'Многодетная семья', 10.00);
INSERT INTO public.patient_categories (patient_category, category_name, discount) VALUES (3, 'Ветеран боевых действий', 25.00);
INSERT INTO public.patient_categories (patient_category, category_name, discount) VALUES (4, 'Инвалид', 20.00);