-- noinspection SqlNoDataSourceInspectionForFile

CREATE TABLE Country(
    country_Id NUMBER(20),
    country_Name varchar2(20),
    last_Update TIMESTAMP DEFAULT CURRENT_TIMESTAMP
 );

ALTER TABLE Country ADD(
CONSTRAINT Country_PK PRIMARY KEY (country_Id));

CREATE SEQUENCE Country_seq START WITH 1;

CREATE OR REPLACE TRIGGER Country_INC
BEFORE INSERT ON Country
FOR EACH ROW

BEGIN
  SELECT Country_seq.NEXTVAL
  INTO   :new.country_Id
  FROM   dual;
END;