package enumPractice;

public class Weekz {
    Dayz dayz;

   public Weekz (Dayz dayz) {
       this.dayz = dayz;
   }
       public void whatToDo (){

       // Switch allows a variable to be tested for equality against its values-
       // each value is called a case and the variable being switched on is checked for each case
       switch (dayz) {
           // switch ( enum) {------ switch block starts
           case Saturday:
               System.out.println("Will be upstate in the woods");
               break;
               // day already met req. the rest of the codes will not be executed

           case Sunday:
               System.out.println("will be in my bed");
               break;

           case Monday:
               System.out.println("Will be back in the office, seeing participants");
               break;

           case Tuesday:
               System.out.println("Work and PeopleNTech");
               break;

           case Wednesday:
               System.out.println("Work, Sleep and PeopleNTech");

           case Thursday:
               System.out.println("Swim day");
               break;

           case Friday:

           default:
               System.out.println("reading Java handbook");

       }
   }

}

