select e.event_id,
       e.title as Events
from Events e 
join Registrations r on e.event_id = r.event_id
left join Feedback f on r.event_id = f.event_id
where f.event_id is null;
