-- noinspection SqlNoDataSourceInspectionForFile

CREATE TABLE Customer(
 customer_Id NUMBER(20),
 first_Name VARCHAR2(20),
 last_Name VARCHAR2(20),
 email VARCHAR2(50),
 active CHAR(1),
 address_Id NUMBER(20)
 );

 ALTER TABLE Customer ADD(
CONSTRAINT Customer_PK PRIMARY KEY (customer_Id));

CREATE SEQUENCE Customer_seq START WITH 1;

CREATE OR REPLACE TRIGGER Customer_INC
BEFORE INSERT ON Customer
FOR EACH ROW

BEGIN
  SELECT Customer_seq.NEXTVAL
  INTO   :new.customer_Id
  FROM   dual;
END;