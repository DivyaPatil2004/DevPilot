package com.divypatil.devpilot.services.ai;

import java.util.List;

import com.divypatil.devpilot.dto.CitationDto;

public record RetrievedContext(
        List<CitationDto> citations,
        String contextText) {
}