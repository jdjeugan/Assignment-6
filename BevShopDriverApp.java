import java.util.Scanner;

public class BevShopDriverApp {
    public static void main(String[] args) {
        BevShop bevShop = new BevShop();
        Scanner scanner = new Scanner(System.in);

        System.out.println("The current order in process can have at most 3 alcoholic beverages.");
        System.out.println("The minimum age to order alcohol drink is 21");

        while (true) {
            System.out.println("Start please a new order:");
            System.out.println("Your Total Order for now is 0.0");
            System.out.print("Would you please enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Would you please enter your age: ");
            int age = Integer.parseInt(scanner.nextLine());

            if (bevShop.isValidAge(age)) {
                System.out.println("Your age is above 20 and you are eligible to order alcohol.");
                bevShop.startNewOrder(12, Day.MONDAY, name, age);

                while (bevShop.isEligibleForMore()) {
                    System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
                    System.out.println("The Total price on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

                    System.out.print("Would you please add an alcohol drink: ");
                    String bevName = scanner.nextLine();
                    System.out.print("Would you please enter the size (SMALL, MEDIUM, LARGE): ");
                    Size size = Size.valueOf(scanner.nextLine());
                    bevShop.processAlcoholOrder(bevName, size);
                }

                System.out.println("You have a maximum alcohol drinks for this order");

                System.out.println("Would you please add a COFFEE to your order: ");
                bevShop.processCoffeeOrder("Coffee", Size.MEDIUM, false, false);
                System.out.println("Total items on your order is " + bevShop.getCurrentOrder().getTotalItems());
                System.out.println("The Total Price on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));
            } else {
                System.out.println("Your Age is not appropriate for alcohol drink!!");
            }

            System.out.println("#------------------------------------#");

            System.out.println("Would you please start a new order");

            System.out.print("Would you please enter your name: ");
            String name2 = scanner.nextLine();
            System.out.print("Would you please enter your age: ");
            int age2 = Integer.parseInt(scanner.nextLine());
            bevShop.startNewOrder(12, Day.MONDAY, name2, age2);
            System.out.println("The Total Price on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

            System.out.print("Would you please add a SMOOTHIE to order: ");
            String bevName = scanner.nextLine();
            Size size = Size.MEDIUM;
            bevShop.processSmoothieOrder(bevName, size, 2, true);
            System.out.println("The Total Price on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

            System.out.print("Would you please add a SMOOTHIE to order: ");
            bevName = scanner.nextLine();
            bevShop.processSmoothieOrder(bevName, size, 3, false);
            System.out.println("The Total Price on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

            System.out.print("Would you please add a COFFEE to order: ");
            bevName = scanner.nextLine();
            bevShop.processCoffeeOrder(bevName, Size.LARGE, false, true);
            System.out.println("The Total Price on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

            System.out.print("Would you please add a drink: ");
            bevName = scanner.nextLine();
            bevShop.processCoffeeOrder(bevName, Size.MEDIUM, true, false);
            System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
            System.out.println("The Total price on the Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));

            System.out.println("The total number of fruits is " + bevShop.getCurrentOrder().findNumOfBeveType(Type.SMOOTHIE));
            if (bevShop.isMaxFruit(bevShop.getCurrentOrder().findNumOfBeveType(Type.SMOOTHIE))) {
                System.out.println("You reached a Maximum number of fruits");
            }

            System.out.println("Total price on the second Order: " + bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()));
            System.out.println("Total amount for all Orders: " + bevShop.totalMonthlySale());
        }
    }
}
