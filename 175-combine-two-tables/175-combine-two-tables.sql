# Write your MySQL query statement below
SELECT firstName, LastName, City, State
FROM Person as P left Join Address as A on P.personId = A.personId