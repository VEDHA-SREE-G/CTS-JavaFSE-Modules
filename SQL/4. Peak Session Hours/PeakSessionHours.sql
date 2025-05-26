select e.title as event, 
	   count(s.session_id) as NoOfSessionsBw10To12
from Events e left join Sessions s on e.event_id = s.event_id
where time(s.start_time) between '10:00:00' and '11:59:59'
group by e.event_id;