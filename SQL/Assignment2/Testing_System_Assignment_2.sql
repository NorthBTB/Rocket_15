DROP DATABASE IF EXISTS Database1;
CREATE DATABASE IF NOT EXISTS Database1;

USE Database1;

DROP TABLE IF EXISTS Department;
CREATE TABLE Department (
DepartmentID	INT AUTO_INCREMENT PRIMARY KEY,
DepartmentName	VARCHAR(25) NOT NULL UNIQUE KEY
);

DROP TABLE IF EXISTS Positionn;
CREATE TABLE IF NOT EXISTS Positionn (
PositionID		INT  AUTO_INCREMENT PRIMARY KEY,
PositionName	VARCHAR(30) NOT NULL UNIQUE KEY
);

DROP TABLE IF EXISTS Accountt;
CREATE TABLE IF NOT EXISTS Accountt (
AccountID		INT AUTO_INCREMENT PRIMARY KEY,
Email			VARCHAR(30) NOT NULL UNIQUE KEY,
UserName		VARCHAR(30) NOT NULL,
FullName		VARCHAR(50) NOT NULL,
DepartmentID	INT,
PositionID		INT,
CreateDate		DATETIME DEFAULT NOW(),
FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID),
FOREIGN KEY (PositionID) REFERENCES Positionn(PositionID)
);

DROP TABLE IF EXISTS Groupp;
CREATE TABLE IF NOT EXISTS Groupp (
GroupID			INT AUTO_INCREMENT PRIMARY KEY,
GroupName		VARCHAR(30) NOT NULL UNIQUE KEY,
CreatorID		INT NOT NULL,
CreateDate		DATETIME DEFAULT NOW(),
FOREIGN KEY (CreatorID) REFERENCES Accountt(AccountID)
);

DROP TABLE IF EXISTS GroupAccount;
CREATE TABLE IF NOT EXISTS GroupAccount (
GroupID			INT NOT NULL,
AccountID		INT NOT NULL,
JoinDate		DATETIME DEFAULT NOW(),
PRIMARY KEY(GroupID, AccountID),
FOREIGN KEY (GroupID) REFERENCES Groupp(GroupID),
FOREIGN KEY (AccountID) REFERENCES Accountt(AccountID)
);

DROP TABLE IF EXISTS TypeQuestion;
CREATE TABLE IF NOT EXISTS TypeQuestion (
TypeID			INT PRIMARY KEY AUTO_INCREMENT,
TypeName		VARCHAR(30) NOT NULL UNIQUE KEY
);

DROP TABLE IF EXISTS CategoryQuestion;
CREATE TABLE IF NOT EXISTS CategoryQuestion (
CategoryID		INT PRIMARY KEY AUTO_INCREMENT,
CategoryName	VARCHAR(30) NOT NULL UNIQUE KEY
);

DROP TABLE IF EXISTS Question;
CREATE TABLE IF NOT EXISTS Question (
QuestionID 		INT AUTO_INCREMENT PRIMARY KEY,
Content 		VARCHAR(255) NOT NULL,
CategoryID		INT NOT NULL,
TypeID			INT NOT NULL,
CreatorID		INT NOT NULL,
CreateDate		DATETIME DEFAULT NOW(),
FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID),
FOREIGN KEY (TypeID) REFERENCES TypeQuestion(TypeID),
FOREIGN KEY (CreatorID) REFERENCES Accountt(AccountID)
);

DROP TABLE IF EXISTS Answer;
CREATE TABLE IF NOT EXISTS Answer (
AnswerID 		INT AUTO_INCREMENT PRIMARY KEY,
Content 		VARCHAR(255) NOT NULL,
QuestionID		INT NOT NULL,
isCorrect		BOOLEAN DEFAULT 1,
FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);

DROP TABLE IF EXISTS Exam;
CREATE TABLE IF NOT EXISTS Exam (
ExamID 			INT AUTO_INCREMENT PRIMARY KEY,
Codee 			CHAR(10) NOT NULL,
Title			VARCHAR(30) NOT NULL,
CategoryID		INT NOT NULL,
Duration		INT NOT NULL,
CreatorID		INT NOT NULL,
CreateDate		DATETIME DEFAULT NOW(),
FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID),
FOREIGN KEY (CreatorID) REFERENCES Accountt(AccountID)
);

DROP TABLE IF EXISTS ExamQuestion;
CREATE TABLE IF NOT EXISTS ExamQuestion (
ExamID			INT NOT NULL,
QuestionID 		INT NOT NULL,
PRIMARY KEY(ExamID, QuestionID),
FOREIGN KEY (ExamID) REFERENCES Exam(ExamID),
FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);


-- INSERT DATA ----------------

-- DEPARTMENT
INSERT INTO Department(DepartmentName)
VALUES
(N'Gi??m ?????c'),
(N'Marketing'),
(N'K??? to??n'),
(N'Sale'),
(N'Nh??n s???'),
(N'K??? thu???t'),
(N'B???o v???');

-- POSITION
INSERT INTO Positionn(PositionName)
VALUES
(N'Dev'),
(N'Tester'),
(N'B???o v???');

-- ACCOUNTT
INSERT INTO Accountt(Email, Username, FullName, DepartmentID, PositionID, CreateDate)
VALUES 
('JohnnyDang@gmail.com'		, 'Username1'	, N'Johnny ?????ng'	, '1'	, '1'	, '2021-06-01'),
('TommyTeo@gmail.com'		, 'Username2'	, N'Tommy T??o'		, '5'	, '3'	, '2021-06-08'),
('JohnWick@gmail.com'		, 'Username3'	, N'John Wick'		, '2'	, '2'	, '2021-06-15'),
('An@gmail.com'				, 'Username4'	, N'Nguy???n V??n An'	, '5'	, '2'	, '2021-06-19'),
('Canh@gmail.com'			, 'Username5'	, N'????? Xu??n C???nh'	, '4'	, '2'	, '2021-06-21'),
('Dia@gmail.com'			, 'Username6'	, N'L?? C??ng ?????a'	, '3'	, '2'	, '2021-06-21'),
('Khanh@gmail.com'			, 'Username7'	, N'Mai Qu???c Kh??nh'	, '3'	, '1'	, '2021-06-21'),
('Doan@gmail.com'			, 'Username8'	, N'????? V??n To??n'	, '1'	, '1'	, '2021-05-01'),
('Bao@gmail.com'			, 'Username8'	, N'????? ?????c B???o'		, '1'	, '1'	, '2021-05-01');

-- Groupp
INSERT INTO Groupp (GroupName, CreatorID, CreateDate)
VALUES 
(N'Developer' 	, 2		, '2021-05-05'),
(N'Tester' 		, 1		, '2021-06-01'),
(N'Sale' 		, 3		, '2021-06-18'),
(N'Marketing' 	, 2		, '2021-06-18'),
(N'ShareWithMe'	, 1		, '2021-06-19');

-- GroupAccount
INSERT INTO GroupAccount (GroupID ,AccountID ,JoinDate )
VALUES 
( 1 , 1,'2021-06-01'),
( 2 , 1,'2021-06-01'),
( 3 , 1,'2021-06-19'),
( 4 , 2,'2021-06-21'),
( 5 , 2,'2021-06-21'),
( 1 , 3,'2021-06-20'),
( 1 , 4,'2021-06-26'),
( 5 , 4,'2021-06-26'),
( 1 , 5,'2021-06-26'),
( 3 , 5,'2021-06-26');

-- TYPE QUESTION
INSERT INTO TypeQuestion (TypeName)
VALUES 
('Easy'),
('Normal'), 
('Difficult'), 
('Etra');

-- CATEGORY QUESTION
INSERT INTO CategoryQuestion (CategoryName)
VALUES 
('SQL'), 
('Java'), 
('C++'), 
('C#'), 
('Python');

-- QUESTION
INSERT INTO Question (Content, CategoryID, TypeID, CreatorID, CreateDate )
VALUES 
(N'Tr??? l???i c??u h???i 1' , 1 ,'1' ,'1' ,'2021-06-20'),
(N'Tr??? l???i c??u h???i 2' , 2 ,'4' ,'2' ,'2021-06-20'),
(N'Tr??? l???i c??u h???i 3' , 3 ,'3' ,'3' ,'2021-06-21'),
(N'Tr??? l???i c??u h???i 4' , 4 ,'2' ,'2' ,'2021-06-21'),
(N'Tr??? l???i c??u h???i 5' , 5 ,'3' ,'3' ,'2021-06-22'),
(N'Tr??? l???i c??u h???i 6' , 3 ,'1' ,'2' ,'2021-06-22'),
(N'Tr??? l???i c??u h???i 7' , 2 ,'4' ,'1' ,'2021-06-23'),
(N'Tr??? l???i c??u h???i 8' , 5 ,'1' ,'1' ,'2021-06-23');

-- ANSWER
INSERT INTO Answer (Content , QuestionID , isCorrect )
VALUES 
(N'C??u tr??? l???i 1' 	, 1 , 0),
(N'C??u tr??? l???i 2' 	, 1 , 1),
(N'C??u tr??? l???i 3' 	, 1 , 1),
(N'C??u tr??? l???i 4' 	, 1 , 0),
(N'C??u tr??? l???i 5' 	, 2 , 1),
(N'C??u tr??? l???i 6' 	, 3 , 1),
(N'C??u tr??? l???i 7' 	, 4 , 1),
(N'C??u tr??? l???i 8' 	, 5 , 0),
(N'C??u tr??? l???i 9' 	, 6 , 1),
(N'C??u tr??? l???i 10' 	, 7 , 1),
(N'C??u tr??? l???i 11' 	, 8 , 0),
(N'C??u tr??? l???i 12' 	, 1 , 1),
(N'C??u tr??? l???i 13' 	, 8 , 1);

-- EXAM 
INSERT INTO Exam (Codee , Title , CategoryID, Duration , CreatorID , CreateDate )
VALUES 
('EXAM01' , N'????? 01' ,1 , 60 , '1' ,'2021-06-20'),
('EXAM02' , N'????? 02' ,4 , 90 , '1' ,'2021-06-20'),
('EXAM03' , N'????? 03' ,5 , 60 , '2' ,'2021-06-20'),
('EXAM04' , N'????? 04' ,2 , 45 , '3' ,'2021-06-21'),
('EXAM05' , N'????? 05' ,3 , 60 , '4' ,'2021-06-22'),
('EXAM06' , N'????? 06' ,3 , 60 , '3' ,'2021-06-22');

-- EXAMQUESTION
INSERT INTO ExamQuestion(ExamID , QuestionID )
VALUES 
( 1 , 1 ),
( 1 , 2 ),
( 1 , 3 ),
( 1 , 4 ),
( 1 , 5 ),
( 1 , 6 ),
( 1 , 7 ),
( 1 , 8 ),
( 2 , 1 ),
( 2 , 2 ),
( 2 , 3 ),
( 2 , 4 ),
( 2 , 5 ),
( 2 , 6 ),
( 2 , 7 ),
( 3 , 1 ),
( 3 , 2 ),
( 3 , 3 ),
( 3 , 4 ),
( 3 , 5 ),
( 4 , 1 ),
( 4 , 2 ),
( 4 , 3 ),
( 4 , 4 );










