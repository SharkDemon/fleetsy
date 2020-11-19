DROP SEQUENCE IF EXISTS service_histories_id_seq;
DROP TABLE IF EXISTS service_histories;

CREATE TABLE service_histories (
    id INT NOT NULL PRIMARY KEY,
    vehicle_id INT NOT NULL,
    service_provider_id INT NOT NULL,
    service_date DATE,
    service_desc STRING,
    cost DECIMAL,
    mileage INT,
    uuid UUID DEFAULT gen_random_uuid()
);
CREATE SEQUENCE service_histories_id_seq
    START 100
    INCREMENT 1
    OWNED BY service_histories.id;

INSERT INTO service_histories (id, vehicle_id, service_provider_id, service_date, service_desc, cost, mileage) VALUES
(nextval('service_histories_id_seq'), 1, 100, '2019-10-11', 'Oil change', 80.25, 28456),
(nextval('service_histories_id_seq'), 1, 101, '2020-10-16', 'Oil change', 96.75, 30450),
(nextval('service_histories_id_seq'), 2, 100, '2017-03-04', 'Oil change', 100, 500),
(nextval('service_histories_id_seq'), 2, 102, '2018-09-10', 'Oil change', 80, 1500),
(nextval('service_histories_id_seq'), 2, 103, '2019-01-02', 'Oil change', 90, 3500),
(nextval('service_histories_id_seq'), 3, 100, '2019-11-12', 'Oil change', 109.82, 526),
(nextval('service_histories_id_seq'), 3, 103, '2020-03-04', 'Oil change', 87.88, 1299),
(nextval('service_histories_id_seq'), 4, 101, '2016-05-05', 'Oil change', 50.50, 0),
(nextval('service_histories_id_seq'), 4, 100, '2019-11-01', 'Replace windshield', 209.99, 0),
(nextval('service_histories_id_seq'), 5, 100, '2018-03-19', 'Oil change', 50, 150),
(nextval('service_histories_id_seq'), 5, 102, '2018-04-27', 'A/C repair', 60, 950),
(nextval('service_histories_id_seq'), 5, 101, '2019-11-29', 'Oil change', 70, 1200),
(nextval('service_histories_id_seq'), 6, 102, '2017-01-01', 'Replace front left tire', 120, 500),
(nextval('service_histories_id_seq'), 6, 104, '2018-03-04', 'Oil change', 80, 8000),
(nextval('service_histories_id_seq'), 7, 100, '2015-11-12', 'Replace front brakes', 90, 100),
(nextval('service_histories_id_seq'), 7, 100, '2016-11-12', 'Repair windshield', 90, 300),
(nextval('service_histories_id_seq'), 7, 104, '2019-03-09', 'Oil change', 95, 900),
(nextval('service_histories_id_seq'), 8, 100, '2020-01-01', 'Oil change', 87.88, 500),
(nextval('service_histories_id_seq'), 8, 105, '2020-02-02', 'A/C repair', 220, 6005),
(nextval('service_histories_id_seq'), 9, 102, '2019-07-17', 'Oil change', 54, 1000),
(nextval('service_histories_id_seq'), 9, 105, '2020-06-05', 'Repair catalytic converter', 585, 3000),
(nextval('service_histories_id_seq'),10, 105, '2019-03-30', 'Replace all tires', 800, 250),
(nextval('service_histories_id_seq'),10, 102, '2019-06-30', 'Oil change', 90, 500),
(nextval('service_histories_id_seq'),11, 102, '2018-08-10', 'Oil change', 90, 1650),
(nextval('service_histories_id_seq'),12, 102, '2017-03-11', 'Oil change', 90, 1550),
(nextval('service_histories_id_seq'),13, 102, '2020-04-12', 'Oil change', 90, 1200),
(nextval('service_histories_id_seq'),14, 102, '2015-06-17', 'Oil change', 90, 1300),
(nextval('service_histories_id_seq'),15, 102, '2013-05-29', 'Oil change', 90, 1500);
