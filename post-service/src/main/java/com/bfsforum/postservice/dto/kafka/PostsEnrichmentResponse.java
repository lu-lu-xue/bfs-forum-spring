package com.bfsforum.postservice.dto.kafka;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * @author luluxue
 * @date 2025-06-07
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostsEnrichmentResponse {
	private UUID requestId;
	private List<PostDTO> posts;
	private LocalDateTime timestamp;
	private String error;
}
