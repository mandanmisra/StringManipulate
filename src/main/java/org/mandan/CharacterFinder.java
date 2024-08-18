package org.mandan;

public class CharacterFinder {

    /**
     *
     * @param line Input sentence
     * @param searchChar character to be found in words of input sentence
     * @return word where searchChar exists maximum times. If in more than 1 word it
     * exists same number of times, first ford occurence is returned.
     * If input is not proper it returns string "INPUT ERROR"
     */
    public String findWord(String line, String searchChar) {

        if(line == null || line.length() == 0 || searchChar.length() != 1)
            return "INPUT ERROR";

        String[] data = line.split("[ ,.]");

        int prevMaxCharCount = -1;
        int prevWordLength = -1;
        String maxWord = "";

        for(String word : data){
            int charCount = 0;
            int wordLength = 0;

            if((charCount = findCharacterCount(word, searchChar)) > 0){
                wordLength = word.length();

                if(charCount > prevMaxCharCount){
                    prevMaxCharCount = charCount;
                    prevWordLength = wordLength;
                    maxWord = word;
                } else if(charCount == prevMaxCharCount){
                    if(wordLength > prevWordLength){
                        maxWord = word;
                    }
                }
            }
        }
        return maxWord;

    }

    /**
     *
     * @param word Its input word
     * @param searchChar It is the character to be found
     * @return number of times a character exist in input word
     */
    public int findCharacterCount(String word, String searchChar) {
        int count = 0;

        if(word == null || word.length() == 0 || searchChar == null || searchChar.length() != 1)
            return count;

        for(int i = 0; i < word.length(); ++i){
            if(word.charAt(i) == searchChar.charAt(0))
                ++count;
        }

        return count;
    }
}