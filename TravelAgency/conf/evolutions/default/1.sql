# --- First database schema, in MySQL

# --- !Ups


create table depart (
  dep_id 	int auto_increment not null,
  city 		longtext NOT NULL,
  primary key (dep_id));
 
create table destination
 (
 dest_id int auto_increment not null,
 country LONGTEXT NOT NULL,
 PRIMARY KEY (dest_id)
 );
 
 CREATE TABLE hotels
 (
 hotel_id int AUTO_INCREMENT not null,
 dest_id int NOT NULL,
 category int NOT NULL,
 hotel_name nvarchar(40) NOT NULL,
 price_per_week DECIMAL(6,2) NOT NULL,
 PRIMARY KEY (hotel_id,dest_id)
 );
 
 CREATE TABLE plane
 (
 plane_id int AUTO_INCREMENT NOT NULL,
 dep_id int NOT NULL,
 dest_id int NOT NULL,
 airline LONGTEXT NOT NULL,
 flight_number nvarchar(10) NOT NULL,
 departure_date date NOT NULL,
 flight_price  DECIMAL(6,2) NOT NULL,
 PRIMARY KEY (plane_id, dep_id,dest_id)
 );

create sequence company_seq start with 1000;

create sequence computer_seq start with 1000;

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists hotels;

drop table if exists depart;

drop table if exists destination;

drop table if exists plane;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists company_seq;

drop sequence if exists computer_seq;

