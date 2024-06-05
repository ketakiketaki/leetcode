# Write your MySQL query statement below

WITH cte AS
(SELECT DISTINCT user_id AS users
FROM Users) 

SELECT contest_id, ROUND((COUNT(DISTINCT user_id) / (SELECT COUNT(users) FROM cte)) * 100,2) AS percentage
FROM Register
GROUP BY contest_id
ORDER BY percentage DESC, contest_id ASC;


/*SELECT contest_id,COUNT(DISTINCT user_id) 
FROM Register
GROUP BY contest_id;*/