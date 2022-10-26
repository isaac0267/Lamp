import java.util.Scanner;

public class Lamp {
    private boolean lampPower; // according to the assignment we don't have a lot of attribute
    private int choice;

    // setter for the boolean lampPower. To see if the lamp is on or off.
    public  void setLampPower(boolean lampPower){
        this.lampPower=lampPower;
    }
    // getter for the lamp power.
    public boolean isLampPower(){
        return this.lampPower;
    }
    // constructor for the lampPower.
    public Lamp( boolean lampPower){
        this.lampPower=lampPower;}

    public void pushSwitch(){
        Scanner input=new Scanner(System.in);
        System.out.println("\nPress one to turn on the lamp" + // i make a statement
                "press two to turn off the lamp");
        int userChoice; // I use the int to give the user to choice.
        do {    // use the do while to aske the user aging and aging.
            userChoice=input.nextInt(); // to print the user choice.

        switch (userChoice) {
            case 1:
                if (lampPower == true) // if the user press again 1, it will print the one beacuse it already on.
                    System.out.println("The lamp cannot turn on because is already turn on"); // print this message
                else {
                    this.lampPower = true;
                    System.out.println(" Lamp is turn on "); // if the user press 1 it mean is on.
                }
                break;

            case 2:
                if (lampPower == true){   // if the user is press two it will print "lamp can not turn off beacuse it is already off"beacuse it already is off
                    this.lampPower = false;
                System.out.println("The lamp is off");
        }else {
                    System.out.println("lamp can not turn off beacuse it is already off");
                }
                    break;
            case 3:
                System.out.println("quite");
                break;

            default: // we use this method for make sure if the user enter something else than one or two. The programme will aske you to tray agasin
                System.out.println("\n The number has to be between the one or two or three");
                System.out.println("Tray agin");
                pushSwitch();
                userChoice=input.nextInt();


        }

    }
        while (userChoice==1|| userChoice==2);


}}
