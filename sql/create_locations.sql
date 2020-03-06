# Starting with MySQL 8.0.4, the MySQL team changed the
# default authentication plugin for MySQL server
# from mysql_native_password to caching_sha2_password.
#
# The command below will make the appropriate updates for your user account.
#
# See the MySQL Reference Manual for details:
# https://dev.mysql.com/doc/refman/8.0/en/caching-sha2-pluggable-authentication.html


CREATE USER 'location_services_db'@'localhost' IDENTIFIED BY 'location_services_db';

GRANT ALL PRIVILEGES ON * . * TO 'location_services_db'@'localhost';

ALTER USER 'location_services_db'@'localhost' IDENTIFIED WITH caching_sha2_password BY 'location_services_db';

CREATE DATABASE IF NOT EXISTS locations;

USE locations;

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

INSERT INTO locations (
    id,
    createdOn,
    modifiedOn,
    country,
    state,
    type,
    code,
    name
)
VALUES (
    NULL,
    "1414602645000",
    "1414602645000",
    "US",
    'ARIZONA',
    'UPS',
    'AZ',
    'desert'
);

INSERT INTO locations (
    id,
    createdOn,
    modifiedOn,
    country,
    state,
    type,
    code,
    name
)
VALUES (
    NULL,
    "1414602645001",
    "1414602645001",
    "US",
    'ARIZONA',
    'AMAZON',
    'AZ',
    'dry'
);

INSERT INTO locations (
    id,
    createdOn,
    modifiedOn,
    country,
    state,
    type,
    code,
    name
)
VALUES (
    NULL,
    "1414602645044",
    "1414602645044",
    "US",
    'COLORADO',
    'UPS',
    'CO',
    'mountain'
);

-- SELECT
--     *
-- FROM
--     locations;
