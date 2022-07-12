-- select every column from student table
SELECT * FROM student;

-- we want to change major to "Bio" from "Biology"
UPDATE student
SET major = "Bio"
WHERE major = "Biology";

--DELETE row
DELETE FROM student
WHERE major = "Physics";


-- select specific thing from column
SELECT name,major
FROM student;

-- select specific thing from column with order
SELECT name,major
FROM student
ORDER BY name;

-- select specific thing from column with order with limited the result
SELECT name,major
FROM student
ORDER BY name
LIMIT 3;

-- select where
SELECT name,major
FROM student
WHERE major="Bio";