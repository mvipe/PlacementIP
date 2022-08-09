--Union

-- Find a list of all employees
SELECT first_name
FROM employee
UNION
SELECT branch_name
FROM branch;

-- Rule for union
-- 1. column should be same
-- 2. first_name and branch_name should be of same type



-- Join
INSERT INTO branch VALUES(4,'Buffalo',NULL,NULL);

-- Find all branches and names of their manager
SELECT employee.emp_id,employee.first_name,branch.branch_name
FROM employee
JOIN branch
ON employee.emp_id=branch.mgr_id;
