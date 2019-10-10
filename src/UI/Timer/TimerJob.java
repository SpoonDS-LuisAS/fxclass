package UI.Timer;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TimerTask;

public class TimerJob extends TimerTask {

    //Terminal based input

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    String currencyFrom = myObj.nextLine();
    String currencyTo = myObj.nextLine(); // Read user input

    public void run(){

//        //Parameters for scanners, read a file from a PWD.
//        //Takes the values from the text files (Seperated by a new line)
//        File file = new File("/Users/luisarendsanchez/Desktop/logTest/FOREX.txt");
//        Scanner sc = null;
//
//        try{
//            sc = new Scanner(file);
//        } catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
//
//        String currencyFrom = sc.nextLine();
//        String currencyTo = sc.nextLine();


//Parameters for scanners, where the value's are being red as a full word. (following 13 lines of code)

//        File file = new File("/Users/luisarendsanchez/Desktop/logTest/FOREX.txt");
//        Scanner sc = null;
//        try{
//            sc = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        String currencies = sc.nextLine().trim();
//        if(currencies.length() != 6){
//            throw new IllegalArgumentException("Not enough characters");
//        }
//        String currencyFrom = currencies.substring(0,2);
//        String currencyTo = currencies.substring(3,5);

//        LocalDateTime localTime = LocalDateTime.now();
//        System.out.println(localTime.toString());

        MyTask task = new MyTask();
        try {
            task.perform(currencyFrom,currencyTo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
