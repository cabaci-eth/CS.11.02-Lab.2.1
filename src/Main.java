/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Miguel Wang
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        // 1. add (int a, int b)
        System.out.println(String.valueOf(add(3, 8)));

        // 2. add (int a, int b, int c, int d)
        System.out.println(String.valueOf(add(3, 8, 4, 9)));

        // 3. morningGreeting (String name)
        System.out.println(String.valueOf(morningGreeting("Miguel Wang")));

        // 4. afternonGreeting (String name)
        System.out.println(String.valueOf(afternoonGreeting("Miguel Wang")));

        // 5. triple (Stirng string)
        System.out.println(String.valueOf(triple("oohbaby")));

        // 6. half (int integer)
        System.out.println(String.valueOf(half(17)));

        // 7. roundPositiveValueToNearestInteger
        System.out.println(String.valueOf(roundPositiveValueToNearestInteger(8.5)));

        // 8. roundPositiveValueToNearestInteger
        System.out.println(String.valueOf(roundNegativeValueToNearestInteger(-8.5)));
    }

    // 1. add
    public static int add(int a, int b){
        return a + b;
    }
    
    // 2. add
    public static int add(int a, int b, int c, int d){
        return add(add(a, b), add(c, d));
    }

    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String string){
        return string.repeat(3);
        // or string+string+string
    }

    // 6. half
    public static double half(int integer){
        return (float)integer/2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double decimal){
        return (int)(decimal + 0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double decimal){
        return (int)(decimal - 0.5);
    }

}
