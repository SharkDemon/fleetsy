DROP SEQUENCE IF EXISTS organizations_id_seq;

CREATE TABLE organizations (
    id INT NOT NULL PRIMARY KEY,
    name STRING,
    contact STRING,
    email STRING,
    uuid UUID DEFAULT gen_random_uuid()
);
CREATE SEQUENCE organizations_id_seq
    START 100
    INCREMENT 1
    OWNED BY organizations.id;

INSERT INTO organizations (id, name, contact, email) VALUES
(nextval('organizations_id_seq'),'Ferguson Home Repairs','Kevin Summers','kevin.summers@demonhacks.com'),
(nextval('organizations_id_seq'),'Tyson Furniture Delivery','Jennifer Baker','jennifer.baker@demonhacks.com'),
(nextval('organizations_id_seq'),'Airport Number One Rentals','Steven Williams','steven.williams@demonhacks.com'),
(nextval('organizations_id_seq'),'Mortys Ice Cream Trucks','Morty McFrozen','morty.mcfrozen@demonhacks.com'),
(nextval('organizations_id_seq'),'Circus Moving Company','Abel Bailey','abel.bailey@demonhacks.com');
