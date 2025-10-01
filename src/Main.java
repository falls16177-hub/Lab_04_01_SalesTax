public class Main {
    public static void main(String[] args) {
        System.out.print("What is the price of your item? ");
        int ItemPrice = 50;
        double SalesTax = .05;

        double SalesTotal = ItemPrice * SalesTax;

        System.out.println("The sales price is $" + SalesTotal);

    }
}