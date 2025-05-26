select e.title as Event,
	   count(r.registration_id) as RegisterationCount
from Events e 
join Registrations r on e.event_id = r.event_id
group by e.title
order by count(r.registration_id) desc 
limit 3;