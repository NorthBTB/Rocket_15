USE database1;

-- QUESTION 1
DROP PROCEDURE IF EXISTS Store_1;
DELIMITER $$
CREATE PROCEDURE Store_1 (IN in_dept_name VARCHAR(25))
		BEGIN
			SELECT * 
            FROM Accountt 
            WHERE DepartmentID = (SELECT DepartmentID 
            FROM Department
            WHERE DepartmentName = in_dept_name);
        END$$
DELIMITER ;

CALL Store_1(N'Giám đốc');

-- QUESTION 2
DROP PROCEDURE IF EXISTS Store_2;
DELIMITER $$
CREATE PROCEDURE Store_2 ()
		BEGIN
			SELECT G.GroupName,COUNT(GA.AccountID) AS 'SL'
            FROM GroupAccount GA INNER JOIN Groupp G ON GA.GroupID = G.GroupID
            GROUP BY G.GroupID;
        END$$
DELIMITER ;

CALL Store_2();

-- QUESION 3
DROP PROCEDURE IF EXISTS Store_3;
DELIMITER $$
CREATE PROCEDURE Store_3 (IN in_month INT)
		BEGIN
			SELECT TQ.TypeName,COUNT(Q.QuestionID) AS 'SL'
            FROM Question Q INNER JOIN TypeQuestion TQ ON Q.TypeID = TQ.TypeID
            WHERE MONTH(Q.CreateDate) = in_month
            GROUP BY Q.TypeID;
        END$$
DELIMITER ;

CALL Store_3('6');

-- QUESION 4
DROP PROCEDURE IF EXISTS Store_4;
DELIMITER $$
CREATE PROCEDURE Store_4 ()
		BEGIN
			SELECT TypeID
            FROM Question
            GROUP BY TypeID 
            HAVING COUNT(QuestionID) = 
				(SELECT COUNT(QuestionID) 
                FROM Question GROUP BY TypeID ORDER BY COUNT(QuestionID) DESC LIMIT 1);
        END$$
DELIMITER ;

CALL Store_4();

-- QUESTION 5
DROP PROCEDURE IF EXISTS Store_5;
DELIMITER $$
CREATE PROCEDURE Store_5 ()
		BEGIN
			SELECT TypeName 
            FROM TypeQuestion
            WHERE TypeID = 
			(SELECT TypeID
            FROM Question
            GROUP BY TypeID 
            HAVING COUNT(QuestionID) = 
				(SELECT COUNT(QuestionID) 
                FROM Question GROUP BY TypeID ORDER BY COUNT(QuestionID) DESC LIMIT 1));
        END$$
DELIMITER ;

CALL Store_5();

-- QUESTION 6
DROP PROCEDURE IF EXISTS Store_6;
DELIMITER $$
CREATE PROCEDURE Store_6 (IN in_char VARCHAR(15))
		BEGIN
			SELECT GroupName 
            FROM Groupp
            WHERE GroupName LIKE CONCAT('%', in_char, '%')
            UNION
            SELECT FullName 
            FROM Accountt
            WHERE FullName LIKE CONCAT('%', in_char, '%');
        END$$
DELIMITER ;
CALL Store_6('Te');

-- QUESTION 7
DROP PROCEDURE IF EXISTS Store_7;
DELIMITER $$
CREATE PROCEDURE Store_7 (IN in_full_name VARCHAR(35), IN in_email VARCHAR(40))
		BEGIN
			DECLARE user_name 		VARCHAR(30) DEFAULT SUBSTRING_INDEX(in_email,'@',1);
            DECLARE Department_ID 	INT DEFAULT 1;
			DECLARE Position_ID 	INT DEFAULT 1;
			DECLARE Create_Date 	DATETIME DEFAULT now();
			INSERT INTO Accountt(Email, UserName, FullName, DepartmentID, PositionID, CreateDate)
            VALUES
            (in_email,	user_name, 	in_full_name, Department_ID,	Position_ID,	Create_Date);
        END$$
DELIMITER ;

CALL Store_7(N'Lương Văn Lộc','loc.luong@gmail.com');

-- QUESTION 8
DROP PROCEDURE IF EXISTS Store_8;
DELIMITER $$
CREATE PROCEDURE Store_8 (IN in_char VARCHAR(15))
		BEGIN
			SELECT Q.QuestionID, Q.Content, TQ.TypeName, Q.CreateDate
            FROM Question Q INNER JOIN TypeQuestion TQ ON Q.TypeID = TQ.TypeID
            WHERE TQ.TypeName = in_char AND CHAR_LENGTH(Q.Content) = 
			(SELECT MAX(CHAR_LENGTH(Q.Content)) FROM Question);
        END$$
DELIMITER ;

CALL Store_8('Easy');

-- QUESTION 9
DROP PROCEDURE IF EXISTS Store_9;
DELIMITER $$
CREATE PROCEDURE Store_9 (IN in_exam_id INT)
		BEGIN
			DELETE FROM Exam
            WHERE ExamID = in_exam_ID;
        END$$
DELIMITER ;

CALL Store_9(6);

-- QUESTION 10
DROP PROCEDURE IF EXISTS Store_10;
DELIMITER $$
CREATE PROCEDURE Store_10 (IN in_exam_id INT)
		BEGIN
			
        END$$
DELIMITER ;

CALL Store_10(6);

-- QUESTION 11
DROP PROCEDURE IF EXISTS Store_11;
DELIMITER $$
CREATE PROCEDURE Store_11 (IN in_depart_name VARCHAR(25))
		BEGIN
			DECLARE depart_id INT;
            SELECT DepartmentID INTO depart_id FROM Department WHERE DepartmentName = in_depart_name;
			UPDATE Accountt 
            SET DepartmentID = 9
            WHERE DepartmentID = depart_id;
			
            DELETE FROM Department 
            WHERE DepartmentID = depart_id;
        END$$
DELIMITER ;

CALL Store_12(N'Marketing');

-- QUESTION 12
DROP PROCEDURE IF EXISTS Store_12;
DELIMITER $$
CREATE PROCEDURE Store_12 ()
		BEGIN
			SELECT COUNT(QuestionID), MONTH(CreateDate)
            FROM Question
            WHERE YEAR(CreateDate) = YEAR(NOW())
            GROUP BY MONTH(CreateDate);
        END$$
DELIMITER ;
SELECT * FROM QUESTION;
CALL Store_12();

-- QUESTION 13
DROP PROCEDURE IF EXISTS Store_13;
DELIMITER $$
CREATE PROCEDURE Store_13 ()
		BEGIN
			SELECT IF(COUNT(QuestionID) = 0,N'không có câu hỏi nào trongtháng',COUNT(QuestionID)) AS 'SL', MONTH(CreateDate)
            FROM Question
            WHERE MONTH(SUBDATE(NOW(),INTERVAL 5 MONTH)) > MONTH(SUBDATE(CreateDate,INTERVAL 5 MONTH))
            GROUP BY MONTH(CreateDate);
        END$$
DELIMITER ;
SELECT * FROM QUESTION;
CALL Store_13();





