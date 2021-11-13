import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.io.IOException;

public class MarsvinController {
    private ArrayList<Marsvin> myMarsvin = new ArrayList<>();




    public void loadMarsvin(){
        try {
            Scanner in = new Scanner(new File("marsvin.txt"));
            while(in.hasNextLine()){
                myMarsvin.add(new Marsvin(in.next(), in.next(), in.nextInt()));
            }
        }
        catch (IOException e){
            System.out.println("Error. File not found. (LoadMarsvin)");
        }
    }

    public String getMarsvinString(){
        return this.myMarsvin.toString();
    }

    public int totalFodder(){
        int myTotalFodder = 0;
        for (Marsvin m: myMarsvin){
            myTotalFodder =myTotalFodder + m.getFodder();
        }
        return myTotalFodder;
    }

    public void sortMarsvin(){
        Collections.sort(myMarsvin);
    }

}
