package com.foodsafety.importfood.osint.commons;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class TranslateServiceTests {

    @Autowired
    private ApiKey apiKey;

    @Test
    @DisplayName("API KEY 가져오기")
    void getApiKey() {
        System.out.println(apiKey.getNaverClientId());
        System.out.println(apiKey.getNaverClientSecret());
    }


}
