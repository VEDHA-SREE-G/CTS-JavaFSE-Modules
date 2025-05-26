select u.full_name as Organizer,
	   count(e.event_id) as NoOfCreatedEvents,
       e.status
from Events e 
join Users u on e.organizer_id = u.user_id
group by e.organizer_id, e.status ;
       