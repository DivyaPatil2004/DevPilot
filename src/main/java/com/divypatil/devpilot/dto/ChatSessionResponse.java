package com.divypatil.devpilot.dto;

import java.time.Instant;
import java.util.UUID;

public record ChatSessionResponse(
        UUID id,
        UUID repositoryId,
        String title,
        Instant createdAt) {
}