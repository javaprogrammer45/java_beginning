
CREATE DATABASE robots;

CREATE SCHEMA schema;

CREATE TABLE schema.jaegers(
 jaeger_id INTEGER PRIMARY KEY NOT NULL,
model_name CHAR(20) NOT NULL,
      mark CHAR(15) NOT NULL,
    height REAL,
    weight REAL,  
    status CHAR(15) NOT NULL,
    origin CHAR(15),
    launch INT,
kaiju_kill INT
);

\ir 'populate.sql'
\ir 'queries.sql'