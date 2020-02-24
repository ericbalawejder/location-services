USE Locations;

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

SELECT
    *
FROM
    locations;
