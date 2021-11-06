package com.company.languageapp;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class HelloLangTest {
    @Test
    public void testHelloLang() throws IOException {
        HelloLang.main(new String[]{"en"});
    }
}