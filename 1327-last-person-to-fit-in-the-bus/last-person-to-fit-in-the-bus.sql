# Write your MySQL query statement below
WITH cte AS
(
SELECT person_id, person_name, weight, turn ,
SUM(weight) OVER (ORDER BY turn 
     ROWS BETWEEN UNBOUNDED PRECEDING AND CURRENT ROW) AS Running_total
FROM Queue 
ORDER BY turn
)

SELECT person_name 
FROM cte
WHERE Running_total <= 1000
ORDER BY Running_total DESC
LIMIT 1 ;
