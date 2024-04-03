--  create database product;
--  use product;
 
--  create table product ( ptid int, pname varchar(30),price decimal(8,2),qtyinstock int,
--  primary key (ptid));

-- create table sale ( saleid int primary key, delivery_address text);

-- create table salesitem (ptid int,saleid int, qty int,
-- primary key (ptid,saleid),
-- foreign key (ptid) references product(ptid),
-- foreign key (saleid) references sale(saleid));

-- create trigger update_available_quantity
-- after insert on salesitem for each row
-- update product
-- set qtyinstock=product.qtyinstock - new.qty
-- where ptid = new.ptid;

select * from product;
insert into salesitem values (1,4,1);