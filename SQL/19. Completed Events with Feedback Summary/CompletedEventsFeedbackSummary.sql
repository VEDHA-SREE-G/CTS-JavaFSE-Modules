select e.title, 
	   count(registration_id), 
       avg(f.rating) 
from Events e 
left join Registrations r on r.event_id = e.event_id
left join Feedback f on f.event_id = e.event_id
where e.status ="completed"
group by e.event_id;