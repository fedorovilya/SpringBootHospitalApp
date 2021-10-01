create table treatments
(
    treatment_id integer        not null
        constraint treatments_pkey
            primary key,
    order_id     integer        not null
        constraint treatments_order_id_fkey
            references orders
            on update cascade on delete cascade,
    doctor_id    integer        not null
        constraint treatments_doctor_id_fkey
            references doctors
            on update cascade on delete cascade,
    diagnosis_id integer        not null
        constraint treatments_diagnosis_id_fkey
            references diagnoses
            on update cascade,
    price        numeric(25, 2) not null
        constraint treatments_price_check
            check (price > (0)::numeric)
);

alter table treatments
    owner to postgres;

INSERT INTO public.treatments (treatment_id, order_id, doctor_id, diagnosis_id, price) VALUES (3, 3, 3, 8, 5000.00);
INSERT INTO public.treatments (treatment_id, order_id, doctor_id, diagnosis_id, price) VALUES (5, 5, 6, 2, 2000.00);
INSERT INTO public.treatments (treatment_id, order_id, doctor_id, diagnosis_id, price) VALUES (1, 1, 1, 4, 3000.00);
INSERT INTO public.treatments (treatment_id, order_id, doctor_id, diagnosis_id, price) VALUES (2, 1, 2, 3, 5000.00);
INSERT INTO public.treatments (treatment_id, order_id, doctor_id, diagnosis_id, price) VALUES (4, 4, 4, 7, 2000.00);