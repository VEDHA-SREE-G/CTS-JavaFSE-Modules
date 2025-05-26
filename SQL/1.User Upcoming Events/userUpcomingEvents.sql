select u.full_name,
        e.title, 
        e.city, 
        e.start_date, 
        e.end_date, 
        e.status 
from users u 
join registrations r on u.user_id  = r.user_id 
join events e on r.event_id = e.event_id 
where status = "upcoming" and u.city = e.city;
