public class SwitchSentece {
    public static void main(String[] args) {

        int day = 7;

        // classic structure
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("It is not a day");
            break;
        }

        boolean isStrange = true;

        // new syntaxis from java 12+
        // also yield is used to return a value
        // is like a return but used inside this new switch syntax
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Monday";
            case 5 -> "Tuesday";
            case 6 -> "Wednesday";
            case 7 -> "Sunday";
            case 8 -> {
                if (isStrange) {
                    yield "Strange day";
                } else {
                    yield "Maybe not too strange?";
                }
            }
            case 9, 10, 11 -> "This is how many values fall in same place with this new syntax";
            default -> "Not a valid day";
        };

        System.out.println("dayName = " + dayName);


    }
}
