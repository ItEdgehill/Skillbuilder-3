/**
 * SkillBuilder3 is a class for completing
 *  Skill Builder 3 in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder3
{
    public static String repeat(String s, int numOfTimesToRepeat)
    {
        String result = "";
        for(int time = 0; time < numOfTimesToRepeat; time++){
        result += s;
        }
        return result;
    }
    public static String leftRightTriangle(int height)
    {
        String str = "";
        // TODO: replace this line with your code
        for(int count = 1; count <= height; count++){
            str += repeat("*",count) + "\n";
        }
        return str;
    }

    public static String rightRightTriangle(int height) {
        String str = "";
        // TODO: replace this line with your code
        for (int count = 1; count <= height; count++) {
            str += repeat(" ", height - count) + repeat("*", count) + "\n";
        }
            return str;
        }


    public static String circle(int radius)
    {
        String str = "";
        // TODO: replace this line with your code

        for(int i = radius - 1; i >= -radius + 1; i --) {
            str += repeat(" ", radius - (int) (Math.sqrt(Math.pow(radius, 2.0) - Math.pow(i, 2))));
            str += repeat("*", 2 * (int) (Math.sqrt(Math.pow(radius, 2.0) - Math.pow(i, 2))));
            str += "\n";
        }

        return str;
    }

    public static long sumOfDivisors(long number) {
        long sum = 0;
        // TODO: replace this line with your code

        for(int count = 1; count < number; count++) {
            if (number % count == 0) {
                sum += count;
            }
        }

        return sum;
    }

    public static boolean isPerfect(long number){
        if (sumOfDivisors(number) == number){
            return true;
        }

        return false;
    }

    public static long sumOfDivisorsUsingWhile(long number){
        long sum = 0;
        // TODO: replace this line with your code
        int count = 1;
        while(count < number){
            if(number % count == 0){
                sum += count;
            }
            count++;
        }
        return sum;
    }
}
