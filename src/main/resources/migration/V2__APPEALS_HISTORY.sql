CREATE TABLE IF NOT EXISTS appeal_history (
    appeal_id bigint NOT NULL,
    appeal_date varchar NOT NULL,
    user_id bigint NOT NULL,
    appeal_place varchar NOT NULL,
    appeal_clinic_id varchar NOT NULL
);