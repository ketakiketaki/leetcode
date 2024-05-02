# Write your MySQL query statement below
/*WITH cte AS 
(SELECT DISTINCT (p.product_id), p.end_date, p.start_date AS p_date, p.price 
FROM Prices p
LEFT JOIN UnitsSold u
ON p.product_id = u.product_id)

SELECT c.product_id, c.price, u.units, c.p_date
FROM cte c
JOIN UnitsSold u
ON c.product_id = u.product_id
WHERE u.purchase_date BETWEEN c.end_date AND c.start_date;*/


SELECT p.product_id, IFNULL(ROUND(SUM(p.price * u.units)/SUM(u.units),2),0) AS average_price
FROM Prices p
LEFT JOIN UnitsSold u
ON p.product_id = u.product_id
AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY p.product_id