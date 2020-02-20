CREATE DATABASE IF NOT EXISTS Locations;

USE Locations;

DROP TABLE IF EXISTS locations;

CREATE TABLE locations
(
    id INT AUTO_INCREMENT,
    code VARCHAR(200),
    country VARCHAR(200),
    state VARCHAR(200) NULL,
    type VARCHAR(200),
    name VARCHAR(200),
    createdON VARCHAR(200),
    modifiedOn VARCHAR(200),
PRIMARY KEY (id)
);