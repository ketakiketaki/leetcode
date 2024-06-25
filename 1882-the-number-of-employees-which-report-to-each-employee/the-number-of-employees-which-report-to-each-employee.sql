# Write your MySQL query statement below
WITH managers AS
(
    SELECT e1.employee_id, e2.name, e1.reports_to, e1.age
    FROM Employees e1
    JOIN Employees e2
    ON e1.reports_to = e2.employee_id 
)

SELECT 
reports_to AS employee_id, 
name, 
COUNT(employee_id) AS reports_count,
ROUND(AVG(age),0) AS average_age
FROM managers
GROUP BY reports_to
ORDER BY employee_id