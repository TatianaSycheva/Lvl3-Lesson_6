import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void testFindFourCopyAfterOne() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = {5, 6, 7, 8, 9, 10};
        int[] actual = Main.findLastFourCopyAfter(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testFindFourCopyAfterTwo() {
        int[] input = {1, 4, 2, 5, 8, 4, 3, 6, 7};
        int[] expected = {3, 6, 7};
        int[] actual = Main.findLastFourCopyAfter(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testFindFourCopyAfterThree() {
        int[] input = {1, 2, 3, 5, 6, 7, 8, 9};
        assertThrows(RuntimeException.class, () -> Main.findLastFourCopyAfter(input));
    }

    @Test
    void testFindFourCopyAfterFour() {
        int[] input = {};
        assertThrows(RuntimeException.class, () -> Main.findLastFourCopyAfter(input));
    }



    @Test
    void testCheckSequenceOne() {
        int[] input = {1, 4, 1, 4, 1, 4, 1, 4, 1, 4};
        boolean expected = true;
        boolean actual = Main.checkSequence(input);
        assertEquals(expected, actual);
    }

    @Test
    void testCheckSequenceTwo() {
        int[] input = {1, 4, 1, 1};
        boolean expected = true;
        boolean actual = Main.checkSequence(input);
        assertEquals(expected, actual);
    }

    @Test
    void testCheckSequenceThree() {
        int[] input = {4, 4, 4, 4, 4};
        boolean expected = false;
        boolean actual = Main.checkSequence(input);
        assertEquals(expected, actual);
    }

    @Test
    void testCheckSequenceFour() {
        int[] input = {};
        boolean expected = false;
        boolean actual = Main.checkSequence(input);
        assertEquals(expected, actual);
    }


    @Test
    void testCheckSequenceFive() {
        int[] input = {1, 2, 3, 4, 5, 6};
        boolean expected = false;
        boolean actual = Main.checkSequence(input);
        assertEquals(expected, actual);
    }

    @Test
    void testCheckSequenceSix() {
        int[] input = {5, 9, 4, 3, 2};
        boolean expected = false;
        boolean actual = Main.checkSequence(input);
        assertEquals(expected, actual);
    }

    @Test
    void testCheckSequenceSeven() {
        int[] input = {7, 2, 14, 5, 6};
        boolean expected = false;
        boolean actual = Main.checkSequence(input);
        assertEquals(expected, actual);
    }
}
