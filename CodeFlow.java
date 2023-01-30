import javax.management.Notification;

public class CodeFlow{
    public static void main(String[] args) {
    {
        System.out.println("===============================\n");
    }       
    int cookiesInStash = 20;
    final int maxCookies = 100; // mark final and initialize value to have switch label be accepted

    System.out.println("\"Let me check my cookies...\"");
    switch(cookiesInStash){
      case 10: System.out.println("There be 10 cookies in me stash, yar!"); 
      break;
      case 2: System.out.println("Dawn of the final day, 2 cookies remain...");
      break;
      case maxCookies : System.out.println("The stash is at its max.");
      break;
      case 10*2 : System.out.println("I see " + 10*2 + " cookies.");
      default : System.out.println("Could not have a peek inside cookie stash Dx");
    }
    

{
    System.out.println();
}

    String dayOfWeek = "Monday"; // it is worth mentioning that, while int may be declared without a value, the methods like Switch WILL take offense to that.

    // consider the switch statement like a restless worker that wants to know exactly what to do;
    // if you pass it a variable that has not been instantiated yet, it will throw a fit!
    // If you never tell it to take a break, it will work till all tasks are completed--including the infinite ones.

    System.out.println("\"What part of the week are we in?\"");
    switch(dayOfWeek){

        case "Monday" : 
        case "Tuesday" :System.out.println("It is the first half of the week.");
        break;
        case "Wednesday" :
        case "Thursday" : System.out.println("The weekend is nearly there.");
        break;
        case "Friday" : System.out.println("Final day of the week, prepare for the next.");
        default : System.out.println("This should be the weekend.");
    }

    {
        System.out.println("\n===============================");
    }

    int i1 = 1;
    short s1 = 2;
    for (int beep = 6 ; s1> 0 ; i1++, s1--, m1()){
        System.out.println("Looping the for loop");// code block must include break to get to rest of code
    }

    {
        System.out.println("\n===============================");
    }
    }

    static void m1 (){
        System.out.println("Executed m1");
    }
}