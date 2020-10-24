CREATE TABLE service_providers (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name STRING,
    phone STRING,
    city STRING,
    state STRING,
    zip STRING
);
INSERT INTO service_providers (name, phone, city, state, zip) VALUES
('Mike''s Auto Shop','800-555-1000','Dallas','TX','75214'),
('Quick Lube','888-555-1212','Addison','TX','75254'),
('Super Star Service Station','800-555-9312','Addison','TX','75001'),
('Henderson Toyota Dealer','888-555-3456','Fort Worth','TX','76105'),
('Speedy Auto Service','800-555-6612','Dallas','TX','75043'),
('Giddyup Auto Repair','888-555-4459','Fort Worth','TX','76105');
