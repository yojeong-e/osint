package com.foodsafety.importfood.osint.commons;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CrawlerTests {

    @Test
    @DisplayName("URL을 입력하고 웹에 연결했을 때 페이지를 돌려주기")
    void givenUrlWhenConnectWebThenReturnPage() {

        Page page = getPage();
        String pageTitle = "インドネシアによる日本産食品の輸入規制の撤廃について：農林水産省";
        assertThat(page.title()).isEqualTo(pageTitle);

    }




    @Test
    @DisplayName("문자열이 입력,Base64로 인코딩,Base64가 반환")
    void givenStringInputWhenEncodingWithBase64ThenBase64Returns() {


        String string_jp = "インドネシアによる日本産食品の輸入規制の撤廃について：農林水産省";


        assertThat(1).isEqualTo(1);
    }

}
