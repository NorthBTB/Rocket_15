CREATE DATABASE Database1;

USE Database1;

CREATE TABLE Department (
DepartmentID	INT(10),
DepartmentName	VARCHAR(25)
);

CREATE TABLE Position (
PositionID		INT(10),
PositionName	VARCHAR(30)
);

CREATE TABLE Account (
AccountID		INT(10),
Email			VARCHAR(30),
UserName		VARCHAR(30),
FullName		VARCHAR(30),
DepartmentID	INT(10),
PositionID		INT(10),
CreateDate		DATE
);

CREATE TABLE Groupp (
GroupID			INT(10),
GroupName		VARCHAR(30),
CreatorID		INT(10),
CreateDate		DATE
);

CREATE TABLE GroupAccount (
GroupID			INT(10),
AccountID		INT(10),
JoinDate		DATE
);

CREATE TABLE TypeQuestion (
TypeID			INT(10),
TypeName		VARCHAR(30)
);

CREATE TABLE CategoryQuestion (
CategoryID		INT(10),
CategoryName	VARCHAR(30)
);

CREATE TABLE Question (
QuestionID 		INT(10),
Content 		VARCHAR(255),
CategoryID		INT(10),
TypeID			INT(10),
CreatorID		INT(10),
CreateDate		DATE
);

CREATE TABLE Answer (
AnswerID 		INT(10),
Content 		VARCHAR(255),
QuestionID		INT(10),
isCorrect		BOOLEAN
);

CREATE TABLE Exam (
ExamID 			INT(10),
Code 			VARCHAR(10),
Title			VARCHAR(255),
CategoryID		INT(180),
Duration		INT(10),
CreatorID		INT(10),
CreatorDate		DATE
);

CREATE TABLE ExamQuestion (
ExamID			INT(10),
QuestionID 		INT(10)
);





