package com.foodsafety.importfood.osint.commons;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Getter
@RequiredArgsConstructor
public class ApiKey {
    @Value("${naver.client-id:'1'}")
    private String naverClientId;
    @Value("${naver.client-secret}")
    private String naverClientSecret;

    public String getApiKey() {
        return naverClientId;
    }

    @Override
    public String toString() {
        return "ApiKey [apiKey=" + naverClientId + "]";
    }

}
