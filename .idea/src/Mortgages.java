public class Mortgages {

    public static void main(String[] args) {
        //System.out.println(calculateTotalPayment(1001,0,0));
        int i = calculateTotalPayment(1001,0,0);
        System.out.println(i);
    }

    public static int calculateTotalPayment(int initialDebt, int interest, int repayment) {
        int initialDeposit = initialDebt / 10;
        System.out.println("initial deposit made is " + initialDeposit);
        return 0;
    }
}
