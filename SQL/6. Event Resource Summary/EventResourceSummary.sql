select e.event_id,
	   e.title,
	   count(r.resource_id) as NoOfResources
from Events e 
left join Resources r on e.event_id = r.event_id
group by e.event_id;