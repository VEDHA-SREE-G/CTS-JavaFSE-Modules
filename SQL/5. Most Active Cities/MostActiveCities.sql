select u.city as RegisteredCity, 
       count(u.user_id) as UserCount
from Users u
group by(u.city) 
order by count(u.user_id) desc
limit 5;