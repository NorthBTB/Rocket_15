-- INSERT DATA
-- TABLE 1
INSERT INTO TRAINEE (Full_Name, Birth_Date, Gender, ET_IQ, ET_GMath, ET_English, Training_Class, Evaluation_Note)
VALUES
(N'John Wick'			, '1981-06-28'	,'Male'		, '20'	, '20'	, '50'	, 'Cl001'	,	'No Comment'	),
(N'Johnny Đặng'			, '1999-06-20'	,'Male'		, '19'	, '18'	, '37'	, 'CL002'	,	NULL 			),
(N'Tommy Tèo'			, '1996-03-01'	,'Male'		, '15'	, '19'	, '50'	, 'CL001'	,	'No Comment'	),
(N'Lê Lai'				, '2001-07-28'	,'Male'		, '20'	, '20'	, '40'	, 'CL003'	,	'No Comment'	),
(N'Lê Lợi'				, '2002-04-30'	,'Male'		, '15'	, '17'	, '46'	, 'CL001'	,	'No Comment'	),
(N'Nguyễn Văn An'		, '1998-06-16'	,'Male'		, '20'	, '16'	, '46'	, 'CL004'	,	'No Comment'	),
(N'Đỗ Văn Toàn'			, '2001-09-12'	,'Male'		, '16'	, '19'	, '49'	, 'CL006'	,	'No Comment'	),
(N'Scarlet Johanson'	, '2002-11-15'	,'Female'	, '18'	, '18'	, '35'	, 'CL005'	,	'No Comment'	),
(N'Lee Min Ho'			, '2003-12-02'	,'Male'		, '19'	, '10'	, '41'	, 'CL002'	,	'No Comment'	),
(N'Kenny Sang'			, '2000-09-09'	,'Unknown'	, '17'	, '20'	, '50'	, 'CL001'	,	NULL 			);


SELECT * FROM TRAINEE;

-- QUESTION 2
SELECT GROUP_CONCAT(Full_Name) AS 'GROUP BY NAME',MONTH(Birth_Date)  AS 'Month of Date',COUNT(*) AS'TOTAL' FROM Trainee GROUP BY MONTH(Birth_Date);
-- QUESTION 3
SELECT Full_Name,(YEAR(NOW()) - YEAR(Birth_Date)) AS 'Age' FROM Trainee ORDER BY CHAR_LENGTH(Full_Name) DESC LIMIT 1;
-- QUESTION 4
SELECT Full_Name,ET_IQ,ET_Gmath,ET_English,(ET_IQ + ET_Gmath) FROM Trainee WHERE ET_IQ>=8 AND ET_Gmath>=8 AND ET_English>=18 AND (ET_IQ + ET_Gmath)>=20;
-- QUESTION 5
DELETE FROM Trainee WHERE TraineeID=3;
-- QUESTION 6
UPDATE Trainee SET Training_Class='CL002' WHERE TraineeID=5;

