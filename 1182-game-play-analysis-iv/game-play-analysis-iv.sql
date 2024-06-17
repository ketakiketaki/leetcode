# Write your MySQL query statement below
/*WITH cte AS
(
    SELECT player_id,MIN(event_date) AS first, MAX(event_date) AS last
    FROM Activity
    GROUP BY player_id
)

SELECT ROUND(SUM(CASE WHEN last-first=1 THEN 1 ELSE 0 END)/ COUNT(*),2) AS fraction
FROM cte;
*/
WITH player_logins AS (
    SELECT 
        player_id,
        MIN(event_date) AS first_login_date,
        MAX(event_date) AS last_login_date
    FROM Activity
    GROUP BY player_id
)
SELECT 
    ROUND(COUNT(CASE WHEN a.event_date = DATE_ADD(p.first_login_date, INTERVAL 1 DAY) THEN 1 END) / COUNT(*), 2) AS fraction
FROM 
    player_logins p
LEFT JOIN 
    Activity a ON p.player_id = a.player_id AND a.event_date = DATE_ADD(p.first_login_date, INTERVAL 1 DAY);

