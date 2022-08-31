package com.test.find;

import java.util.List;

import java.util.Arrays;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LongestSubStringTest {
  
  private LongestSubString longestSubString = new LongestSubString();

  @Test
  @DisplayName("find longest substring for abcabcbb")
  void test1(){
    String data = "abcabcbb";
    assertEquals(3, longestSubString.longestSubString(data), "Longest SubString would be 3");
  }

  @Test
  @DisplayName("find longest Substring for bbbbb")
  void test2(){
    String data = "bbbbb";
    assertEquals(1, longestSubString.longestSubString(data), "Longest SubString would be 1");
  }

  @Test
  @DisplayName("find longest Substring for ABDEFGABEF")
  void test3(){
    String data = "ABDEFGABEF";
    assertEquals(6, longestSubString.longestSubString(data), "Longest SubString would be 6");
  }

}
