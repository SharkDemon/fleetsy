DROP SEQUENCE IF EXISTS service_providers_id_seq;

CREATE TABLE service_providers (
    id INT NOT NULL PRIMARY KEY,
    name STRING,
    phone STRING,
    city STRING,
    state STRING,
    zip STRING,
    uuid UUID DEFAULT gen_random_uuid()
);
CREATE SEQUENCE service_providers_id_seq
    START 100
    INCREMENT 1
    OWNED BY service_providers.id;

INSERT INTO service_providers (id, name, phone, city, state, zip) VALUES
(nextval('service_providers_id_seq'),'Mike''s Auto Shop','800-555-1000','Dallas','TX','75214'),
(nextval('service_providers_id_seq'),'Quick Lube','888-555-1212','Addison','TX','75254'),
(nextval('service_providers_id_seq'),'Super Star Service Station','800-555-9312','Addison','TX','75001'),
(nextval('service_providers_id_seq'),'Henderson Toyota Dealer','888-555-3456','Fort Worth','TX','76105'),
(nextval('service_providers_id_seq'),'Speedy Auto Service','800-555-6612','Dallas','TX','75043'),
(nextval('service_providers_id_seq'),'Giddyup Auto Repair','888-555-4459','Fort Worth','TX','76105');
