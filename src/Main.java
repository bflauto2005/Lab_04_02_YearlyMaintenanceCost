public class Main
{
    public static void main(String[] args) {
        double winterPrice = 50;
        double springPrice = 55;
        double summerPrice = 60;
        double fallPrice = 65;

        double yearlyCost = winterPrice + springPrice + summerPrice + fallPrice;

        System.out.println("The cost of winter maintenance is " + winterPrice + "$");
        System.out.println("The cost of spring maintenance is " + springPrice + "$");
        System.out.println("The cost of summer maintenance is " + summerPrice + "$");
        System.out.println("The cost of fall maintenance is " + fallPrice + "$");
        System.out.println("The cost of spring maintenance is " + springPrice + "$");
        System.out.println("The cost of spring maintenance is " + yearlyCost + "$");
    }
}