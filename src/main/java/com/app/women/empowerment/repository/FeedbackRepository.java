package com.app.women.empowerment.repository;

import com.app.women.empowerment.models.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {}