
/* Author ~ Shamura Ahmad */

import java.util.*;
class Riddles {
  static int counting = 1;
  public static void main (String [] args) {
    
    Scanner sc = new Scanner (System.in);
    System.out.println("\n*** Lets have fun with riddles. ***.\n   ***     Here we go.     ***\n");
    
    Answer   a = new Answer();
    Counter  c = new Counter();
    Question q = new Question();
    
    System.out.println("Press enter to enter.\n");
    String enter = sc.nextLine();
    System.out.println("\n#"+counting+"\n\n <> "+q.QuestionCheck(counting)+" <> \n");
    System.out.print("\nI think, the answer is : ");
    while(sc.hasNext()){
      System.out.println(a.AnswerCheck(counting,sc.nextLine().toLowerCase(),c)+"\n");
      System.out.println("Want more riddles? Enter Yes or No.\n");
      if( sc.nextLine().equals("No") || counting == 50) break;
      counting+=1;
      System.out.println("\n#"+counting+"\n\n <> "+q.QuestionCheck(counting)+" <> \n");
      System.out.print("\nI think, the answer is : ");
    }
    
    System.out.println("\nYour score percentage is "+((int)(((float)(c.Get())/counting)*100))+".\n");
  }
}
     
      