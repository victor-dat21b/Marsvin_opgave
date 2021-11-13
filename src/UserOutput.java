import java.util.Scanner;

public class UserOutput {


    public static void main(String[] args) {
        new UserOutput().run();
    }


    public void run(){
        MarsvinController myController = new MarsvinController();
        Scanner in = new Scanner(System.in);
        boolean marsvinFlag = true;
        myController.loadMarsvin();
        while (marsvinFlag){
            System.out.println("Welcome to the Marsvin menu. Choose.");
            String userInput = in.nextLine();
            if (userInput.equals("see marsvin")){
                System.out.println(myController.getMarsvinString());
                System.out.println("After sorting:");
                myController.sortMarsvin();
                System.out.println(myController.getMarsvinString());
            }else if (userInput.equals("add marsvin")){

            }else if (userInput.equals("see fodder")){
                System.out.println("The total amount of fodder needed to feed all " +
                        " Marsvin is: " + myController.totalFodder());
            }else if (userInput.equals("delete marsvin")){

            }else if (userInput.equals("sort marsvin names")){
                myController.sortMarsvin();
                System.out.println("Marsvin sorted!");
            } else if (userInput.equals("sort marsvin food")){
                System.out.println("Marsvin sorted!");
            }else if (userInput.equals("sort marsvin race")){
                myController.sortMarsvin();
                System.out.println("Marsvin sorted!");
            } else {
                System.out.println("Error wrong input. Try again");
            }
        }
    }

}
