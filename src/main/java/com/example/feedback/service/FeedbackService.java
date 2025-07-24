package com.example.feedback.service;

import com.example.feedback.dto.FeedbackDTO;
import com.example.feedback.entity.Feedback;

import java.util.List;

public interface FeedbackService {
    Feedback saveFeedback(FeedbackDTO feedbackDTO);
    List<Feedback> getAllFeedbacks();
}
