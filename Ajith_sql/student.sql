create schema exam;
use exam;
create table Student(
rollno int primary key,
Sname varchar(50),
adress varchar(50),
totalmarks int
);
create table Course(
cid int primary key,
coursename varchar(50),
fees int
);
create table Admission(
rollno int,
cid int,
sem int,
foreign key (rollno) references Student(rollno),
foreign key (cid) references Course(cid),
primary key (rollno,cid)
);

insert into Student values(1,'Arjun','avcsdf',75 );
insert into Student values(2,'rahul','sdsdffd',88);
insert into Student values(3,'john','sdsdffd',78);
insert into Student values(4,'amina','ggdfcfdr',98);
insert into Student values(5,'Gokul','xdrfvtg',99);

insert into Course values(101,'CSE',12000);
insert into Course values(111,'EEE',13000);
insert into Course values(122,'MECH',13000);
insert into Course values(117,'ArCh',14000);
insert into Course values(188,'MCA',15000);

insert into admission values(1,122,1);
insert into Admission values(2,188,1);
insert into Admission values(3,188,1);
insert into Admission values(4,122,1);
insert into Admission values(5,117,1);

select cid,count(*) as no_of_students from admission group by cid;
create view student_view as select* from course where coursename='MCA'(inner join course on course.cid=admission.cid);
select* from student_view;

create view student_view as (select* from admission,course where course.cid=admission.cid and coursename='MCA') ;












