-- Wild cards
-- % = any # character, _=one character


-- Find any clients who are an llc

SELECT *
FROM client
WHERE client_name LIKE '%LLC';