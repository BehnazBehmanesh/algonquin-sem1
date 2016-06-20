-- Filename: BBJ-DML.sql
-- Last Modified: 06-11-2015  

-- populate Customer_T
#TRUNCATE TABLE Customer_T;

INSERT INTO Customer_T (CustomerID, CustomerName, CustomerPhone, CustomerAddress, CustomerCity, CustomerProvince, CustomerPostalCode, CustomerSpent)
VALUES  (1, 'Jacob Fren', '6138259632', '206 Richmond', 'Ottawa', 'ON', 'K1J3O5' , 2500.00);
INSERT INTO Customer_T (CustomerID, CustomerName, CustomerPhone, CustomerAddress, CustomerCity, CustomerProvince, CustomerPostalCode, CustomerSpent)
VALUES  (2, 'Behnaz Behmanesh', '6137001202' , '2001 Carling', 'Ottawa', 'ON', 'K2A3W5' , 150.00);
INSERT INTO Customer_T (CustomerID, CustomerName, CustomerPhone, CustomerAddress, CustomerCity, CustomerProvince, CustomerPostalCode, CustomerSpent)
VALUES  (3, 'Reza Deison', '6135011362', '150 Ambleside', 'Ottawa', 'ON', 'J2S6J9' , 1388.00);
INSERT INTO Customer_T (CustomerID, CustomerName, CustomerPhone, CustomerAddress, CustomerCity, CustomerProvince, CustomerPostalCode, CustomerSpent)
VALUES  (4, 'Holly Matson','6138445636',  '44 Prince of Wales', 'Ottawa', 'ON', 'J6D8G2' , 1550.00);
INSERT INTO Customer_T (CustomerID, CustomerName, CustomerPhone, CustomerAddress, CustomerCity, CustomerProvince, CustomerPostalCode, CustomerSpent)
VALUES  (5, 'Susan boil', '6135698741', '105 Bradley', 'Smithsfall', 'ON', 'G6F1B6' , 10100.50);
INSERT INTO Customer_T (CustomerID, CustomerName, CustomerPhone, CustomerAddress, CustomerCity, CustomerProvince, CustomerPostalCode, CustomerSpent)
VALUES  (6, 'Susan Boil', '5148691456', '122 west', 'Vancouver', 'BC', 'T2F3D6' , 12000.00);
INSERT INTO Customer_T (CustomerID, CustomerName, CustomerPhone, CustomerAddress, CustomerCity, CustomerProvince, CustomerPostalCode, CustomerSpent)
VALUES  (7, 'Jason Hickmann', '8198774562', '89 Castle Rd', 'Gatineau', 'QC', 'J2B6L7' , 7800.00);
INSERT INTO Customer_T (CustomerID, CustomerName, CustomerPhone, CustomerAddress, CustomerCity, CustomerProvince, CustomerPostalCode, CustomerSpent)
VALUES  (8, 'Mike Ritz','6135891456', '588 Maitland', 'Ottawa', 'ON', 'L4P6K3' , 140.00);
INSERT INTO Customer_T (CustomerID, CustomerName, CustomerPhone, CustomerAddress, CustomerCity, CustomerProvince, CustomerPostalCode, CustomerSpent)
VALUES  (9, 'Sahar Karimi', '6137894563', '236 Baseline', 'Ottawa', 'ON', 'K5F6I3' , 6200.00);
INSERT INTO Customer_T (CustomerID, CustomerName, CustomerPhone, CustomerAddress, CustomerCity, CustomerProvince, CustomerPostalCode, CustomerSpent)
VALUES  (10, 'Allison Grow', '6132583691', '156 Sussex', 'Ottawa', 'ON', 'J2M6L3' , 1950.00);


-- Populate Product_T
#TRUNCATE TABLE Product_T;
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (961, 'Repair', 96 , '0/0/0', 40.00, 0, 1);
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (962, 'Repair', 96, '0/0/0', 65.00, 0, 1);
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (963, 'Repair', 96, '0/0/0', 0, 0, 1);
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (964, 'Repair', 96, '0/0/0', 0, 0, 1);
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (965, 'Repair', 96, '0/0/0', 55.00, 0, 1);
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (966, 'Repair', 96, '0/0/0', 30.00, 0, 1);
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (967, 'Repair', 96, '0/0/0', 75.00, 0, 1);
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (1126259, 'Bridal Set', 104, '2014/10/02', 12798.00, 0, 1);
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (1130713, 'Bridal Set', 104 , '2015/05/06', 9498.00, 0, 2);
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (1094515, 'Solitaire', 134, '2013/04/03', 8999.00, 0, 4);
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (1111286, 'Wedding Band', 114,'2015/12/05', 3850.00, 1270.00, 4);
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (1114637, 'Halo', 104, '2015/04/25', 5098.00, 500.00, 2);
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (1078547, 'Three Stone', 180, '2015/09/01', 4999.00, 500.00, 2);
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (1110989, 'Bracelet', 115, '2014/06/15', 2999.00, 500.00, 1);
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (1123772, 'Men', 115, '2013/02/22', 899.99, 0, 3);
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (1117399, 'Pendant', 120, '2014/10/23', 2499.00, 200.00, 2);
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (1130332, 'Cross', 120, '2015/10/22', 1599.00, 0, 2);
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (1106015, 'Swarovski', 80, '2015/06/05', 145.00, 0, 1);
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (1135953, 'Bella Moda', 112, '2015/11/10', 379.99, 0, 3);
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (123, 'ESP', 0 ,  '0/0/0' , 24.99, 0, 1);
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (124, 'ESP', 0 , '0/0/0' , 39.99, 0, 1);
INSERT INTO Product_T  (SkuNum, Category, CaseNum, ReceivingDate, Price, Discount, Quantity)
VALUES  (125, 'ESP', 0 , '0/0/0' , 79.99, 0, 1);


-- Invoice Invoice_T
#TRUNCATE TABLE Invoice_T;
INSERT INTO Invoice_T (InvoiceNum, CustomerID, InvoiceDate)
VALUES (450724964, 3, '2014/10/05');
INSERT INTO Invoice_T (InvoiceNum, CustomerID, InvoiceDate)
VALUES (450784955, 1, '2015/06/02');
INSERT INTO Invoice_T (InvoiceNum, CustomerID, InvoiceDate)
VALUES (450223642, 10, '2013/03/23');
INSERT INTO Invoice_T (InvoiceNum, CustomerID, InvoiceDate)
VALUES (450213546, 2, '2014/10/13');
INSERT INTO Invoice_T (InvoiceNum, CustomerID, InvoiceDate)
VALUES (450445265, 3, '2015/05/11');
INSERT INTO Invoice_T (InvoiceNum, CustomerID, InvoiceDate)
VALUES (450989651, 5, '2014/09/16');
INSERT INTO Invoice_T (InvoiceNum, CustomerID, InvoiceDate)
VALUES (450787984, 8, '2015/09/13');
INSERT INTO Invoice_T (InvoiceNum, CustomerID, InvoiceDate)
VALUES (450468235, 4, '2014/05/10');
INSERT INTO Invoice_T (InvoiceNum, CustomerID, InvoiceDate)
VALUES (450952669, 7, '2015/07/18');
INSERT INTO Invoice_T (InvoiceNum, CustomerID, InvoiceDate)
VALUES (450124954, 8, '2015/08/13');
INSERT INTO Invoice_T (InvoiceNum, CustomerID, InvoiceDate)
VALUES (450669554, 6, '2014/05/12');
INSERT INTO Invoice_T (InvoiceNum, CustomerID, InvoiceDate)
VALUES (450121654, 9, '2015/11/11');
INSERT INTO Invoice_T (InvoiceNum, CustomerID, InvoiceDate)
VALUES (450789226, 10, '2013/06/26');
INSERT INTO Invoice_T (InvoiceNum, CustomerID, InvoiceDate)
VALUES (450222665, 2, '2015/02/12');

-- Populate Employee_T
#TRUNCATE TABLE Employee_T;
INSERT INTO Employee_T  
(JCNum, EmployeeName, EmployeeAddress, EmployeeCity, EmployeeProvince, EmployeeZipCode, EmployeeDateHired, EmployeeBirthDate, Comission, WageHourly, WeekHours)
VALUES  
('3711', 'Behnaz Behmanesh', '2001 Carling Ave.', 'Ottawa', 'ON','K2A3W5', '2015/06/01', '1985/05/13', 2, 12, 20);

INSERT INTO Employee_T  
(JCNum, EmployeeName, EmployeeAddress, EmployeeCity, EmployeeProvince, EmployeeZipCode, EmployeeDateHired, EmployeeBirthDate, Comission, WageHourly, WeekHours)
VALUES  
('3714', 'Rachel Jhonson', '144 Blanch', 'Gatineau', 'QC', 'J5G6R2', '2015/02/01', '1988/11/15', 2, 12, 15);

INSERT INTO Employee_T  
(JCNum, EmployeeName, EmployeeAddress, EmployeeCity, EmployeeProvince, EmployeeZipCode, EmployeeDateHired, EmployeeBirthDate, Comission, WageHourly, WeekHours)
VALUES  
('6558', 'Brenda Lee', '655 Prince of Wales', 'Ottawa', 'ON','K6O9P4', '2015/04/01', '1956/08/04', 3, 14, 40);

INSERT INTO Employee_T  
(JCNum, EmployeeName, EmployeeAddress, EmployeeCity, EmployeeProvince, EmployeeZipCode, EmployeeDateHired, EmployeeBirthDate, Comission, WageHourly, WeekHours)
VALUES  
('3777', 'Izabela Traus', 'Gatineau', 'Gatineau', 'QC','J6O9D4', '2011/06/01', '1960/05/14', 1, 12, 10);

INSERT INTO Employee_T  
(JCNum, EmployeeName, EmployeeAddress, EmployeeCity, EmployeeProvince, EmployeeZipCode, EmployeeDateHired, EmployeeBirthDate, Comission, WageHourly, WeekHours)
VALUES  
('5669', 'John Tran', '122 Richmond Rd.', 'Ottawa', 'ON','K6L7F6', '2015/10/15', '1990/06/12', 1, 11.5, 30);

INSERT INTO Employee_T  
(JCNum, EmployeeName, EmployeeAddress, EmployeeCity, EmployeeProvince, EmployeeZipCode, EmployeeDateHired, EmployeeBirthDate, Comission, WageHourly, WeekHours)
VALUES  
('2998', 'Cecilia Lopez', '199 West Rd.', 'Ottawa', 'ON','T8U6I1', '2015/04/20', '1995/11/30', 1, 12, 35);

INSERT INTO Employee_T  
(JCNum, EmployeeName, EmployeeAddress, EmployeeCity, EmployeeProvince, EmployeeZipCode, EmployeeDateHired, EmployeeBirthDate, Comission, WageHourly, WeekHours)
VALUES  
('3410', 'Allison Grow', '156 East Rd.', 'Ottawa', 'ON','K6L5H1', '2015/10/01', '1982/10/11', 1, 12, 35);


-- Invoice_item_T
#TRUNCATE TABLE Invoice_item_T
INSERT INTO Invoice_item_T (InvoiceNum, SkuNum, Price, Discount, MOP, JCNum, ProductUnit)
Values (450724964, 1094515, 8999.00, 0, 'Debit', 3711, 1);
INSERT INTO Invoice_item_T (InvoiceNum, SkuNum, Price, Discount, MOP, JCNum, ProductUnit)
Values (450724964, 125, 79.99, 0, 'Debit', 3711, 1);
INSERT INTO Invoice_item_T (InvoiceNum, SkuNum, Price, Discount, MOP, JCNum, ProductUnit)
Values (450784955, 1117399, 2499.00, 200.00, 'Visa', 6558, 2);
INSERT INTO Invoice_item_T (InvoiceNum, SkuNum, Price, Discount, MOP, JCNum, ProductUnit)
Values (450223642, 1135953, 379.99, 0 , 'MasterCard', 3714 , 1 );
INSERT INTO Invoice_item_T (InvoiceNum, SkuNum, Price, Discount, MOP, JCNum, ProductUnit)
Values (450223642, 1123772 , 899.99 , 0 , ' Cash', 3777 , 3 );
INSERT INTO Invoice_item_T (InvoiceNum, SkuNum, Price, Discount, MOP, JCNum, ProductUnit)
Values (450223642, 1114637 ,  5098.00 , 500.00 , 'Store Card', 5669 , 1);
INSERT INTO Invoice_item_T (InvoiceNum, SkuNum, Price, Discount, MOP, JCNum, ProductUnit)
Values (450213546, 1126259 , 12798.00 , 0 , 'Visa', 3711 , 1 );
INSERT INTO Invoice_item_T (InvoiceNum, SkuNum, Price, Discount, MOP, JCNum, ProductUnit)
Values (450213546, 961 , 40.00 , 0, 'Visa', 3711 , 1 );
INSERT INTO Invoice_item_T (InvoiceNum, SkuNum, Price, Discount, MOP, JCNum, ProductUnit)
Values (450445265, 1130332 , 1599 , 0 , 'Store Card', 2998 , 1 );
INSERT INTO Invoice_item_T (InvoiceNum, SkuNum, Price, Discount, MOP, JCNum, ProductUnit)
Values (450445265 , 125, 79.99 , 0, 'Store Card', 2998, 1);
INSERT INTO Invoice_item_T (InvoiceNum, SkuNum, Price, Discount, MOP, JCNum, ProductUnit)
Values (450989651 , 1106015, 145.00, 0, 'Amex', 3410, 3);
INSERT INTO Invoice_item_T (InvoiceNum, SkuNum, Price, Discount, MOP, JCNum, ProductUnit)
Values (450989651 , 963, 0, 0, 'Amex', 3410, 1);
INSERT INTO Invoice_item_T (InvoiceNum, SkuNum, Price, Discount, MOP, JCNum, ProductUnit)
Values (450787984 , 1110989, 2999.00, 500.00, 'MasterCard', 3711, 1);
INSERT INTO Invoice_item_T (InvoiceNum, SkuNum, Price, Discount, MOP, JCNum, ProductUnit)
Values (450468235 , 1111286, 3850.00, 1270.00, 'Debit', 6558, 1);
INSERT INTO Invoice_item_T (InvoiceNum, SkuNum, Price, Discount, MOP, JCNum, ProductUnit)
Values (450952669 , 1123772, 899.99, 0, 'Visa', 3714, 2);
INSERT INTO Invoice_item_T (InvoiceNum, SkuNum, Price, Discount, MOP, JCNum, ProductUnit)
Values (450124954, 1111286, 3850.00, 1270.00, 'Visa', 3711, 1);
INSERT INTO Invoice_item_T (InvoiceNum, SkuNum, Price, Discount, MOP, JCNum, ProductUnit)
Values (450669554 , 125, 79.99, 0, 'Visa', 3711, 1);
INSERT INTO Invoice_item_T (InvoiceNum, SkuNum, Price, Discount, MOP, JCNum, ProductUnit)
Values (450124954, 967, 75.00, 0, 'Visa', 3711, 1);
INSERT INTO Invoice_item_T (InvoiceNum, SkuNum, Price, Discount, MOP, JCNum, ProductUnit)
Values (450121654 , 1135953, 379.99, 0, 'Cash', 5669, 1);
INSERT INTO Invoice_item_T (InvoiceNum, SkuNum, Price, Discount, MOP, JCNum, ProductUnit)
Values (450789226, 1114637, 5098.00, 500.00, 'Debit', 3777 , 1);
INSERT INTO Invoice_item_T (InvoiceNum, SkuNum, Price, Discount, MOP, JCNum, ProductUnit)
Values (450222665 , 1135953, 379.99, 0, 'MasterCard', 3711, 1);


-- Populate Order_T
#TRUNCATE TABLE Order_T;
INSERT INTO Order_T (OrderID, OrderDate)
values ('148-6523', '2014/10/05');
INSERT INTO Order_T (OrderID, OrderDate)
values ('123-3645', '2015/06/12');
INSERT INTO Order_T (OrderID, OrderDate)
values ('126-9658', '2015/11/05');
INSERT INTO Order_T (OrderID, OrderDate)
values ('985-1266', '2014/12/25');
INSERT INTO Order_T (OrderID, OrderDate)
values ('982-1456', '2015/06/15');
INSERT INTO Order_T (OrderID, OrderDate)
values ('985-2556', '2015/10/17');
INSERT INTO Order_T (OrderID, OrderDate)
values ('958-6521', '2014/09/25');
INSERT INTO Order_T (OrderID, OrderDate)
values ('365-0232', '2015/04/28');
INSERT INTO Order_T (OrderID, OrderDate)
values ('136-4682', '2015/06/30');
INSERT INTO Order_T (OrderID, OrderDate)
values ('985-5123', '2015/10/18');
INSERT INTO Order_T (OrderID, OrderDate)
values ('865-0256', '2015/04/16');

-- Populate Order_item_T
#TRUNCATE TABLE Order_item_T;
INSERT INTO Order_item_T (OrderID, SkuNum, Quantity)
values ('148-6523', 1126259, 2);
INSERT INTO Order_item_T (OrderID, SkuNum, Quantity)
values ('148-6523', 1130713, 5);
INSERT INTO Order_item_T (OrderID, SkuNum, Quantity)
values ('123-3645', 1111286, 1);
INSERT INTO Order_item_T (OrderID, SkuNum, Quantity)
values ('126-9658', 1123772, 4);
INSERT INTO Order_item_T (OrderID, SkuNum, Quantity)
values ('126-9658', 1126259, 2);
INSERT INTO Order_item_T (OrderID, SkuNum, Quantity)
values ('985-1266', 1135953, 1);
INSERT INTO Order_item_T (OrderID, SkuNum, Quantity)
values ('982-1456', 1117399, 5);
INSERT INTO Order_item_T (OrderID, SkuNum, Quantity)
values ('985-2556', 1078547, 3);
INSERT INTO Order_item_T (OrderID, SkuNum, Quantity)
values ('958-6521', 1110989, 4);
INSERT INTO Order_item_T (OrderID, SkuNum, Quantity)
values ('958-6521', 1078547, 5);
INSERT INTO Order_item_T (OrderID, SkuNum, Quantity)
values ('365-0232', 1123772, 2);
INSERT INTO Order_item_T (OrderID, SkuNum, Quantity)
values ('136-4682', 1126259, 4);
INSERT INTO Order_item_T (OrderID, SkuNum, Quantity)
values ('985-5123', 1117399, 3);
INSERT INTO Order_item_T (OrderID, SkuNum, Quantity)
values ('865-0256', 1130713, 2);

SELECT 
    *
FROM
    Customer_T;
SELECT 
    *
FROM
    Product_T;
SELECT 
    *
FROM
    Invoice_T;
SELECT 
    *
FROM
    Invoice_item_T;
SELECT 
    *
FROM
    Employee_T;
SELECT 
    *
FROM
    Order_T;
SELECT 
    *
FROM
    Order_item_T;


#Show columns for metadata
SHOW COLUMNS FROM Customer_T;
SHOW COLUMNS FROM Product_T;
SHOW COLUMNS FROM Invoice_T;
SHOW COLUMNS FROM Invoice_item_T;
SHOW COLUMNS FROM Employee_T;
SHOW COLUMNS FROM Order_T;
SHOW COLUMNS FROM Order_item_T;

SELECT 
    Price, MOP
FROM
    Invoice_item_T
WHERE
    (Price > 1000)
ORDER BY MOP;

SELECT 
    SkuNum, Category, CaseNum
FROM
    Product_T
WHERE
    CaseNum = 96;

SELECT 
    CustomerName, CustomerID, CustomerProvince
FROM
    Customer_T
WHERE
    CustomerProvince = 'QC';

SELECT 
    *
FROM
    Order_T
WHERE
    OrderDate > 2014 / 01 / 01;

SELECT 
    JCNum, Price
FROM
    Employee_Invoice_V
        JOIN
    Employee_T USING (JCNum);

SELECT 
    InvoiceNum, SkuNum, JCNum
FROM
    Invoice_item_T
WHERE
    JCNum = 3711 
UNION SELECT 
    InvoiceNum, SkuNum, JCNum
FROM
    Invoice_item_T
WHERE
    JCNum = 5669;

SELECT 
    *
FROM
    Product_T
WHERE
    Price = (SELECT 
            MAX(Price)
        FROM
            Invoice_item_T);

SELECT 
    SkuNum, Invoice_item_T.Price
FROM
    Product_T
        LEFT OUTER JOIN
    Invoice_item_T USING (SkuNum);

SELECT 
    JCNum, SUM(Price) AS 'Total Sale'
FROM
    Employee_T
        RIGHT OUTER JOIN
    Invoice_item_T USING (JCNum);

#end of DML
