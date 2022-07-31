package com.foodsafety.importfood.osint.commons;

import com.microsoft.playwright.Page;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Base64;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CrawlerServiceTests {

    @Autowired
    private CrawlerService crawlerService;

    @Test
    @DisplayName("URL을 입력하고 웹에 연결했을 때 페이지를 돌려주기")
    void givenUrlWhenConnectWebThenReturnPage() {
        String url = "https://www.maff.go.jp/j/press/yusyutu_kokusai/chiiki/220729.html";
        Page page = crawlerService.getPage(url);
        String pageTitle = "インドネシアによる日本産食品の輸入規制の撤廃について：農林水産省";
        assertThat(page.title()).isEqualTo(pageTitle);

    }

    @Test
    @DisplayName("문자열이 입력,Base64로 인코딩,Base64가 반환")
    void givenStringInputWhenEncodingWithBase64ThenBase64Returns() {

        String originalString = "インドネシアによる日本産食品の輸入規制の撤廃について：農林水産省";
        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());
        assertThat(encodedString).isEqualTo("44Kk44Oz44OJ44ON44K344Ki44Gr44KI44KL5pel5pys55Sj6aOf5ZOB44Gu6Ly45YWl6KaP5Yi244Gu5pKk5buD44Gr44Gk44GE44Gm77ya6L6y5p6X5rC055Sj55yB");
    }


}
