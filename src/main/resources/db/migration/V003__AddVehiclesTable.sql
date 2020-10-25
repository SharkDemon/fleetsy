DROP TABLE IF EXISTS vehicles;
CREATE TABLE vehicles (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    org_id UUID NOT NULL,
    color STRING,
    make STRING,
    model STRING,
    vin STRING,
    mileage INT
);
INSERT INTO vehicles (org_id, color, make, model, vin, mileage) VALUES
('0588ae43-c261-49e9-bc17-23473301d444', 'black', 'Toyota', 'Camry',   'AB34G9EJ44B67M12D', 32456),
('0588ae43-c261-49e9-bc17-23473301d444', 'white', 'Honda', 'Civic',    'FGFDKLGHL435345JL', 11359),
('5bd68c79-9fde-4a5a-82a2-291e214bfbb1', 'white', 'Jeep', 'Wrangler',  '34646768LKJJLKJ7L', 99888),
('5bd68c79-9fde-4a5a-82a2-291e214bfbb1', 'blue', 'Jeep', 'Wrangler',   'ASM545M5468912K11', 10455),
('9a6a853d-c0f3-4c3a-ad13-f3e91bd2c476', 'white', 'Honda', 'Civic',    'MSDFKJH435365656K', 8266),
('9a6a853d-c0f3-4c3a-ad13-f3e91bd2c476', 'red', 'Toyota', 'Tundra',    'KJ3H42JH34234KJZM', 23567),
('9a6a853d-c0f3-4c3a-ad13-f3e91bd2c476', 'white', 'Toyota', 'Tundra',  '1223340436L5L65LL', 5767),
('c6d36d29-abb3-47c6-acc7-731de77a7741', 'silver', 'Jeep', 'Cherokee', '245LK3J45LKJJLMMM', 57421),
('c6d36d29-abb3-47c6-acc7-731de77a7741', 'white', 'Toyta', 'Camry',    '98723429874BBF455', 70865),
('c6d36d29-abb3-47c6-acc7-731de77a7741', 'gray', 'Honda', 'Civic',     'M234545HJK565656K', 100234),
('c6d36d29-abb3-47c6-acc7-731de77a7741', 'white', 'Jeep', 'Wrangler',  'JRKJWHERJWHERJK23', 65656),
('f6b6e24f-7b71-4bfc-9216-eb22c9736132', 'gray', 'Workhorse', 'P42',   '234K5JH435JH34343', 89999),
('f6b6e24f-7b71-4bfc-9216-eb22c9736132', 'black', 'Workhorse', 'P42',  '2453K6JH56H1KJHD0', 45455),
('f6b6e24f-7b71-4bfc-9216-eb22c9736132', 'black', 'Workhorse', 'P42',  'SDFJ4543K5H3MDDJJ', 135456),
('f6b6e24f-7b71-4bfc-9216-eb22c9736132', 'white', 'Workhorse', 'P42',  '353KLJ556LKJ5640X', 9922);
