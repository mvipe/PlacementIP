CREATE TABLE student (
    student_id INT,
    name VARCHAR(20) NOT NULL,
    major VARCHAR(20) DEFAULT("undecided"),
    PRIMARY KEY(student_id)

);


DESCRIBE student;
-- drop student table
DROP TABLE student;
-- add gpa column to student table
ALTER TABLE student ADD gpa DECIMAL(3);
-- remove gpa column from student table
ALTER TABLE student DROP gpa;
-- select all from student table
SELECT * FROM student;
-- insert data
INSERT INTO student VALUES(
    1,'jack',"Biology"
);

INSERT INTO student VALUES(
    2,'mack','Chemistry'
);



-- Lets say we dont have any idean about any column
INSERT INTO student(student_id, name) VALUES(
    3,'clarie'
);

INSERT INTO student VALUES(
    4,'mike','Computer Sc'
);