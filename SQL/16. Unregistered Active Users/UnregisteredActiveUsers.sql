SELECT u.user_id, u.full_name
FROM Users u
LEFT JOIN Registrations r ON u.user_id = r.user_id
WHERE r.user_id IS NULL and u.registration_date  >= date_sub(curdate(), interval 30 day);
