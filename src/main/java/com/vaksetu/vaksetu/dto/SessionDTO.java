package com.vaksetu.vaksetu.dto;

import jakarta.validation.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SessionDTO {

    private String topic;
    private int score;
    private String feedback;
    private Long userId;
}
