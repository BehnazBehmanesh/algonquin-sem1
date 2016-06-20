# CST 8282, Fall 2014, Assignment 2, Template
# FileName: ParkDDL.sql
# Author: S Terai
# Date: 15 Cotober 2014
# Modified: 17 Nov 2014, ID's changed to CHAR
# Modified: 15 Jan 2015, DROP TABLE commented

DROP DATABASE IF EXISTS ParkCanada;
CREATE DATABASE ParkCanada;
USE ParkCanada;

# Lookup Table
# DROP TABLE IF EXISTS Province_T;
CREATE TABLE Province_T( 
	Abbreviation 	CHAR( 2 ) NOT NULL,
	Province 		CHAR( 35 ),
    Capital			CHAR( 30 ),
	CONSTRAINT Abbrev_PK PRIMARY KEY( Abbreviation ) );


# Park Table
# DROP TABLE IF EXISTS Park_T;
CREATE TABLE Park_T(
	ParkID 			CHAR( 4 ) NOT NULL, 
	Abbreviation 	CHAR( 2 ) NOT NULL,
	ParkName 		VARCHAR( 45 ),
	CONSTRAINT Park_PK PRIMARY KEY( ParkID ),
    CONSTRAINT Abbrev_FK FOREIGN KEY( Abbreviation ) REFERENCES Province_T( Abbreviation )
);


# Vegetation Table
# DROP TABLE IF EXISTS Vegetation_T;
CREATE TABLE Vegetation_T(
	VegID 			CHAR( 4 ) NOT NULL,
	VegName 		VARCHAR( 45 ),
	CONSTRAINT Vegetation_PK PRIMARY KEY( VegID )
);


# DROP TABLE IF EXISTS ParkVegetation_T;
CREATE TABLE ParkVegetation_T(
	VegID			CHAR( 4 ) NOT NULL,
	ParkID			CHAR( 4 ) NOT NULL,
	CONSTRAINT VegID_FK  FOREIGN KEY( VegID ) REFERENCES Vegetation_T( VegID ),
	CONSTRAINT ParkID_FK  FOREIGN KEY( ParkID ) REFERENCES Park_T( ParkID )
);


# WildLife Table
# DROP TABLE IF EXISTS WaldLife_T;
CREATE TABLE WaldLife_T(
	WLID			CHAR( 4 ) NOT NULL,
	AnimalID		varchar( 45 ),
	CONSTRAINT WLID_PK  PRIMARY KEY( WLID )
);

# DROP TABLE IF EXISTS ParkWildLife_T;
CREATE TABLE ParkWildLife_T(
	WLID			CHAR( 4 ) NOT NULL,
	ParkID			CHAR( 4 ) NOT NULL,
	CONSTRAINT WLID_FK  FOREIGN KEY( WLID ) REFERENCES WaldLife_T( WLID ),
	CONSTRAINT ParknID_FK1  FOREIGN KEY( ParkID ) REFERENCES Park_T( ParkID )
);

# Creating a View of all the parks in Alberta
CREATE VIEW ParkProvince_V AS
SELECT 
ParkName, Abbreviation
FROM 
Park_T
WHERE 
Abbreviation = 'AL';


# Creating a view of Animals with letter a in the name
CREATE VIEW AnimalPark_V AS
SELECT
AnimalID
FROM
WaldLife_T
WHERE 
AnimalID like '%a%';


# Creating Index 
CREATE index ParkID_IDX
ON park_T (ParkID);

CREATE INDEX VegetationID_IDX
ON Vegetation_T(VegID);

CREATE INDEX WildlifeID_IDX
ON WaldLife_T(WLID);

CREATE INDEX ParkwildlifeID_IDX
ON ParkWildLife_T(WLID);

#Btree index
DELETE FROM Park_T WHERE Abbreviation='QC';
DELETE FROM Province_T WHERE Abbreviation='ON';
SHOW INDEX FROM Park_T;

#Left Outer join
SELECT park_t.Abbreviation, Province_t.Abbreviation
FROM Province_t
LEFT OUTER JOIN park_t
ON Province_t.Abbreviation=park_t.Abbreviation;

#Right Outer join
SELECT park_t.Abbreviation, Province_t.Abbreviation
FROM Province_t
Right OUTER JOIN park_t
ON Province_t.Abbreviation=park_t.Abbreviation;




# eof: ParkDDL.sql

