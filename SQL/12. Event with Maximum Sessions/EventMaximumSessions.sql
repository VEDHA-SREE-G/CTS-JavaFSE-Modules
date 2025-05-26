select e.title,
	   count(s.session_id) as NoOfSessions
from Events e 
left join Sessions s on e.event_id = s.event_id
group by e.event_id 
order by count(s.session_id) desc LIMIT 1;
