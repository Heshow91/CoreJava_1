package enumPractice;

public class Week {
    Days days;
    // created object Days days


    public Week(Days days){
        // made constructor
        this.days= days;
    }
    public void whatToDo(){
        /* when using enums we can use switch, when is comes to switch */
        switch (days){
            //switch (enum){--switch block starts
            // case-- keyword enums value
            // action  against case
            //break--keyword -- when it comes to break
            //case--keyword enums value
            //action against case
            //break -- keyword
            //default--
            //}--switch block ends
            case Saturday:
                System.out.println("Today is Saturday and im not working today");
                break;
                // day already met req to get out of the block break if you don't want the rest of the code to get executed

            case Sunday:
                System.out.println("Today is sunday and im going fishing");
                break;
            case Monday:
            case Tuesday:
            case Wednesday:
            case Thursday:
                System.out.println("Today im going to work");
                break;
                default:
                    System.out.println("Today im going to watch movies");
                break;

        }
    }
}
