# Write your MySQL query statement below
WITH cte AS(
SELECT e.name AS name, COUNT(e.id) AS count
FROM Employee e
JOIN Employee m
ON e.id = m.managerId
GROUP BY m.managerId
HAVING COUNT(e.id)>=5)

SELECT name FROM cte




