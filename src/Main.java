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
        int addResult = add(3, 8);
        System.out.println(addResult);

        // 2. add (int a, int b, int c, int d)
        int addTwoResult = add(3, 8, 4, 9);
        System.out.println(addTwoResult);

        // 3. morningGreeting (String name)
        String morningGreetingResult = morningGreeting("Miguel Wang");
        System.out.println(morningGreetingResult);

        // 4. afternonGreeting (String name)
        String afternoonGreetingResult = afternoonGreeting("Miguel Wang");
        System.out.println(afternoonGreetingResult);

        // 5. triple (Stirng string)
        String tripleResult = triple("oohbaby");
        System.out.println(tripleResult);

        // 6. half (int integer)
        double halfResult = half(17);
        System.out.println(halfResult);

        // 7. roundPositiveValueToNearestInteger
        int roundPositiveValueToNearestIntegerResult = roundPositiveValueToNearestInteger(8.5);
        System.out.println(roundPositiveValueToNearestIntegerResult);

        // 8. roundNegativeValueToNearestInteger
        int roundNegativeValueToNearestIntegerResult = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(roundNegativeValueToNearestIntegerResult);
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
        return (double)integer/2;
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
