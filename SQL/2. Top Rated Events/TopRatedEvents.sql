select e.title, avg(f.rating) as rating
from Events e 
join Feedback f on e.event_id = f.event_id
group by f.event_id
having count(f.feedback_id) >=10
order by avg(f.rating) desc;
