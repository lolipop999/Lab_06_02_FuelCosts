import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int gallonsOfGas = 0;
        int fuelEfficiency = 0;
        double pricePerGallon = 0;
        String trash = "";
        boolean notInteger = true;
        double costPer100Miles = 0;
        double gallonsPer100Miles = 0;
        int distanceCarCanGo = 0;

        Scanner in = new Scanner(System.in);

        //input gallons of gas left in tank

        do {
            System.out.print("How many gallons of gas do you have left in your tank: ");

            if (in.hasNextInt())
            {
                gallonsOfGas = in.nextInt();
                in.nextLine();

                // test if input is negative

                if (gallonsOfGas < 0)
                {
                    System.out.println("You cannot have less than 0 gallons of gas in your tank.");
                    notInteger = true;
                }
                else
                {
                    notInteger = false;
                }
            }

            // test is input is not int
            else
            {
                trash = in.nextLine();
                System.out.println("Please input an integer: " + trash);
            }
        }
        while (notInteger);

        //fuel efficiency

        do {
            System.out.print("How many miles per gallon does your car go (Fuel Efficiency): ");

            if (in.hasNextInt())
            {
                fuelEfficiency = in.nextInt();
                in.nextLine();

                // test if input is negative

                if (fuelEfficiency < 0)
                {
                    System.out.println("Your fuel efficiency cannot be less than 0.");
                    notInteger = true;
                }
                else
                {
                    notInteger = false;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please input an integer: " + trash);
                notInteger = true;
            }
        }
        while (notInteger);

        //price per gallon

        do {
            System.out.print("What is the cost of gas per gallon: ");

            if (in.hasNextDouble())
            {
                pricePerGallon = in.nextDouble();
                in.nextLine();

                // test if input is negative

                if (pricePerGallon < 0)
                {
                    System.out.println("The price per gallon cannot be negative.");
                    notInteger = true;
                }
                else
                {
                    notInteger = false;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please input a price: " + trash);
                notInteger = true;
            }
        }
        while (notInteger);

        gallonsPer100Miles = 100/fuelEfficiency;
        costPer100Miles = gallonsPer100Miles * pricePerGallon;

        System.out.println("The cost per 100 miles is $" + costPer100Miles + ".");

        distanceCarCanGo = fuelEfficiency * gallonsOfGas;

        System.out.println("Your car can travel " + distanceCarCanGo + " miles.");






    }
}