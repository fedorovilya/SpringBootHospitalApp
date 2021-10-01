create table diagnoses
(
    diagnosis_id integer      not null
        constraint diagnoses_pkey
            primary key,
    diagnosis    varchar(255) not null
);

alter table diagnoses
    owner to postgres;

INSERT INTO public.diagnoses (diagnosis_id, diagnosis) VALUES (2, 'COVID 19');
INSERT INTO public.diagnoses (diagnosis_id, diagnosis) VALUES (3, 'Плоскостопие');
INSERT INTO public.diagnoses (diagnosis_id, diagnosis) VALUES (5, 'Удаление аппендицита');
INSERT INTO public.diagnoses (diagnosis_id, diagnosis) VALUES (6, 'Рак прямой кишки');
INSERT INTO public.diagnoses (diagnosis_id, diagnosis) VALUES (7, 'Бронхит');
INSERT INTO public.diagnoses (diagnosis_id, diagnosis) VALUES (8, 'Конъюнктивит');
INSERT INTO public.diagnoses (diagnosis_id, diagnosis) VALUES (1, 'Инфаркт миокарда');
INSERT INTO public.diagnoses (diagnosis_id, diagnosis) VALUES (4, 'ОРВИ');