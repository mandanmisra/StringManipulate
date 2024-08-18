package main.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mandan.CharacterFinder;

public class CharacterFinderTest {

    CharacterFinder characterFinder;

    @Before
    public void setup(){
        characterFinder = new CharacterFinder();
    }

    @Test
    public void findCharacterCountMissingTest(){
        Assert.assertEquals(characterFinder.findCharacterCount("aaaa", "b"), 0);
    }

    @Test
    public void findCharacterCountAvailableTest(){
        Assert.assertEquals(characterFinder.findCharacterCount("abab", "b"), 2);
    }

    @Test
    public void findCharacterCountMissingStringTest(){
        Assert.assertEquals(characterFinder.findCharacterCount("", "b"), 0);
    }

    @Test
    public void findCharacterCountMissingCharacterTest(){
        Assert.assertEquals(characterFinder.findCharacterCount("abab", ""), 0);
    }

    @Test
    public void findCharacterCountMissingBothTest(){
        Assert.assertEquals(characterFinder.findCharacterCount("", ""), 0);
    }

    @Test
    public void findCharacterCountNullBothTest(){
        Assert.assertEquals(characterFinder.findCharacterCount("", ""), 0);
    }

    @Test
    public void findCharacterCountLongCharacterTest(){
        Assert.assertEquals(characterFinder.findCharacterCount("abab", "ab"), 0);
    }


    @Test
    public void findWordSingleWordTest(){
        String inputStr = "This is a very long sentence and I want to educate everyone in this whole crazy world….";
        Assert.assertEquals(characterFinder.findWord(inputStr , "z"), "crazy");
    }

    @Test
    public void findWordSingleWordCaseTest(){
        String inputStr = "This is a very long sentence and I want to educate everyone in this whole crazy world….";
        Assert.assertEquals(characterFinder.findWord(inputStr , "I"), "I");
    }

    @Test
    public void findWordDoubleWordTest(){
        String inputStr = "This is a very long sentence and I want to educate everyone in this whole crazy world….";
        Assert.assertEquals(characterFinder.findWord(inputStr , "e"), "sentence");
    }

    @Test
    public void findWordTripleWordTest(){
        String inputStr = "This is a very long sentence and I want to educate everyone in this whole crazy world till then celebrate";
        Assert.assertEquals(characterFinder.findWord(inputStr , "e"), "celebrate");
    }

    @Test
    public void findWordJunkCharacterTest(){
        String inputStr = "This is a very long sentence and I want to educate everyone in this whole crazy world till then celebrate";
        Assert.assertEquals(characterFinder.findWord(inputStr , "eer"), "INPUT ERROR");
    }

    @Test
    public void findWordMissingCharacterTest(){
        String inputStr = "This is a very long sentence and I want to educate everyone in this whole crazy world till then celebrate";
        Assert.assertEquals(characterFinder.findWord(inputStr , ""), "INPUT ERROR");
    }

    @Test
    public void findWordNullInputTest(){
        String inputStr = null;
        Assert.assertEquals(characterFinder.findWord(inputStr , ""), "INPUT ERROR");
    }

    @Test
    public void findWordBlankInputTest(){
        String inputStr = "";
        Assert.assertEquals(characterFinder.findWord(inputStr , "a"), "INPUT ERROR");
    }
}
