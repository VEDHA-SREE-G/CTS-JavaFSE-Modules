select date_format(registration_date,"%Y %M") AS month,
       count(registration_id) as registration_count 
       from Registrations 
       where registration_date <= curdate() and date_sub(curdate(), interval 12 month) 
       group by date_format(registration_date,"%Y %M");