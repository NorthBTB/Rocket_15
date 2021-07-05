USE Database1;

-- QUESTION 1
DROP VIEW IF EXISTS Sale_Employee;
CREATE VIEW Sale_Employee AS
	SELECT * FROM Accountt WHERE DepartmentID = (SELECT DepartmentID FROM Department WHERE DepartmentName = N'Sale');

SELECT * FROM Sale_Employee;

-- QUESTION 2
DROP VIEW IF EXISTS VIEW2;
CREATE VIEW VIEW2 AS

SELECT * FROM VIEW2;

-- QUESTION 3
DROP VIEW IF EXISTS VIEW3;
CREATE VIEW VIEW3 AS
	SELECT QuestionID FROM Question WHERE LENGTH(Content) > 300;
    
DELETE FROM VIEW3;

-- QUESTION 5
DROP VIEW IF EXISTS VIEW5;
CREATE VIEW VIEW5 AS
	SELECT Q.QuestionID, Q.Content, A.FullName FROM Question Q INNER JOIN Accountt A ON Q.CreatorID = A.AccountID 
	WHERE A.FullName LIKE 'John%';
SELECT * FROM VIEW5;


DROP VIEW vw_GetAccount;
CREATE OR REPLACE VIEW vw_GetAccount AS
WITH CTE_GetListCountAccount AS(
SELECT count(GA1.AccountID) AS countGA1 FROM groupaccount GA1
 GROUP BY GA1.AccountID
 )
SELECT A.AccountID, A.Username, A.FullName, count(GA.AccountID) AS SL FROM groupaccount GA
INNER JOIN accountt A ON GA.AccountID = A.AccountID
GROUP BY GA.AccountID
HAVING count(GA.AccountID) = (
SELECT MAX(countGA1) AS maxCount FROM CTE_GetListCountAccount
);
SELECT * FROM vw_GetAccount;