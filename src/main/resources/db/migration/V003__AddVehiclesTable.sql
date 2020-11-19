DROP SEQUENCE IF EXISTS vehicles_id_seq;
DROP TABLE IF EXISTS vehicles;

CREATE TABLE vehicles (
    id INT NOT NULL PRIMARY KEY,
    org_id INT NOT NULL,
    color STRING,
    make STRING,
    model STRING,
    vin STRING,
    mileage INT,
    uuid UUID DEFAULT gen_random_uuid()
);
CREATE SEQUENCE vehicles_id_seq
    START 1
    INCREMENT 1
    OWNED BY vehicles.id;


INSERT INTO vehicles (id, org_id, color, make, model, vin, mileage) VALUES
(nextval('vehicles_id_seq'),100, 'black', 'Toyota', 'Camry',   'AB34G9EJ44B67M12D', 32456),
(nextval('vehicles_id_seq'),100, 'white', 'Honda', 'Civic',    'FGFDKLGHL435345JL', 11359),
(nextval('vehicles_id_seq'),101, 'white', 'Jeep', 'Wrangler',  '34646768LKJJLKJ7L', 99888),
(nextval('vehicles_id_seq'),101, 'blue', 'Jeep', 'Wrangler',   'ASM545M5468912K11', 10455),
(nextval('vehicles_id_seq'),102, 'white', 'Honda', 'Civic',    'MSDFKJH435365656K', 8266),
(nextval('vehicles_id_seq'),102, 'red', 'Toyota', 'Tundra',    'KJ3H42JH34234KJZM', 23567),
(nextval('vehicles_id_seq'),102, 'white', 'Toyota', 'Tundra',  '1223340436L5L65LL', 5767),
(nextval('vehicles_id_seq'),103, 'silver', 'Jeep', 'Cherokee', '245LK3J45LKJJLMMM', 57421),
(nextval('vehicles_id_seq'),103, 'white', 'Toyta', 'Camry',    '98723429874BBF455', 70865),
(nextval('vehicles_id_seq'),103, 'gray', 'Honda', 'Civic',     'M234545HJK565656K', 100234),
(nextval('vehicles_id_seq'),103, 'white', 'Jeep', 'Wrangler',  'JRKJWHERJWHERJK23', 65656),
(nextval('vehicles_id_seq'),104, 'gray', 'Workhorse', 'P42',   '234K5JH435JH34343', 89999),
(nextval('vehicles_id_seq'),104, 'black', 'Workhorse', 'P42',  '2453K6JH56H1KJHD0', 45455),
(nextval('vehicles_id_seq'),104, 'black', 'Workhorse', 'P42',  'SDFJ4543K5H3MDDJJ', 135456),
(nextval('vehicles_id_seq'),104, 'white', 'Workhorse', 'P42',  '353KLJ556LKJ5640X', 9922);
