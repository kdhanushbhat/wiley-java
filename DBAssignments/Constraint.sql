CREATE TABLE LOCATIONS(
    lid int PRIMARY KEY,
    name varchar(15) NOT NULL,
    country varchar(10) DEFAULT "India",
    pincode int UNIQUE,
    near_to int,
    numberCheck int CHECK (numberCheck>=5),
    FOREIGN KEY (near_to) REFERENCES LOCATIONS(lid)
);