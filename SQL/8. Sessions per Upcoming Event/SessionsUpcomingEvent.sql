select e.title as UpcomingEvents,
       count(s.session_id) as NoOfSessions
from Events e 
left join Sessions s on e.event_id = s.event_id
where e.status = "upcoming"
group by e.event_id;