# Write your MySQL query statement below
Select FirstName, LastName, City, State
from Person as p left join Address as a on p.personId = a.personId