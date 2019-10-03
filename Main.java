import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float totalGPAPoints = 0;
        float totalCreditHours = 0;

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
                    totalGPAPoints += 4;
                    break;
                case "A-":
                    totalGPAPoints += 3.7;
                    break;
                case "B+":
                    totalGPAPoints += 3.3;
                    break;
                case "B":
                    totalGPAPoints += 3.0;
                    break;
                case "B-":
                    totalGPAPoints += 2.7;
                    break;
                case "C+":
                    totalGPAPoints += 2.3;
                    break;
                case "C":
                    totalGPAPoints += 2.0;
                    break;
                case "C-":
                    totalGPAPoints += 1.7;
                    break;
                case "D+":
                    totalGPAPoints += 1.3;
                    break;
                case "D":
                    totalGPAPoints += 1.0;
                    break;
                case "F":
                    totalGPAPoints += 0.0;
                    break;
            }

            System.out.println("\nEnter the number of credits hours for that grade: ");
            totalCreditHours += scan.nextFloat();

            while(totalCreditHours <= 0){
                System.out.println("\nSorry, the number you entered was not valid.\nPlease enter a positive number: ");
                totalCreditHours = scan.nextFloat();
            }

            System.out.println("\n");
        }

        scan.close();

        float gpa = totalGPAPoints / totalCreditHours;

        System.out.println("\nYour semester GPA is: " + gpa);

    }
}
