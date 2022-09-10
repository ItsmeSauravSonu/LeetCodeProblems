# Write your MySQL query statement below
SELECT e.name as Employee 
From Employee as e inner join Employee as m on e.ManagerId = m.Id
Where e.salary>m.salary