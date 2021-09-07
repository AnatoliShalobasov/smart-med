CREATE SCHEMA IF NOT EXISTS sm_backend_api;
CREATE TABLE if not exists sm_backend_api.users (
   id bigint NOT NULL,
   msisdn bigint NOT NULL,
   gender varchar NOT NULL,
   birth_day varchar NOT NULL,
   date_created timestamp without time zone NOT NULL,
   date_updated timestamp without time zone NOT NULL
);