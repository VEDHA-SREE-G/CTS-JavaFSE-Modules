select user_id, event_id 
       from Registrations 
       group by user_id, event_id 
       having count(registration_id) > 1;