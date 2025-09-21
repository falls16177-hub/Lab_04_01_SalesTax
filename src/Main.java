public class Main {
    public static void main(String[] args) {
        System.out.print("What is the price of your item? ");
        int itemprice = 12;
        double salesTax = .05;

        double salesTotal = itemprice * salesTax;

        System.out.println("The sales price is $" + salesTotal);

    }
}