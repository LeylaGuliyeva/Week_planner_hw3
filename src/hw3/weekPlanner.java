package hw3;
import java.util.Locale;
import java.util.Scanner;

public class weekPlanner {
    public static void main(String[] arg){
        String scedule[][] = new String[7][2];
        scedule[0][0] = "Sunday";
        scedule[0][1] = "do home work";
        scedule[1][0] = "Monday";
        scedule[1][1] = "go to courses; watch a film";
        scedule[2][0]="Tuesday";
        scedule[2][1]="Take care of pets";
        scedule[3][0]="Wednesday";
        scedule[3][1]="do cycling";
        scedule[4][0]="Thursday";
        scedule[4][1]="go to the gym";
        scedule[5][0]="Friday";
        scedule[5][1]="hang on with friends";
        scedule[6][0]="Saturday";
        scedule[6][1]="visit relatives";

    boolean flag=true;
    while(flag){
        System.out.print("Please, input the day of the week: ");
        Scanner sn=new Scanner(System.in);
        Scanner sn_c=new Scanner(System.in);
        String day=sn.nextLine();
        day=day.trim();
        switch (day.toLowerCase(Locale.ROOT)){
            case "monday":
                System.out.println("Your tasks for Monday: "+scedule[1][1]);
                break;
            case "tuesday":
                System.out.println("Your tasks for Tuesday: "+scedule[2][1]);
                break;
            case "wednesday":
                System.out.println("Your tasks for Wednesday: "+scedule[3][1]);
                break;
            case "thursday":
                System.out.println("Your tasks for Thursday: "+scedule[4][1]);
                break;
            case "friday":
                System.out.println("Your tasks for Friday: "+scedule[5][1]);
                break;
            case "saturday":
                System.out.println("Your tasks for Saturday: "+scedule[6][1]);
                break;
            case "sunday":
                System.out.println("Your tasks for Sunday: "+scedule[0][1]);
                break;
            case "exit":
                flag = false;
                break;
            case "change monday":
                System.out.println("Please, input new tasks for Monday.");
                scedule[1][1]=sn_c.nextLine();
                break;
            case "change tuesday":
                System.out.println("Please, input new tasks for Tuesday.");
                scedule[2][1]=sn_c.nextLine();
                break;
            case "change wednesday":
                System.out.println("Please, input new tasks for Wednesday.");
                scedule[3][1]=sn_c.nextLine();
                break;
            case "change thursday":
                System.out.println("Please, input new tasks for Thursday.");
                scedule[4][1]=sn_c.nextLine();
                break;
            case "change friday":
                System.out.println("Please, input new tasks for Friday.");
                scedule[5][1]=sn_c.nextLine();
                break;
            case "change saturday":
                System.out.println("Please, input new tasks for Saturday.");
                scedule[6][1]=sn_c.nextLine();
                break;
            case "change sunday":
                System.out.println("Please, input new tasks for Sunday.");
                scedule[0][1]=sn_c.nextLine();
                break;
            default:
                System.out.println("Sorry, I don't understand you, please try again.");
                break;
        }}}}
