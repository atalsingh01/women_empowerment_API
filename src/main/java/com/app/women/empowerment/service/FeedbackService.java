package com.app.women.empowerment.service;

import com.app.women.empowerment.models.Feedback;
import com.app.women.empowerment.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    // Save new feedback submitted by user
    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    // Get all feedback (optional - for future admin view)
    public List<Feedback> getAllFeedback() {
        return feedbackRepository.findAll();
    }
}