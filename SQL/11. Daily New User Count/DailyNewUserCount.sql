select date(u.registration_date),
	   count(u.user_id)
from Users u 
where DATEDIFF(CURDATE(), u.registration_date) <= 6
group by date(u.registration_date)
order by date(u.registration_date) asc;