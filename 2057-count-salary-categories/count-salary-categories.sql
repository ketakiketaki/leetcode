# Write your MySQL query statement below
WITH cte AS
(
    SELECT 
    CASE WHEN income < 20000 THEN 'Low Salary'
     WHEN income BETWEEN 20000 AND 50000 THEN 'Average Salary'
     ELSE 'High Salary'
     END AS category
    , income
    FROM Accounts
)

SELECT categories.category, COALESCE(COUNT(cte.category),0) AS accounts_count
FROM (
      SELECT 'Low Salary' AS category
      UNION ALL
      SELECT 'Average Salary'
      UNION ALL
      SELECT 'High Salary'
     ) AS categories
LEFT JOIN cte ON categories.category = cte.category
GROUP BY categories.category

;