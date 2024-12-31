package ua.ucu.edu.task1;

//public class Banknote5 extends Banknote {
//    private Banknote5 nextItem;
//    private int banknoteNominale;
//
//    public Banknote5(int a){
//        this.banknoteNominale = a;
//    }
//
//
//    public void process(int amount){
//        nextItem.process(amount);
//    }
//
//}

public class Banknote5 extends Banknote {
    private Banknote5 nextItem;
    private final int banknoteNominale = 5;

    public Banknote5() {
        super(5); 
    }

    public void setNextItem(Banknote5 nextItem) {
        this.nextItem = nextItem;
    }

    public void process(int amount) {
        if (amount >= banknoteNominale) {
            int count = amount / banknoteNominale;
            int remainder = amount % banknoteNominale;

            System.out.println("Dispensing " + count + " x " + banknoteNominale + " banknotes");

            if (remainder != 0 && nextItem != null) {
                nextItem.process(remainder);
            } else if (remainder != 0) {
                System.out.println("Cannot process remaining amount: " + remainder);
            }
        } else if (nextItem != null) {
            nextItem.process(amount);
        } else {
            System.out.println("Cannot process amount: " + amount);
        }
    }
}
