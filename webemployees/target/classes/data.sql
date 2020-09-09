DELETE
FROM employees;

INSERT INTO employees(empid, fname, lname, salary)
    VALUES (1, 'Steve', 'Green', 45000),
           (2, 'Sam', 'Ford', 80000),
           (3, 'May', 'Jones', 75000);

alter sequence hibernate_sequence restart with 4;