CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  declare M INT;
  set M = N-1;
  RETURN (
      # Write your MySQL query statement below.
      SELECT distinct salary from Employee order by salary desc
      limit 1 offset M 
  );
END