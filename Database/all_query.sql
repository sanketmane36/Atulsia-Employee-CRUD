create database atulsia_megastores;
use atulsia_megastores;
drop table employee_details;

commit;

CREATE TABLE employee_details (
  employee_id int NOT NULL AUTO_INCREMENT,
  employee_name varchar(50) NOT NULL,
  contact_number varchar(13) NOT NULL,
  email varchar(255) NOT NULL,
  address varchar(255) NOT NULL,
  employee_status int NOT NULL,
  PRIMARY KEY (employee_id)
);

desc employee_details;

CREATE TABLE employee_details (
  employee_id int NOT NULL AUTO_INCREMENT,
  employee_name varchar(50) NOT NULL,
  contact_number varchar(13) NOT NULL,
  email varchar(255) NOT NULL,
  address varchar(255) NOT NULL,
  employee_status int NOT NULL,
 archive_status int NOT NULL,
  PRIMARY KEY (employee_id)
);




insert into employee_details(employee_name,contact_number,email,address,employee_status,archive_status) 
values ('sanket',8451070521,'sanketmane454@gmail.com','chunabhatti-sion',1,0),('shashank',8051848521,'shashank@gmail.com','wadala',1,0),('shashi',8855664455,'shashi@gmail.com','chembur',1,0),('amey',556647788,'amey@gmail.com','lalgauge',1,0);

select * from employee_details;

select * from employee_details where archive_status=1;