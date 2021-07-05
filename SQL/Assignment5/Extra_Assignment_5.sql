USE `adventureworks`;

-- EXERCISE 1
-- QUESTION 1
SELECT Name FROM Product WHERE ProductSubcategoryID =  
	(SELECT ProductSubcategoryID FROM ProductSubcategory WHERE Name = 'Saddles');

-- QUESTION 2
SELECT Name FROM Product WHERE ProductSubcategoryID IN 
	(SELECT ProductSubcategoryID FROM ProductSubcategory WHERE Name LIKE 'Bo%');

-- QUESTION 3
SELECT Name FROM Product WHERE ProductID IN 
	(SELECT ProductID FROM Product WHERE ListPrice = 
    (SELECT MIN(ListPrice) FROM Product  WHERE ProductSubcategoryID = 3 ));

-- EXERCISE 2
-- QUESTION 1
SELECT DISTINCT C.Name, S.Name FROM 
	CountryRegion C INNER JOIN StateProvince S  ON C.CountryRegionCode = S.CountryRegionCode;

-- QUESTION 2
SELECT DISTINCT C.Name, S.Name FROM 
	CountryRegion C INNER JOIN StateProvince S  ON C.CountryRegionCode = S.CountryRegionCode
    WHERE C.Name IN ('Germany', 'Canada') ORDER BY C.Name;
    
-- QUESTION 3
SELECT O.SalesOrderID, O.OrderDate, O.SalesPersonID, S.SalesPersonID AS 'BusinessEntityID', S.Bonus, S.SalesYTD 
	FROM SalesPerson S INNER JOIN SalesOrderHeader O ON S.SalesPersonID = O.SalesPersonID
    WHERE O.OnlineOrderFlag <> 1 AND O.SalesPersonID IS NOT NULL LIMIT 4000;
    
-- QUESTION 4
SELECT * FROM SalesPerson;
SELECT * FROM SalesOrderHeader;
SELECT * FROM Employee;
SELECT O.SalesOrderID, O.OrderDate, E.Title, S.Bonus, S.SalesYTD 
	FROM (SalesPerson S INNER JOIN Employee E ON S.SalesPersonID = E.EmployeeID)
    INNER JOIN SalesOrderHeader O ON S.SalesPersonID = O.SalesPersonID
    WHERE O.OnlineOrderFlag <> 1 AND O.SalesPersonID IS NOT NULL LIMIT 4000;



