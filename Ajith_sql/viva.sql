-- create database employee
-- use employee;
-- create table department (dept_n0 int primary key,dept_name varchar(30),location varchar(30))
-- create table employee(emp_no int primary key,emp_name varchar(30),hire_date date,dept_n0 int,
-- salary int, job varchar(30),
-- foreign key (dept_n0) references department(dept_n0))
-- alter table department add column dept_manager varchar(30) not null;
-- insert into department values (201,'finance','pune','Abhishek')
-- insert into department values (202,'booking','surat','Sheik');
-- insert into department values (203,'cash','delhi','Jonathan');
-- insert into department values (204,'research','punjab','Kishore');
-- insert into department values (205,'packing','banglore','Mariya');
-- insert into department values (206,'delivery','goa','Hagrid');
-- insert into employee values (1001,'Ramjith','2003-12-22',203,200000,'clerk');
-- insert into employee values (1002,'Pilly','2021-10-27',205,430000,'tester');
-- insert into employee values (1003,'Rayan','2008-11-05',201,620000,'developer');
-- insert into employee values (1004,'Alisson','2013-04-12',203,350000,'taster');
-- insert into employee values (1005,'Riya','2009-10-20',201,25000,'assistant');
-- insert into employee values (1006,'Tyson','2006-12-25',203,35000,'clerk');
-- insert into employee values (1007,'Reva','2005-12-25',203,450000,'developer');
-- insert into employee values (1008,'Christina','2009-12-24',201,20000,'assistant');

-- select dept_n0,avg(salary) from employee 
-- group by dept_n0
-- having count(dept_n0)>2


-- select dept_name,employee.emp_name,salary from employee
-- inner join department on employee.dept_n0=department.dept_n0
-- inner join(select dept_n0,max(salary) as maximum from employee group by dept_n0)maxsalary
-- on employee.dept_n0=maxsalary.dept_n0 and employee.salary=maxsalary.maximum

select dept_name,employee.emp_name,salary from employee
inner join department on employee.dept_n0=department.dept_n0 
where employee.salary in (select max(salary) from employee group by dept_n0);

-- select job,sum(salary) as total_salary,max(salary) as maximum_salary,
-- min(salary) as minimum_salary,avg(salary) as average_salary from employee group by job