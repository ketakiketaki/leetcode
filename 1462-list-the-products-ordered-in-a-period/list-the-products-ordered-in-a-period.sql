# Write your MySQL query statement below
WITH product_info AS
(
    SELECT p.product_id, p.product_name, o.order_date,SUM(o.unit) AS unit
    FROM Products p
    JOIN Orders o
    ON p.product_id = o.product_id
    WHERE MONTH(order_date) = '02' AND YEAR(order_date) = '2020'
    GROUP BY p.product_id
    ORDER BY p.product_id
)

SELECT product_name, unit
FROM product_info
WHERE unit >= 100
;