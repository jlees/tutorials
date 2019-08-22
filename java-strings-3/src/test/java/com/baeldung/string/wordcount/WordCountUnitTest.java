package com.baeldung.string.wordcount;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.StringTokenizer;

public class WordCountUnitTest {
    private String string1 = "This is a test sentence with eight words";
    private String string2 = "This#is%a test sentence with eight       words";

    @Test
    public void givenStringWith8Words_whenUsingRegexCount_ThenResultEqual8() {
        assertEquals(8, WordCounter.countWordsUsingRegex(string2));
        assertEquals(9, WordCounter.countWordsUsingRegex("no&one#should%ever-write-like,this;but:well"));
        assertEquals(7, WordCounter.countWordsUsingRegex("the farmer's wife--she was from Albuquerque"));
    }

    @Test
    public void givenStringWith8Words_whenUsingManualMethod_ThenWordCountEqual8() {
        assertEquals(8, WordCounter.countWordsManually(string1));
        assertEquals(9, WordCounter.countWordsManually("no&one#should%ever-write-like,this but   well"));
        assertEquals(7, WordCounter.countWordsManually("the farmer's wife--she was from Albuquerque"));
    }

    @Test
    public void givenAStringWith8Words_whenUsingTokenizer_ThenWordCountEqual8() {
        assertEquals(8, WordCounter.countWordsUsingTokenizer(string1));
    }
}
