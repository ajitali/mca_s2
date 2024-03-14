-- create database store;
-- use store;
-- create table product (pid int, pname varchar(30), price double,quantity double,
-- primary key(pid));

-- call insert_product(1,"choclate",100,2);
-- call insert_product(1,"rice",0,2);

-- procedure definition.....
-- CREATE DEFINER=`root`@`localhost` PROCEDURE `insert_product`(in barcode int,
-- in pname varchar(30),in price double,in quantity double)
-- BEGIN
-- if(price>0 && quantity >=0)
-- then
-- insert into product values(barcode,pname,price,quantity);
-- end if;
-- END