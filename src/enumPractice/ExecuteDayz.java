package enumPractice;

public class ExecuteDayz {
    public static void main(String[] args) {
        Weekz weekz = new Weekz(Dayz.Saturday);
        weekz.whatToDo();
        Weekz weekz1 = new Weekz(Dayz.Thursday);
        weekz1.whatToDo();
        Weekz weekz2 = new Weekz(Dayz.Friday);
        weekz2.whatToDo();
    }

}
