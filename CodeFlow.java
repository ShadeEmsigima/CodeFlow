import javax.management.Notification;

public class CodeFlow{
    public static void main(String[] args) {
    {
        System.out.println("===============================\n");
    }       
    int cookiesInStash = 2;

    switch(cookiesInStash){
      case 10: System.out.println("There be 10 cookies in me stash, yar!"); 
      break;
      case 2: System.out.println("Dawn of the final day, 2 cookies remain...");
      break;
      default : System.out.println("Could not have a peek at cookie stash Dx");
    }
    
    int hourOfDay = 0; // it is worth mentioning that, while int may be declared without a value, the methods like Switch WILL take offense to that.

    // consider the switch statement like a restless worker that wants to know exactly what to do;
    // if you pass it a variable that has not been instantiated yet, it will throw a fit!
    // If you never tell it to take a break, it will work till all tasks are completed--including the infinite ones.
    switch(hourOfDay){
       
        case 2 :
        case 3 : 
        case 5 :System.out.println("Go back to sleep.");
        break;
        case 6 : System.out.println("Its almost time!");
        case 7 : System.out.println("Work on work, the tasks with the highest cognitive load.");
        break;
        case 12 : 
        case 16 : System.out.println("Focus on wrapping things up, plan things for tomorrow and the future.");
        break;
        default : System.out.println("Check another hour.");


    }


    {
        System.out.println("\n===============================");
    }
    }
}