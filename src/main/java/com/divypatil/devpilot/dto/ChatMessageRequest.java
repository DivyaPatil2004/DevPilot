package com.divypatil.devpilot.dto;

import jakarta.validation.constraints.NotBlank;

public record ChatMessageRequest( @NotBlank String content) {
}
