SELECT u.full_name 
FROM Users u 
LEFT JOIN (
    SELECT user_id, MAX(registration_date) AS last_registration
    FROM Registrations
    GROUP BY user_id
) r ON u.user_id = r.user_id
WHERE r.user_id IS NULL OR DATEDIFF(CURDATE(), r.last_registration) >= 90;
