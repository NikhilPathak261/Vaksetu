package com.vaksetu.vaksetu.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SessionDTO {

    public String getTopic(){
        return topic;
    }
    @NotBlank(message = "Topic cannot be empty")
    private String topic;

    @Min(value=0, message = "Score cannot be negative")
    @Max(value=100, message = "Score cannot exceed 100")
    private int score;

    @NotBlank(message = "Feedback cannot be empty")
    private String feedback;

    @NotNull(message = "User ID is required")
    private Long userId;
}
