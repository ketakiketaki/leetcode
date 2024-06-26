# Write your MySQL query statement below


SELECT query_name, 
ROUND(AVG(CAST(rating AS DECIMAL)/position),2) AS quality, 
ROUND((SUM(IF(rating<3,1,0))*100)/COUNT(*),2) AS poor_query_percentage
FROM Queries
WHERE query_name IS NOT NULL
GROUP BY query_name;