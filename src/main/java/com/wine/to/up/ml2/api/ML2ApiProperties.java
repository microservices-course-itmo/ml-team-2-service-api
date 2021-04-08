package com.wine.to.up.ml2.api;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@SuppressWarnings("SpringPropertySource")
@PropertySource("classpath:application-ml2-api-${spring.profiles.active:local}.properties")
@ConfigurationProperties(prefix = "ml2.api")
@Setter
@Component
@Getter
public class ML2ApiProperties {
    private String host;
}
