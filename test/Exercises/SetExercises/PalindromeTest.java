package Exercises.SetExercises;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class PalindromeTest {

    private LinkedList<Character> generateLinkedListsOfPalindrome;
    private Palindrome palindrome;

    @Before
    public void setUp() throws Exception {
        generateLinkedListsOfPalindrome = generateOddLinkedListsOfPalindrome();
        palindrome = new Palindrome(generateLinkedListsOfPalindrome);
    }

    @Test
    public void isLinkedListPalindrome_returnFalseForEmptyLinkedList() throws Exception {
        palindrome = new Palindrome(new LinkedList<Character>());
        assertEquals(false, palindrome.isLinkedListAPalindrome());
    }

    @Test
    public void isLinkedListPalindrome_whenLinkedListCharactersIsAPalindrome_returnTrue() throws Exception {
        assertEquals(true, palindrome.isLinkedListAPalindrome());
        palindrome = new Palindrome(generateEvenLinkedListsOfPalindrome());
        assertEquals(true, palindrome.isLinkedListAPalindrome());
    }

    @Test
    public void isLinkedListPalindrome_whenLinkedListCharacterIsNotAPalindrome_returnFalse() throws Exception {
        generateLinkedListsOfPalindrome.add('e');
        palindrome = new Palindrome(generateLinkedListsOfPalindrome);
        assertEquals(false, palindrome.isLinkedListAPalindrome());
    }

    private LinkedList<Character> generateOddLinkedListsOfPalindrome() {
        LinkedList<Character> linkedList = new LinkedList<>();
        linkedList.add('r');
        linkedList.add('a');
        linkedList.add('c');
        linkedList.add('e');
        linkedList.add('c');
        linkedList.add('a');
        linkedList.add('r');
        return linkedList;
    }

    private LinkedList<Character> generateEvenLinkedListsOfPalindrome() {
        LinkedList<Character> linkedList = new LinkedList<>();
        linkedList.add('m');
        linkedList.add('a');
        linkedList.add('n');
        linkedList.add('n');
        linkedList.add('a');
        linkedList.add('m');
        return linkedList;
    }
}