create table orders
(
    order_id   integer   not null
        constraint orders_pkey
            primary key,
    patient_id integer   not null
        constraint orders_patient_id_fkey
            references patients
            on update cascade on delete cascade,
    datatime   timestamp not null
);

alter table orders
    owner to postgres;

INSERT INTO public.orders (order_id, patient_id, datatime) VALUES (3, 2, '2021-09-28 20:37:38.618872');
INSERT INTO public.orders (order_id, patient_id, datatime) VALUES (5, 4, '2021-09-28 20:37:38.626538');
INSERT INTO public.orders (order_id, patient_id, datatime) VALUES (1, 1, '2021-09-28 21:05:52.837273');
INSERT INTO public.orders (order_id, patient_id, datatime) VALUES (2, 1, '2021-09-28 21:06:31.095436');
INSERT INTO public.orders (order_id, patient_id, datatime) VALUES (4, 3, '2021-09-28 21:06:31.095436');