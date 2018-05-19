-- noinspection SqlNoDataSourceInspectionForFile

CREATE TABLE Address(
    address_Id NUMBER,
    address VARCHAR2(50),
    Suburb VARCHAR2(50),
    postal_Code NUMBER(7),
    phoneNo NUMBER(10),
    last_Update TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    city_Id NUMBER(20)
);

ALTER TABLE Address ADD(
CONSTRAINT Address_PK PRIMARY KEY (address_Id));

CREATE SEQUENCE Address_seq START WITH 1;


CREATE OR REPLACE TRIGGER Address_INC
BEFORE INSERT ON Address
FOR EACH ROW

BEGIN
  SELECT Address_seq.NEXTVAL
  INTO   :new.address_Id
  FROM   dual;
END;