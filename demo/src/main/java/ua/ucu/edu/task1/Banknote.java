package ua.ucu.edu.task1;

//@Getter @Allargsconstructor
public class Banknote {
    private Banknote nextItem;
    protected int banknoteNominale;

    public Banknote(int bankNominale){
        this.banknoteNominale = bankNominale;
    }

    public void process(int amount){
        int quantity = amount/banknoteNominale;
        int rest = amount%banknoteNominale;
        if (nextItem != null){
            nextItem.process(rest);
        } else{
            if (amount % banknoteNominale !=0) {
                throw new IllegalArgumentException();
            }
        }
        System.out.format("Please receive%d x %d\n", quantity, banknoteNominale);
        }


    }



