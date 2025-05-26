select u.full_name,
	   f.comments,
       e.title
from Users u 
join Feedback f on u.user_id = f.user_id
join Events e on f.event_id = e.event_id
where f.rating < 3;
