package com.solvd.words;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.nio.charset.StandardCharsets;

public class WordsCounter {

    public static void main(String[] args) throws Exception {
        String specialWord = "of";

        File inputFile = new File("text.txt");
        File resultFile = new File("result.txt");
        String content = FileUtils.readFileToString(inputFile, StandardCharsets.UTF_8);

        String[] words = StringUtils.split(content);

        int wordCount = 0;
        for (String word : words) {
            if (specialWord.equalsIgnoreCase(word)) {
                wordCount++;
            }
        }

        FileUtils.write(resultFile, specialWord + " " + wordCount + "\n", StandardCharsets.UTF_8, true);
    }

}
