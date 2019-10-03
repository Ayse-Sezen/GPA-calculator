import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grade = 0;
        double creditHours = 0;
        double totalGPAPoints = 0;
        double totalCreditHours = 0;

        System.out.println("How many grades will you be entering? ");
        int numberOfGrades = scan.nextInt();

        while(numberOfGrades <= 0){
            System.out.println("\nSorry, the number you entered was not valid.\nPlease enter a positive number: ");
            numberOfGrades = scan.nextInt();
        }

        for(int i = 0; i < numberOfGrades; i++){
            System.out.println("\n\nPlease enter a letter grade: ");

            String s = scan.next();

            switch(s){
                case "A":
                    grade = 4;
                    break;
                case "A-":
                    grade = 3.7;
                    break;
                case "B+":
                    grade = 3.3;
                    break;
                case "B":
                    grade = 3.0;
                    break;
                case "B-":
                    grade = 2.7;
                    break;
                case "C+":
                    grade = 2.3;
                    break;
                case "C":
                    grade = 2.0;
                    break;
                case "C-":
                    grade = 1.7;
                    break;
                case "D+":
                    grade = 1.3;
                    break;
                case "D":
                    grade = 1.0;
                    break;
                case "F":
                    grade = 0.0;
                    break;
            }

            System.out.println("\nEnter the number of credits hours for that grade: ");
            creditHours = scan.nextDouble();

            while(creditHours <= 0){
                System.out.println("\nSorry, the number you entered was not valid.\nPlease enter a positive number: ");
                creditHours = scan.nextDouble();
            }

            totalGPAPoints += (grade * creditHours);
            totalCreditHours += creditHours;

            System.out.println("\n");
        }

        scan.close();

        double gpa = totalGPAPoints / totalCreditHours;

        System.out.println("\nYour semester GPA is: " + gpa);

    }
}
