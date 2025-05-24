select e.event_id, 
	   e.title 
from Events e 
left join Resources r on r.event_id = e.event_id
where r.resource_id is null;