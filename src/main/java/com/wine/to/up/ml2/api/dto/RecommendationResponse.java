package com.wine.to.up.ml2.api.dto;

import lombok.Data;

import java.util.List;

@Data
public class RecommendationResponse {
    private List<String> content;

    private Integer page;

    private Integer size;

    private Integer total;

    private Integer totalPages;
}
