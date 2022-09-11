# Write your MySQL query statement below
SELECT e1.Name as Employee
FROM Employee e1 JOIN Employee e2
On e1.ManagerId = e2.ID
WHERE e1.salary > e2.salary