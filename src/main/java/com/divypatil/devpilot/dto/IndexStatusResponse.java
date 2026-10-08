package com.divypatil.devpilot.dto;

import java.time.Instant;
import java.util.UUID;

import com.divypatil.devpilot.entity.IndexStatus;

public record IndexStatusResponse(
        UUID repositoryId,
        IndexStatus indexStatus,
        int filesTotal,
        int filesProcessed,
        int chunkCount,
        Instant indexedAt,
        String errorMessage) {
}