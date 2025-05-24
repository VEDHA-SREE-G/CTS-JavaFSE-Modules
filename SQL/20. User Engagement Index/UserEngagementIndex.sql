SELECT 
  u.user_id,
  u.full_name, 
  COUNT(DISTINCT CASE WHEN e.status = 'completed' THEN r.event_id END) AS NoOfEventsAttended,
  COUNT(f.feedback_id) AS NoOfFeedbackSubmitted
FROM Users u
LEFT JOIN Registrations r ON r.user_id = u.user_id
LEFT JOIN Events e ON e.event_id = r.event_id
LEFT JOIN Feedback f ON f.user_id = u.user_id
GROUP BY u.user_id, u.full_name;
