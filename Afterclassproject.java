class CashRegister {
    private double purchase;
    private double payment;
    private int itemCount;

    public CashRegister() {
        purchase = 0;
        payment = 0;
        itemCount=0;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
        itemCount++;
    }

    public void receivePayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
    public int getItemCount() {
    return itemCount;
}
public static int countTotal(CashRegister[] registers) {
    int total = 0;
    for (int i = 0; i < registers.length; i++) {
        total = total + registers[i].getItemCount();
    }
    return total;
}
}

    


