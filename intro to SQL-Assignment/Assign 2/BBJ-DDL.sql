-- Charm Diamonds Jewelry Store. 
-- Last Edit: 15 Nov 2015

DROP SCHEMA IF EXISTS BBJ;
CREATE SCHEMA BBJ;

USE BBJ;

DROP TABLE IF EXISTS Customer_T;
DROP TABLE IF EXISTS Product_T;
DROP TABLE IF EXISTS Invoice_T;
DROP TABLE IF EXISTS Invoice_item_T;
DROP TABLE IF EXISTS Employee_T;
DROP TABLE IF EXISTS Order_T;
DROP TABLE IF EXISTS Order_item_T;


CREATE TABLE IF NOT EXISTS Customer_T (
    CustomerID INT(11) NOT NULL,
    CustomerName VARCHAR(25) NOT NULL,
    CustomerPhone VARCHAR(30),
    CustomerAddress VARCHAR(30),
    CustomerCity VARCHAR(20),
    CustomerProvince VARCHAR(2),
    CustomerPostalCode VARCHAR(10),
    CustomerSpent INT(30),
    CONSTRAINT Customer_PK PRIMARY KEY (CustomerID)
);

CREATE TABLE IF NOT EXISTS Product_T (
    SkuNum INT(11) NOT NULL,
    Category VARCHAR(20) NOT NULL,
    CaseNum INT(11),
    ReceivingDate DATE,
    Price DECIMAL(12 , 2 ),
    Discount DECIMAL(6 , 2 ),
    Quantity INT(10),
    CONSTRAINT Product_PK PRIMARY KEY (SkuNum)
);

CREATE TABLE IF NOT EXISTS Invoice_T (
    InvoiceNum INT(11) NOT NULL,
    CustomerID INT(11),
    InvoiceDate DATE,
    CONSTRAINT Order_PK PRIMARY KEY (InvoiceNum),
    CONSTRAINT Order_FK1 FOREIGN KEY (CustomerID)
        REFERENCES Customer_T (CustomerID)
);



   
CREATE TABLE IF NOT EXISTS Employee_T (
    JCNum INT(11) NOT NULL,
    EmployeeName VARCHAR(25),
    EmployeeAddress VARCHAR(30),
    EmployeeCity VARCHAR(20),
    EmployeeProvince CHAR(2),
    EmployeeZipCode VARCHAR(10),
    EmployeeDateHired DATE,
    EmployeeBirthDate DATE,
    Comission INT(11),
    WageHourly INT(11),
    WeekHours INT(11),
    CONSTRAINT Employee_PK PRIMARY KEY (JCNum)
);
    
CREATE TABLE IF NOT EXISTS Invoice_Item_T (
    InvoiceNum INT(11) NOT NULL,
    SkuNum INT(11) NOT NULL,
    Price DECIMAL(10 , 2 ),
    Discount DECIMAL(10 , 2 ),
    MOP VARCHAR(10) NOT NULL,
    JCNum INT(11) NOT NULL,
    ProductUnit INT(11) NOT NULL,
    CONSTRAINT Invoice_Item_PK PRIMARY KEY (InvoiceNum , SkuNum),
    CONSTRAINT Invoice_Item_FK1 FOREIGN KEY (InvoiceNum)
        REFERENCES Invoice_T (InvoiceNum),
    CONSTRAINT Invoice_Item_FK2 FOREIGN KEY (SkuNum)
        REFERENCES Product_T (SkuNum),
    CONSTRAINT Order_item_FK3 FOREIGN KEY (JCNum)
        REFERENCES Employee_T (JCNum)
);

CREATE TABLE IF NOT EXISTS Order_T (
    OrderID VARCHAR(20) NOT NULL,
    OrderDate DATE,
    CONSTRAINT Order_T_PK PRIMARY KEY (OrderID)
);


CREATE TABLE IF NOT EXISTS Order_item_T (
    OrderID VARCHAR(20) NOT NULL,
    SkuNum INT(11) NOT NULL,
    Quantity INT(11),
    CONSTRAINT Order_item_PK PRIMARY KEY (OrderID , SkuNum),
    CONSTRAINT Order_item_FK1 FOREIGN KEY (OrderID)
        REFERENCES Order_T (OrderID),
    CONSTRAINT Order_item_FK2 FOREIGN KEY (SkuNum)
        REFERENCES Product_T (SkuNum)
);

CREATE VIEW Employee_Invoice_V AS
    SELECT 
        Invoice_Item_T.Price, Invoice_Item_T.JCNum
    FROM
        Employee_T,
        Invoice_Item_T
    WHERE
        Employee_T.JCNum = Invoice_Item_T.JCNum
            AND Price > 1000;


CREATE VIEW Product_Discount AS
    SELECT 
        SkuNum, Discount
    FROM
        Product_T
    WHERE
        Discount != 0
    ORDER BY SkuNum;
            

#Index 1
CREATE INDEX SkuNum_IDX
ON Product_T(SkuNum);

#Index 2
CREATE INDEX EpmloyeeID_IDX 
ON Employee_T(JCNum);

-- End of DDL File   
