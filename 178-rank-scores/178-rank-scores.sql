# Write your MySQL query statement below
SELECT Score, (SELECT count(distinct Score) from Scores where Score >= s.Score)
as "rank" 
from Scores as s
order by Score desc;