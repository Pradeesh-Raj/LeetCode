# Write your MySQL query statement below
SELECT E.name AS name, B.bonus AS bonus
FROM Employee E
LEFT JOIN Bonus B
ON E.empId = B.empId
WHERE B.bonus IS NULL  
OR B.bonus < 1000;