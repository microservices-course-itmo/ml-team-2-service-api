package com.wine.to.up.ml2.api.feign;

import com.wine.to.up.ml2.api.dto.RecommendationResponse;
import com.wine.to.up.ml2.api.service.ML2WineRecommendationService;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface ML2WineRecommendationServiceClient extends ML2WineRecommendationService {
    @Override
    @RequestLine(value = "GET /recommendations/?page={page}&size={size}")
    @Headers("Content-Type: application/json")
    RecommendationResponse recommend(@Param("page") long page, @Param("size") long size);
}
