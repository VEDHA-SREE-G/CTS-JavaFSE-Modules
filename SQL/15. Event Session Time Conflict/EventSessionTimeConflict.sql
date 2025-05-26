SELECT s1.event_id,
       s1.session_id AS Session1,
       s1.start_time AS Start1,
       s1.end_time AS End1,
       s2.session_id AS Session2,
       s2.start_time AS Start2,
       s2.end_time AS End2
FROM Sessions s1
JOIN Sessions s2 ON s1.event_id = s2.event_id
                  AND s1.session_id <> s2.session_id
                  AND s1.start_time < s2.end_time
                  AND s1.end_time > s2.start_time
ORDER BY s1.event_id;
