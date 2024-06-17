# Write your MySQL query statement below
WITH cte AS
(
    SELECT num,COUNT(num) AS cnt
    FROM MyNumbers
    GROUP BY num
)

SELECT (
    SELECT num
    FROM cte
    WHERE cnt = 1
    ORDER BY num DESC
    LIMIT 1
) AS num