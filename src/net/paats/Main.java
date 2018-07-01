package net.paats;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previosResult = result;

        result = result - 1;
        System.out.println(previosResult + " - 1 = " + result);

        previosResult = result;

        result = result * 10;
        System.out.println(previosResult + "  * 10 = " + result);

        previosResult = result;
        result = result /5;
        System.out.println(previosResult + " / 5 = " + result);

        previosResult = result;
        result = result % 3;
        System.out.println(previosResult + " % 3 = " + result);

        result = result +1;
        System.out.println("Result is now = " +result);

        result++;
        System.out.println("Result is now = " +result);

        result--;
        System.out.println("Result is now = " +result);

        result += 2;
        System.out.println("Result is now = " +result);

        result *= 10;
        System.out.println("Result is now = " +result);

        result -= 10;
        System.out.println("Result is now = " +result);

        result /= 10;
        System.out.println("Result is now = " +result);




        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("\nIt is not an alien!");
        else
            System.out.println("\nIt is an Alien!");

        int topscore = 80;
        if (topscore <= 100)
            System.out.println("\nYou got the high score!");

        int secondtopscore = 81;
        if ((topscore > secondtopscore) && (topscore < 100))
            System.out.println("\nGreater then top score and less then 100" );

        if ((topscore > 90) || (secondtopscore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is an error");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("\nThis is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");



        // 1. Create a double variable with the value 20
        // 2. create a second variable of the type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. write an "if" statement that displays a message "Total was over de limit"
        //    if the remainder total (#4) is equel to 20 or less.

        System.out.println("\n\n\n");
        double firstValue = 20d;
        double secondValue = 80d;
        double firstResult = (firstValue + secondValue) * 25;
        System.out.println(firstValue + " + " + secondValue + " * 25 = " + firstResult );
        double secondResult = (firstValue + secondValue) % 40;
        System.out.println(firstValue + " + " + secondValue + " % 40 = " + secondResult);

        if(secondResult <= 20)
            System.out.println("Total was over de limit");
    }
}
