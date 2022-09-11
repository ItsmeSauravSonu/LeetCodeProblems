# Write your MySQL query statement below
SELECT Email from
(SELECT Email, COUNT(Email) As c
From Person
Group By Email) as Temp
where c>1