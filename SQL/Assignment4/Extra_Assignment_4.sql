-- QUESTION 1
DROP DATABASE IF EXISTS Database2;
CREATE DATABASE IF NOT EXISTS Database2;

USE Database2;

DROP TABLE IF EXISTS Department;
CREATE TABLE IF NOT EXISTS Department (
	Department_Number		INT AUTO_INCREMENT PRIMARY KEY,
    Department_Name			VARCHAR(30) NOT NULL
);

DROP TABLE IF EXISTS Employee_Table;
CREATE TABLE IF NOT EXISTS Employee_Table (
	Employee_Number 		INT AUTO_INCREMENT PRIMARY KEY,
    Employee_Name			VARCHAR(30) NOT NULL,
	Department_Number		INT NOT NULL,
    FOREIGN KEY (Department_Number) REFERENCES Department(Department_Number)
);

DROP TABLE IF EXISTS Employee_Skill_Table;
CREATE TABLE IF NOT EXISTS Employee_Skill_Table (
	Employee_Number 		INT NOT NULL,
    Skill_Code				VARCHAR(20) NOT NULL,
	DateRegistered			DATETIME NOT NULL,
    PRIMARY KEY (Employee_Number, Skill_Code),
    FOREIGN KEY (Employee_Number) REFERENCES Employee_Table(Employee_Number)
);

INSERT INTO Department (Department_Name)
VALUES
(N'Giám Đốc'),
(N'Developer'),
(N'Kế toán'),
(N';Bảo vệ'),
(N'Marketing'),
(N'Kỹ thuật'),
(N'Vệ Sinh');
INSERT INTO Employee_Table (Employee_Name, Department_Number)
VALUES
( N'Johnny Đặng'	, 1),
( N'Tommy Tèo'		, 2),
( N'John Wick'		, 3),
( N'Nguyễn Văn An'	, 4),
( N'Đỗ Xuân Cảnh'	, 5),
( N'Lê Công Địa'	, 6),
( N'Mai Quốc Khánh'	, 7),
( N'Đỗ Văn Toàn'	, 2),
( N'Đỗ Đức Bảo'		, 2);

INSERT INTO Employee_Skill_Table (Employee_Number, Skill_Code, DateRegistered)
VALUES
(1	, 'Java'		, '2021-03-21'),
(1	, 'SQL'			, '2021-03-20'),
(1	, 'C++'			, '2021-03-18'),
(1	, 'Python'		, '2021-03-19'),
(2	, 'Java'		, '2021-03-29'),
(2	, 'SQL'			, '2021-04-01'),
(8	, 'Java'		, '2021-05-12'),
(8	, 'Python'		, '2021-05-14'),
(8	, 'C'			, '2021-05-18'),
(9	, 'SQL'			, '2021-05-28'),
(9	, 'C#'			, '2021-06-18'),
(9	, 'Html'		, '2021-06-19');

-- QUESTION 3
SELECT Employee_Name 
FROM Employee_Table AS A INNER JOIN Employee_Skill_Table AS B ON A.Employee_Number = B.Employee_Number WHERE B.Skill_Code = 'Java';

-- QUESTION 4
SELECT A.Department_Name, COUNT(B.Employee_Number) 
FROM Department AS A INNER JOIN Employee_Table AS B ON A.Department_Number = B.Department_Number 
GROUP BY A.Department_Name HAVING COUNT(B.Employee_Number) > 2;

-- QUESTION 5
SELECT A.Department_Name, GROUP_CONCAT(Employee_Name) 
FROM Department AS A INNER JOIN Employee_Table AS B ON A.Department_Number = B.Department_Number 
GROUP BY A.Department_Name;

-- QUESTION 6
SELECT Employee_Name , COUNT(B.Skill_Code)
FROM Employee_Table AS A INNER JOIN Employee_Skill_Table AS B ON A.Employee_Number = B.Employee_Number 
GROUP BY Employee_Name HAVING COUNT(B.Skill_Code) > 2;
