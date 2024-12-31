package ua.ucu.edu.task1;

public class ATM {
    public ATM(){
        firstitem = new Banknote100(new Banknote50(new Banknote5()));
    }
    private Banknote firstitem;

    public void process(int amount){
        firstitem.process(amount);
    }

}
