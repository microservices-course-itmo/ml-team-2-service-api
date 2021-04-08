package com.wine.to.up.ml2.api.configuration;

import com.wine.to.up.ml2.api.ML2ApiProperties;
import com.wine.to.up.ml2.api.feign.ML2WineRecommendationServiceClient;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("SpringFacetCodeInspection")
@Configuration
@RequiredArgsConstructor
public class ML2FeignConfiguration {
    private final ML2ApiProperties ml2ApiProperties;

    @Bean
    public ML2WineRecommendationServiceClient wineRecommendationServiceClient() {
        return Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .client(new OkHttpClient())
                .target(ML2WineRecommendationServiceClient.class, "http://" + ml2ApiProperties.getHost());
    }
}
