import java.util.*;

public class TripPlanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Greeting();
        TravelBudget();
        //TimeDifference();
    }

    public static void Greeting() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.next();
        System.out.print("hello " + name + " where would you like to go? ");
        String dest = input.next();
        System.out.println(dest + " sounds like a great place to go!");
        System.out.println();
    }
    public static void TravelBudget(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many miles away is your destination? ");
        Integer miles = input.nextInt();
        System.out.print("How many days will you be spending ");
        Integer days = input.nextInt();
        System.out.print("What is your total budget in USD? ");
        Integer budget = input.nextInt();
        System.out.print("What is the currency symbol for your destination? ");
        String ccy = input.next();
        System.out.print("What is the currency conversion from dollars? ");
        Double convert = input.nextDouble();
        System.out.println(days+" "+budget+" "+ccy+" "+convert);

        Integer hours = days*24;
        Integer minutes = hours*60;
        Integer seconds = minutes*60;

        Integer usddays = budget/days;

        Double curr = budget*convert;
        Double currday = curr/days;

        System.out.println("you will spend "+hours+" in hours"+minutes+
        " in minutes "+seconds+" in seconds");
        System.out.println("your total budget is "+budget+" and "+
        usddays);
        System.out.println("your total budget in the destination"+curr+
        " your total budget per day in the local currency is \n "+currday);


    }
}
