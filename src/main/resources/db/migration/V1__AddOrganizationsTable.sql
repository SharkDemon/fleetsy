CREATE TABLE organizations (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name STRING,
    contact STRING,
    email STRING
);
INSERT INTO organizations (name, contact, email) VALUES
('Ferguson Home Repairs','Kevin Summers','kevin.summers@demonhacks.com'),
('Tyson Furniture Delivery','Jennifer Baker','jennifer.baker@demonhacks.com'),
('Airport Number One Rentals','Steven Williams','steven.williams@demonhacks.com'),
('Mortys Ice Cream Trucks','Morty McFrozen','morty.mcfrozen@demonhacks.com'),
('Circus Moving Company','Abel Bailey','abel.bailey@demonhacks.com');
