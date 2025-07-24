package com.example.feedback.service;

import com.example.feedback.dto.FeedbackDTO;
import com.example.feedback.entity.Feedback;
import com.example.feedback.repository.FeedbackRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FeedbackServiceTest {

    private FeedbackRepository feedbackRepository;
    private FeedbackServiceImpl feedbackService;

    @BeforeEach
    void setUp() {
        feedbackRepository = mock(FeedbackRepository.class);
        feedbackService = new FeedbackServiceImpl(feedbackRepository);
    }

    @Test
    void saveFeedback_shouldMapAndSaveCorrectly() {
        FeedbackDTO dto = new FeedbackDTO();
        dto.setName("Shriraj");
        dto.setEmail("patilshriraj6@gmail.com");
        dto.setMessage("This is good");

        Feedback saved = new Feedback();
        saved.setId(1L);
        saved.setName(dto.getName());
        saved.setEmail(dto.getEmail());
        saved.setMessage(dto.getMessage());

        when(feedbackRepository.save(any(Feedback.class))).thenReturn(saved);

        Feedback result = feedbackService.saveFeedback(dto);

        assertNotNull(result);
        assertEquals("Shriraj", result.getName());
        assertEquals("patilshriraj6@gmail.com", result.getEmail());
        assertEquals("This is good", result.getMessage());

        ArgumentCaptor<Feedback> captor = ArgumentCaptor.forClass(Feedback.class);
        verify(feedbackRepository, times(1)).save(captor.capture());
        Feedback passed = captor.getValue();

        assertEquals("Shriraj", passed.getName());
        assertEquals("patilshriraj6@gmail.com", passed.getEmail());
        assertEquals("This is good", passed.getMessage());
    }

    @Test
    void getAllFeedbacks_shouldCallFindAll() {
        when(feedbackRepository.findAll()).thenReturn(List.of());

        List<Feedback> feedbacks = feedbackService.getAllFeedbacks();

        verify(feedbackRepository, times(1)).findAll();
        assertNotNull(feedbacks);
    }
}
