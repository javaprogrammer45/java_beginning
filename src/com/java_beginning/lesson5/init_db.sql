CREATE DATABASE robots;

CREATE TABLE jaegers (
    PRIMARY KEY(jaeger_id),
    jaeger_id  INTEGER  NOT NULL,
    model_name CHAR(20) NOT NULL,
    mark       CHAR(15) NOT NULL,
    height     REAL,
    weight     NUMERIC,  
    status     CHAR(15) NOT NULL,
    origin     CHAR(15),
    launch     INT,
    kaiju_kill INT
);

\ir 'populate.sql'
\ir 'queries.sql'