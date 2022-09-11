# Write your MySQL query statement below
SELECT Email 
From Person 
Group By Email
Having Count(Email)>1