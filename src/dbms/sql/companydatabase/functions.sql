-- Find the no of employees
SELECT COUNT(emp_id)
FROM employee;
-- emp_id is primary key so count of emp_id will give the count of employee

-- Find the no of female employees born after 1970
SELECT COUNT(emp_id)
FROM employee WHERE sex='F' AND birth_day > '1970-01-01' ;

-- Find the average of all the employee salaries
SELECT AVG(salary)
FROM employee;

-- Find the sum of all the employee salaries
SELECT SUM(salary)
FROM employee;

-- Find out how many male and female are in the employee field
SELECT COUNT(sex),sex
FROM employee
GROUP BY sex;

-- Find the total sales of each salesman
SELECT SUM(total_sales),emp_id
FROM works_with
GROUP BY emp_id;


