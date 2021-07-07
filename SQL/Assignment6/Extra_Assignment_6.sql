use testingsystem_assignment_extra_6;

-- c/
DROP PROCEDURE IF EXISTS Store_Working;
DELIMITER $$
CREATE PROCEDURE Store_Working ()
		BEGIN
			SELECT P.ModuleID, P.ProjectID
            FROM Project_Modules P INNER JOIN Work_Done W ON P.ModuleID = W.ModuleID
            WHERE W.WorkDoneDescription = N'Trong Tiến Trình';
        END$$
DELIMITER ;

CALL Store_Working();
