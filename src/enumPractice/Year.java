package enumPractice;

public class Year {
    Months months;
    // created object Days days


    public Year(Months months){
        // made constructor
        this.months= months;
    }
    public void whatToDo(){
        /* when using enums we can use switch, when is comes to switch */
        switch (months){
            //switch (enum){--switch block starts
            // case-- keyword enums value
            // action  against case
            //break--keyword -- when it comes to break
            //case--keyword enums value
            //action against case
            //break -- keyword
            //default--
            //}--switch block ends
            case October:
                System.out.println("This is the month of October and im not doing anything until winter ends");
                break;
            // day already met req to get out of the block break if you don't want the rest of the code to get executed

            case November:
                System.out.println("This month is November and im going fishing until January");
                break;
            case December:
            case June:
            case July:
            case August:
                System.out.println("this month i have no life and im going to work");
                break;
            default:
                System.out.println("This month im gaining 50 lbs");
                break;

        }
    }
}
