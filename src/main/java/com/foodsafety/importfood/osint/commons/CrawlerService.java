package com.foodsafety.importfood.osint.commons;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.springframework.stereotype.Service;

@Service
public class ConnectWebService {

    public Page getPage() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch();
        Page page = browser.newPage();
        page.navigate("https://www.maff.go.jp/j/press/yusyutu_kokusai/chiiki/220729.html");
        browser.close();
        playwright.close();
        return page;
    }
}
