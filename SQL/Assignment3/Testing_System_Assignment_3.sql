-- QUESTION 1 Da them o testing_system_assignment_2
USE DATABASE1;

-- QUESTION 2
SELECT * FROM Department;

-- QUESTION 3
SELECT DepartmentID FROM Department WHERE DepartmentName = 'Sale';

-- QUESTION 4
SELECT * FROM Accountt ORDER BY CHAR_LENGTH(FullName) DESC LIMIT 1;

-- QUESTION 5
SELECT * FROM Accountt WHERE DepartmentID = 3 ORDER BY CHAR_LENGTH(FullName) DESC LIMIT 1;

-- QUESTION 6
SELECT * FROM Groupp WHERE CreateDate < '2021-06-18';

-- QUESTION 7
SELECT COUNT(AnswerID) AS 'Number of Answer', QuestionID FROM Answer GROUP BY QuestionID HAVING  COUNT(AnswerID)>4;

-- QUESTION 8
SELECT * FROM Exam WHERE Duration >= 60 AND CreateDate <= '2021-06-21';

-- QUESTION 9
SELECT * FROM Groupp ORDER BY CreateDate DESC LIMIT 5;

-- QUESTION 10
SELECT COUNT(AccountID) AS 'Number of Staff in Department 2' FROM Accountt WHERE DepartmentID = 5 GROUP BY DepartmentID; 

-- QUESTION 11
SELECT * FROM Accountt WHERE FullName LIKE 'D%O';

-- QUESTION 12
DELETE FROM Exam WHERE CreateDate < '2021-06-21';

-- QUESTION 13
DELETE FROM Question WHERE Content LIKE 'Câu hỏi%';

-- QUESTION 14
SELECT * FROM Accountt;
UPDATE Accountt SET FullName = N'Nguyễn Bá Lộc', Email='loc.nguyenba@vti.com' WHERE AccountID=5;

-- QUESTION 15
SELECT * FROM GroupAccount;
UPDATE GroupAccount SET AccountID = 5 WHERE GroupID = 4;
