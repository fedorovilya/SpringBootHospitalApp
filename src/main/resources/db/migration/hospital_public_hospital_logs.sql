create table hospital_logs
(
    order_or_treatment_id integer      not null,
    operation_type        varchar(255) not null,
    log_date              timestamp    not null
);

alter table hospital_logs
    owner to postgres;

INSERT INTO public.hospital_logs (order_or_treatment_id, operation_type, log_date) VALUES (3, 'order added or updated', '2021-09-28 20:37:38.618872');
INSERT INTO public.hospital_logs (order_or_treatment_id, operation_type, log_date) VALUES (5, 'order added or updated', '2021-09-28 20:37:38.626538');
INSERT INTO public.hospital_logs (order_or_treatment_id, operation_type, log_date) VALUES (3, 'treatment added or updated', '2021-09-28 20:37:38.639191');
INSERT INTO public.hospital_logs (order_or_treatment_id, operation_type, log_date) VALUES (5, 'treatment added or updated', '2021-09-28 20:37:38.646557');
INSERT INTO public.hospital_logs (order_or_treatment_id, operation_type, log_date) VALUES (1, 'order added or updated', '2021-09-28 21:05:52.837273');
INSERT INTO public.hospital_logs (order_or_treatment_id, operation_type, log_date) VALUES (2, 'order added or updated', '2021-09-28 21:06:31.095436');
INSERT INTO public.hospital_logs (order_or_treatment_id, operation_type, log_date) VALUES (4, 'order added or updated', '2021-09-28 21:06:31.095436');
INSERT INTO public.hospital_logs (order_or_treatment_id, operation_type, log_date) VALUES (1, 'treatment added or updated', '2021-09-28 21:07:49.477102');
INSERT INTO public.hospital_logs (order_or_treatment_id, operation_type, log_date) VALUES (2, 'treatment added or updated', '2021-09-28 21:07:49.477102');
INSERT INTO public.hospital_logs (order_or_treatment_id, operation_type, log_date) VALUES (4, 'treatment added or updated', '2021-09-28 21:07:49.477102');