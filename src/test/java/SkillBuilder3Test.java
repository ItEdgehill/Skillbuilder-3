import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkillBuilder3Test {

    @Test
    void leftRightTriangle() {
        String expected = "*\n";
        String actual = SkillBuilder3.leftRightTriangle(1);
        assertEquals(expected, actual, "Expecting: " + expected + "\nActual:" + actual);
        expected = "*\n**\n";
        actual = SkillBuilder3.leftRightTriangle(2);
        assertEquals(expected, actual, "Expecting: " + expected + "\nActual:" + actual);
        expected = "*\n**\n***\n****\n*****\n******\n*******\n********\n";
        actual = SkillBuilder3.leftRightTriangle(8);
        assertEquals(expected, actual, "Expecting: " + expected + "\nActual:" + actual);
    }

    @Test
    void rightRightTriangle() {
        String expected = "*\n";
        String actual = SkillBuilder3.rightRightTriangle(1);
        assertEquals(expected, actual, "Expecting: " + expected + "\nActual:" + actual);
        expected = " *\n**\n";
        actual = SkillBuilder3.rightRightTriangle(2);
        assertEquals(expected, actual, "Expecting: " + expected + "\nActual:" + actual);
        expected = "  *\n **\n***\n";
        actual = SkillBuilder3.rightRightTriangle(3);
        assertEquals(expected, actual, "Expecting: " + expected + "\nActual:" + actual);
        expected = "       *\n      **\n     ***\n    ****\n   *****\n  ******\n *******\n********\n";
        actual = SkillBuilder3.rightRightTriangle(8);
        assertEquals(expected, actual, "Expecting: " + expected + "\nActual:" + actual);
    }

    @Test
    void circle() {
        String expected = "  ****\n ******\n ******\n********\n ******\n ******\n  ****\n";
        String actual = SkillBuilder3.circle(4);
        assertEquals(expected, actual, "Expecting: " + expected + "\nActual:" + actual);
        expected = "        ********\n      ************\n     **************\n    ****************\n   ******************\n  ********************\n  ********************\n **********************\n **********************\n **********************\n **********************\n************************\n **********************\n **********************\n **********************\n **********************\n  ********************\n  ********************\n   ******************\n    ****************\n     **************\n      ************\n        ********\n";
        actual = SkillBuilder3.circle(12);
        assertEquals(expected, actual, "Expecting: " + expected + "\nActual:" + actual);
    }

    @Test
    void sumOfDivisors() {
        long[] number = {4, 14, 27, 38, 55, 89, 3045};
        long[] expected = {3, 10, 13, 22, 17, 1, 2715};
        for (int i = 0; i < number.length; i++) {
            long actual = SkillBuilder3.sumOfDivisors(number[i]);
            assertEquals(expected[i], actual, "Expecting: " + expected[i] + "\nActual:" + actual);
        }
    }

    @Test
    void isPrime(){
        long[] number = {6, 28, 496, 38, 55, 89, 3045};
        boolean[] expected = {true, true, true, false, false, false, false};
        for (int i = 0; i < number.length; i++) {
            boolean actual = SkillBuilder3.isPerfect(number[i]);
            assertEquals(expected[i], actual, "Expecting: " + expected[i] + "\nActual:" + actual);
        }
    }

    @Test
    void sumOfDivisorsWhile(){
        long[] number = {4, 14, 27, 38, 55, 89, 3045};
        long[] expected = {3, 10, 13, 22, 17, 1, 2715};
        for (int i = 0; i < number.length; i++) {
            long actual = SkillBuilder3.sumOfDivisors(number[i]);
            assertEquals(expected[i], actual, "Expecting: " + expected[i] + "\nActual:" + actual);
        }
    }
}