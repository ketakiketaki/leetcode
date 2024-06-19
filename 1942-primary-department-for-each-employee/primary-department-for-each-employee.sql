# Write your MySQL query statement below
WITH cte AS
(
    SELECT employee_id, department_id, primary_flag, COUNT(employee_id) AS cnt
    FROM Employee
    GROUP BY employee_id
)

SELECT employee_id, department_id 
FROM cte
WHERE primary_flag = 'N' AND cnt = 1
UNION 
SELECT employee_id, department_id 
FROM Employee
WHERE primary_flag = 'Y'
;
