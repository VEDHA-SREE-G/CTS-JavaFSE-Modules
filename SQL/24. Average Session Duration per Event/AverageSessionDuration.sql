select event_id, avg(timestampdiff(minute,start_time,end_time)) as Average_Time
from Sessions 
group by event_id;