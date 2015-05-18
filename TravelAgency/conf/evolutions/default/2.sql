# --- Sample dataset

# --- !Ups

 INSERT INTO depart (city) VALUES ( 'Montreal');
 
 INSERT INTO depart (city) VALUES ( 'Ottawa');
 
 INSERT INTO depart ( city) VALUES ( 'Toronto');
 
INSERT INTO destination (country) VALUES ('Cuba');

INSERT INTO destination (country) VALUES ('Costa Rica');

INSERT INTO destination (country) VALUES ('Mexico');

INSERT INTO hotels (dest_id, category, hotel_name, price_per_week) VALUES (1,3,'Cayo Coco',750.00);
  

 INSERT INTO hotels (dest_id, category, hotel_name, price_per_week) VALUES (1,3,'Cayo Lar ',750.00);
  

 INSERT INTO hotels (dest_id, category, hotel_name, price_per_week)
 VALUES (1,4,'Cienfue s',899.00);
  

 INSERT INTO hotels (dest_id, category, hotel_name, price_per_week)
 VALUES (1,4,'Holguin',925.00);
  

 INSERT INTO hotels (dest_id, category, hotel_name, price_per_week)
 VALUES (1,4,'La Havane',950.00);
  
 INSERT INTO plane (dep_id , dest_id, airline, flight_number, departure_date, flight_price)
VALUES (1,1,'aircanada','ac100',CURDATE(),1984.00);

INSERT INTO plane (dep_id , dest_id, airline, flight_number,
departure_date, flight_price) VALUES (1,2,'cubana','ac200',CURDATE(),1150.00);


INSERT INTO plane (dep_id , dest_id, airline, flight_number,
departure_date, flight_price)
VALUES (3,4,'aircanada','ec200',CURDATE()+14,250.00);
INSERT INTO plane (dep_id , dest_id, airline, flight_number,
departure_date, flight_price)
VALUES (2,5,'aircanada','ec200',CURDATE()+14,422.00);
INSERT INTO plane (dep_id , dest_id, airline, flight_number,
departure_date, flight_price)
VALUES (4,6,'cubana','ec200',CURDATE()+14,950.00);
INSERT INTO plane (dep_id , dest_id, airline, flight_number,
departure_date, flight_price)
VALUES (3,1,'aircanada','ec200',CURDATE()+21,950.00);
INSERT INTO plane (dep_id , dest_id, airline, flight_number,
departure_date, flight_price)
VALUES (3,1,'aircanada','ec200',CURDATE()+21,950.00);
INSERT INTO plane (dep_id , dest_id, airline, flight_number,
departure_date, flight_price)
VALUES (4,1,'cubana','ec200',CURDATE()+21,950.00);
INSERT INTO plane (dep_id , dest_id, airline, flight_number,
departure_date, flight_price)
VALUES (4,6,'aircanada','ec200',CURDATE()+28,950.00);
INSERT INTO plane (dep_id , dest_id, airline, flight_number,
departure_date, flight_price)
VALUES (5,2,'aircanada','ec200',CURDATE()+28,950.00);
INSERT INTO plane (dep_id , dest_id, airline, flight_number,
departure_date, flight_price)
VALUES (6,2,'cubana','ec200',CURDATE()+28,950.00);
 
# --- !Downs

delete from hotels;
delete from depart;
delete from destination;
delete from plane;
