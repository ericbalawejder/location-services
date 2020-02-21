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

SELECT
	*
FROM
	locations;
