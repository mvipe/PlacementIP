----- Basic Query

-- Find All Employee
SELECT * FROM employee;

-- Find All Employee Ordered BY Salary
SELECT *
FROM employee
ORDER BY salary DESC;

-- Find First 5 Employee Ordered BY Salary
SELECT *
FROM employee
ORDER BY salary DESC
LIMIT 5;

-- Find the first name and last name for all the employees
SELECT first_name,last_name
FROM employee;

-- Find the first name and last name for all the employees with head change
SELECT first_name AS forename,last_name AS surname
FROM employee;

-- Findout all the different genders
SELECT DISTINCT sex
FROM employee;