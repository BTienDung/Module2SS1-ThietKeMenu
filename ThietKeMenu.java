package season1.ThietKeMenu;

import java.util.Scanner;

//Menu
//Draw the triangle
//Draw the square
//Draw the rectangle
//Exit
//Enter your choice:
public class ThietKeMenu {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Draw the triangle");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Draw the triangle");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                break;
            case 3:
                System.out.println("* * * * * ");
                System.out.println("*       * ");
                System.out.println("* * * * * ");
                break;
                default:
                    break;
        }
    }
}
