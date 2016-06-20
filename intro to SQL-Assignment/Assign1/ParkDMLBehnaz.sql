# CST 8282, Fall 2014, Assignment 2, Template
# FileName: ParkDML.sql 
# Author: S Terai
# Date: 15 October 2014


# Complete data in this TABLE
# all 8 provinces and 3 territories. 
# Provinces and territories are entered in the same field, Province
INSERT INTO Province_T VALUES( 'ON', 'Ontario', 'Toronto' );
INSERT INTO Province_T VALUES( 'QC', 'Quebec', 'Quebec City' );
INSERT INTO Province_T VALUES( 'NL', 'Newfoundland & Labrador', "St John's" );
INSERT INTO Province_T VALUES( 'NS', 'Halifax', 'Halifax' );
INSERT INTO Province_T VALUES( 'NB', 'Fredericton', 'Saint John' );
INSERT INTO Province_T VALUES( 'MB', 'Winnipeg', 'Winnipeg' );
INSERT INTO Province_T VALUES( 'BC', 'Victoria', 'Vancouver' );
INSERT INTO Province_T VALUES( 'PE', 'Charlottetown', 'Charlottetown' );
INSERT INTO Province_T VALUES( 'SK', 'Regina', 'Saskatoon' );
INSERT INTO Province_T VALUES( 'AL', 'Edmonton', 'Calgary' );


# 
INSERT INTO Park_T( ParkID, Abbreviation, ParkName ) VALUES( 'P01', 'ON', 'Bruce Peninsula' );
INSERT INTO Park_T( ParkID, Abbreviation, ParkName ) VALUES( 'P02', 'QC', 'Forillon' );
INSERT INTO Park_T( ParkID, Abbreviation, ParkName ) VALUES( 'P03', 'QC', 'Saugnay' );
INSERT INTO Park_T( ParkID, Abbreviation, ParkName ) VALUES( 'P04', 'AL', 'Jasper' );
INSERT INTO Park_T( ParkID, Abbreviation, ParkName ) VALUES( 'P05', 'NL', 'Auyuittuq' );
INSERT INTO Park_T( ParkID, Abbreviation, ParkName ) VALUES( 'P06', 'AL', 'Banff' );
INSERT INTO Park_T( ParkID, Abbreviation, ParkName ) VALUES( 'P07', 'NS', 'Cape Breton Highlands' );
INSERT INTO Park_T( ParkID, Abbreviation, ParkName ) VALUES( 'P08', 'AL', 'Elk Island' );
INSERT INTO Park_T( ParkID, Abbreviation, ParkName ) VALUES( 'P09', 'AL', 'Ivvavik' );
INSERT INTO Park_T( ParkID, Abbreviation, ParkName ) VALUES( 'P10', 'NB', 'Fundy' );
INSERT INTO Park_T( ParkID, Abbreviation, ParkName ) VALUES( 'P11', 'ON', 'Georgian Bay Islands' );
INSERT INTO Park_T( ParkID, Abbreviation, ParkName ) VALUES( 'P12', 'BC', 'Glacier' );
INSERT INTO Park_T( ParkID, Abbreviation, ParkName ) VALUES( 'P13', 'SK', 'Grasslands' );
INSERT INTO Park_T( ParkID, Abbreviation, ParkName ) VALUES( 'P14', 'NL', 'Gros Morne' );
INSERT INTO Park_T( ParkID, Abbreviation, ParkName ) VALUES( 'P15', 'BC', 'Gulf Islands' );


#
INSERT INTO Vegetation_T( VegID, VegName ) VALUES( 'V01', 'White Spruce' );
INSERT INTO Vegetation_T( VegID, VegName ) VALUES( 'V02', 'Balsam Fir' );
INSERT INTO Vegetation_T( VegID, VegName ) VALUES( 'V03', 'Black Spruce' );
INSERT INTO Vegetation_T( VegID, VegName ) VALUES( 'V04', 'Black Tide' );
INSERT INTO Vegetation_T( VegID, VegName ) VALUES( 'V05', 'Lush Tundra' );
INSERT INTO Vegetation_T( VegID, VegName ) VALUES( 'V06', 'Alpine Meadows' );
INSERT INTO Vegetation_T( VegID, VegName ) VALUES( 'V07', 'White Spruce' );
INSERT INTO Vegetation_T( VegID, VegName ) VALUES( 'V08', 'Trembling Aspen' );
INSERT INTO Vegetation_T( VegID, VegName ) VALUES( 'V09', 'Alpine Tundra' );
INSERT INTO Vegetation_T( VegID, VegName ) VALUES( 'V10', 'Red Spruce' );
INSERT INTO Vegetation_T( VegID, VegName ) VALUES( 'V11', 'White birch' );
INSERT INTO Vegetation_T( VegID, VegName ) VALUES( 'V12', 'Black Spruce' );
INSERT INTO Vegetation_T( VegID, VegName ) VALUES( 'V13', 'Speargrass' );
INSERT INTO Vegetation_T( VegID, VegName ) VALUES( 'V14', 'Sugar Maple' );
INSERT INTO Vegetation_T( VegID, VegName ) VALUES( 'V15', 'Pear Cactus' );

# associative entity
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V01', 'P01' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V01', 'P09' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V02', 'P02' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V02', 'P03' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V02', 'P10' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V03', 'P03' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V03', 'P07' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V04', 'p04' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V05', 'P05' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V05', 'P11' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V05', 'P15' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V06', 'P06' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V06', 'P05' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V06', 'P14' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V06', 'P09' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V07', 'P01' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V07', 'P10' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V08', 'P08' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V09', 'P09' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V09', 'P02' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V10', 'P05' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V10', 'P10' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V11', 'P11' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V11', 'P04' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V11', 'P15' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V12', 'P12' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V13', 'P13' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V13', 'P09' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V14', 'P14' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V15', 'P15' );
INSERT INTO ParkVegetation_T ( VegID, ParkID ) VALUES ( 'V15', 'P01' );


INSERT INTO WaldLife_T( WLID, AnimalID ) VALUES( 'W01', 'Grizzly Bear' );
INSERT INTO WaldLife_T( WLID, AnimalID ) VALUES( 'W02', 'Red Fox' );
INSERT INTO WaldLife_T( WLID, AnimalID ) VALUES( 'W03', 'Gulls' );
INSERT INTO WaldLife_T( WLID, AnimalID ) VALUES( 'W04', 'Razorbill' );
INSERT INTO WaldLife_T( WLID, AnimalID ) VALUES( 'W05', 'Wolf' );
INSERT INTO WaldLife_T( WLID, AnimalID ) VALUES( 'W06', 'Lynx' );
INSERT INTO WaldLife_T( WLID, AnimalID ) VALUES( 'W07', 'Porcupine' );
INSERT INTO WaldLife_T( WLID, AnimalID ) VALUES( 'W08', 'Brown Trout' );
INSERT INTO WaldLife_T( WLID, AnimalID ) VALUES( 'W09', 'Arctic Ground Squirrel' );
INSERT INTO WaldLife_T( WLID, AnimalID ) VALUES( 'W10', 'Beaver' );
INSERT INTO WaldLife_T( WLID, AnimalID ) VALUES( 'W11', 'Musk-Oxen');
INSERT INTO WaldLife_T( WLID, AnimalID ) VALUES( 'W12', 'Black Bear');
INSERT INTO WaldLife_T( WLID, AnimalID ) VALUES( 'W13', 'Moose' );
INSERT INTO WaldLife_T( WLID, AnimalID ) VALUES( 'W14', 'Snowshoe Hare' );
INSERT INTO WaldLife_T( WLID, AnimalID ) VALUES( 'W15', 'Dalls Sheep' );
INSERT INTO WaldLife_T( WLID, AnimalID ) VALUES( 'W16', 'Racoon' );


INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W01', 'P01' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W01', 'P02' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W02', 'P05' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W02', 'P15' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W02', 'P10' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W03', 'P01' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W03', 'P05' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W03', 'P10' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W03', 'P12' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W04', 'P02' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W04', 'P03' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W05', 'P04' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W05', 'P14' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W06', 'P06' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W07', 'P07' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W07', 'P08' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W08', 'P09' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W09', 'P10' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W10', 'P11' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W11', 'P12' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W12', 'P13' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W13', 'P13' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W14', 'P14' );
INSERT INTO ParkWildLife_T (WLID, ParkID) VALUES ( 'W15', 'P15' );

SELECT ParkID, ParkName FROM Park_T
UNION
SELECT WLID, AnimalID FROM WaldLife_T;



#eof: ParkDML.sql