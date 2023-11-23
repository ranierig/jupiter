CREATE DATABASE IF NOT EXISTS db_jupiterdsv01;

USE db_jupiterdsv01;
-- CREATE USER dbuser IDENTIFIED BY 'dbpassword';
-- GRANT ALL PRIVILEGES ON exampledb.* TO dbuser ;
CREATE TABLE tb_pessoa (
    id INT,
    name VARCHAR(255),
    email VARCHAR(255)
);