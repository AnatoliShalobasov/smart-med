CREATE TABLE IF NOT EXISTS clinics (
    clinic_id BIGINT NOT NULL,
    clinic_name varchar NOT NULL,
    clinic_address varchar NOT NULL,
    clinic_profile varchar NOT NULL,
    in_pacientc_hospital boolean default false
);