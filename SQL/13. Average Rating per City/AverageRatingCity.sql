select e.city,
	   avg(f.rating) as AverageRating
from Events e 
left join Feedback f on f.event_id = e.event_id
group by e.city;