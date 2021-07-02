USE Database1;

-- EXERCISE 1 :
-- QUESTION 1
SELECT * FROM Accountt AS A LEFT JOIN Department AS B ON A.DepartmentID = B.DepartmentID;

-- QUESTION 2
SELECT * FROM Accountt WHERE CreateDate > '2021-06-15';

-- QUESTION 3
SELECT * FROM Accountt AS A RIGHT JOIN Positionn AS B ON A.PositionID = B.PositionID WHERE B.PositionName = 'Dev';

-- QUESTION 4
SELECT COUNT(A.AccountID), B.DepartmentName 
FROM Accountt AS A RIGHT JOIN Department AS B ON A.DepartmentID = B.DepartmentID GROUP BY B.DepartmentID HAVING COUNT(A.AccountID)>2;

-- QUESTION 5
SELECT E.QuestionID, Q.Content FROM examquestion E
INNER JOIN question Q ON Q.QuestionID = E.QuestionID
GROUP BY E.QuestionID
HAVING count(E.QuestionID) = (SELECT MAX(countQues) as maxcountQues FROM (
SELECT COUNT(E.QuestionID) AS countQues FROM examquestion E
GROUP BY E.QuestionID) AS countTable);


-- QUESTION 6
SELECT COUNT(QuestionID) AS 'SL',B.CategoryName 
FROM Question AS A LEFT JOIN CategoryQuestion AS B ON A.CategoryID = B.CategoryID GROUP BY CategoryName;

-- QUESTION 7
SELECT COUNT(ExamID) AS 'SL',B.Content FROM ExamQuestion AS A LEFT JOIN Question AS B ON A.QuestionID = B.QuestionID GROUP BY Content;

-- QUESTION 8
SELECT COUNT(AnswerID) AS 'SL',B.Content 
FROM Answer AS A LEFT JOIN Question AS B ON A.QuestionID = B.QuestionID GROUP BY Content ORDER BY SL DESC LIMIT 1;

-- QUESTION 9
SELECT B.GroupName,COUNT(AccountID) AS 'SL' FROM GroupAccount AS A INNER JOIN Groupp AS B ON A.GroupID = B.GroupID GROUP BY GroupName;

-- QUESTION 10
SELECT A.PositionName, COUNT(B.AccountID) 
FROM Positionn AS A LEFT JOIN Accountt AS B ON A.PositionID = B.PositionID 
GROUP BY A.PositionName ORDER BY COUNT(B.AccountID) ASC LIMIT 1;

-- QUESTION 11
SELECT A.DepartmentName, C.PositionName , COUNT(C.PositionName) AS 'SL'
FROM (Department AS A LEFT JOIN Accountt AS B ON A.DepartmentID = B.DepartmentID) 
LEFT JOIN Positionn AS C ON B.PositionID = C.PositionID GROUP BY B.PositionID, A.DepartmentID;
-- QUESTION 12
SELECT A.Content, A.CreateDate, B.CategoryName , C.FullName, D.Content AS 'Creator'
FROM ((QUESTION AS A INNER JOIN CategoryQuestion AS B ON A.CategoryID = B.CategoryID) 
LEFT JOIN Accountt AS C ON A.CreatorID = C.AccountID)
LEFT JOIN Answer AS D ON A.QuestionID = D.QuestionID ORDER BY A.Content;

-- QUESTION 13
SELECT B.TypeName, COUNT(A.QuestionID) AS 'NUMBER OF QUESTION' 
FROM Question AS A RIGHT JOIN TypeQuestion AS B ON A.TypeID = B.TypeID GROUP BY B.TypeName;

-- QUESTION 14
SELECT B.GroupName,COUNT(AccountID) AS 'SL' 
FROM GroupAccount AS A LEFT JOIN Groupp AS B ON A.GroupID = B.GroupID GROUP BY GroupName HAVING SL = 0;

-- QUESTION 15 DUPLICATE QUESTION

-- QUESTION 16
SELECT B.Content,COUNT(A.QuestionID) AS 'SL' 
FROM Question AS A RIGHT JOIN Answer AS B ON A.QuestionID = B.QuestionID GROUP BY A.Content HAVING SL = 0;

-- EXERCISE 2 :
-- QUESTION 17
SELECT A.GroupID, A.AccountID, B.FullName FROM GroupAccount AS A LEFT JOIN Accountt AS B ON A.AccountID = B.AccountID WHERE A.GroupID = 1
UNION
SELECT A.GroupID, A.AccountID, B.FullName FROM GroupAccount AS A LEFT JOIN Accountt AS B ON A.AccountID = B.AccountID WHERE A.GroupID = 2;

-- QUESTION 18
SELECT GroupID, COUNT(AccountID) as 'Number of Member' FROM GroupAccount GROUP BY GroupID HAVING COUNT(AccountID) >2
UNION
SELECT GroupID, COUNT(AccountID) as 'Number of Member' FROM GroupAccount GROUP BY GroupID HAVING COUNT(AccountID) <3;