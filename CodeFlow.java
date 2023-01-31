public class CodeFlow{
    public static void main(String[] args) {
    {
        System.out.println("===============================\n");
    }   
    
    // Switch statements 1
   {
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
}

    Enter();

    // Switch statements 2
    {
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
}

    Enter();

    // For loop
    {
    int i1 = 1;
    short s1 = 2;
    for (int beep = 6 ; s1> 0 ; i1++, s1--, m1()){
        System.out.println("Looping the for loop");// code block must include break to get to rest of code
    }
}

   Enter();
    
    int dogs = 0;
    StringBuilder sb = new StringBuilder(" intense chocolate cake");
    int someNums[] = {2,10,5};

    System.out.println("Starting with " + dogs + " dogs.");
    for (int num : someNums){
        dogs += num;
        System.out.println(dogs);
        sb.insert(0, " extra");
    }
    System.out.println("Ended up with " + dogs + " dogs and" + sb + "!");

    System.out.println();

    StringBuilder pets[] = {
        new StringBuilder("Bunny"),
        new StringBuilder("Fish"),
        new StringBuilder("Kat")
    };

    for (StringBuilder x : pets)
    System.out.println(x);
    for (StringBuilder x : pets){
        x.append(" is happy");
    }
    for (StringBuilder x : pets)
    System.out.println(x);


    System.out.println();
    StringBuilder mounts[] = {  //creatre an array of objects
        new StringBuilder("Legendary dragon"),
        new StringBuilder("Sandy ostrich"),
        new StringBuilder("Dream whale")
    };

    for (StringBuilder x : mounts)  // print out their initial value
        System.out.println(x);
    
    for (StringBuilder x : mounts){
    x = new StringBuilder("Default horse"); // change the reference
    //System.out.println(x);            // notice how this would have printed horse, as X is but a local variable
    }

    for (StringBuilder x : mounts)
    System.out.println(x);

    Enter();
}

    static void m1 (){
        System.out.println("Executed m1");
    }

    static void Enter(){System.out.println("\n========================="+"\n");}
}