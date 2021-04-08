package com.wine.to.up.ml2.api.service;

import com.wine.to.up.ml2.api.dto.RecommendationResponse;

public interface ML2WineRecommendationService {
    RecommendationResponse recommend(long page, long size);
}
