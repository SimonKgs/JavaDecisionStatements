public class IfElse {

    public static void main(String[] args) {
        int number = 12;

        if (number < 8) {
            System.out.println("the number is smaller");
        } else if (number > 8) {
            System.out.println("the number is bigger");
        } else{
            System.out.println("the number is equal");
        }

        // using not ! operator
        boolean test = false;

        if (!test) {
            System.out.println("test is false");
        } else {
            System.out.println("test is true");
        }
        
        
        // ternary
        int biggerNumber = (10 > number) ? 10 : number;
        System.out.println("biggerNumber = " + biggerNumber);
    }
}
