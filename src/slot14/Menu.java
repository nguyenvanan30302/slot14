package slot14;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        int chose;
        do {
            System.out.println("Menu");
            System.out.println("1. Add student.");
            System.out.println("2. Edit student by id.");
            System.out.println("3. Delete student by id");
            System.out.println("4. Sort student by gpa");
            System.out.println("5. Sort student by name.");
            System.out.println("6. Show student.");
            System.out.println("0. Exit.");
            System.out.println("Enter number.");

            Scanner sc = new Scanner(System.in);
            chose = sc.nextInt();

            switch (chose) {
                case 1:
                    System.out.println("Add student");
                    break;
                case 2:
                    System.out.println("Edit student by id.");
                    break;
                case 3:
                    System.out.println("Delete student by id");
                    break;
                case 4:
                    System.out.println("Sort student by gpa");
                    break;
                case 5:
                    System.out.println("Sort student by name.");
                    break;
                case 6:
                    System.out.println("Show student.");
                    break;
                case 0:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("nhập lại từ 0 -> 6");
                    break;
            }
        } while (chose != 0);
    }




}
