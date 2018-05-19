-- noinspection SqlNoDataSourceInspectionForFile

CREATE TABLE City(
    city_Id NUMBER(20),
    city_Name varchar2(20),
    last_Update TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    country_Id NUMBER(20)
 );

ALTER TABLE City ADD(
CONSTRAINT City_PK PRIMARY KEY (city_Id));

CREATE SEQUENCE City_seq START WITH 1;

CREATE OR REPLACE TRIGGER City_INC
BEFORE INSERT ON City
FOR EACH ROW

BEGIN
  SELECT City_seq.NEXTVAL
  INTO   :new.city_Id
  FROM   dual;
END;
