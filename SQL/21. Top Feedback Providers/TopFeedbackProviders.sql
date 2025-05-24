select f.user_id, 
       count(Feedback_id) 
from Feedback f 
group by f.user_id 
order by count(Feedback_id) 
desc 
limit 5;