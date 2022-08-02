import java.util.ArrayList;

public class CafeUtil {

  public int getStreakGoal() {
    int drinkTotal = 0;
    for (int drinks = 1; drinks <= 10; drinks++) {
      drinkTotal += drinks;
    }
    return drinkTotal;
  }

  public double getOrderTotal(double[] prices){
    double priceTotal = 0;
    for (double price : prices){
      priceTotal += price;
    }
    return priceTotal;
  }

  public void displayMenu(ArrayList<String> menu){
    for (int i = 0; i < menu.size(); i++){
      System.out.println(i + " " + menu.get(i));
    }
  }

  public void addCustomer (ArrayList<String> customers){
    System.out.println("Please enter your name:");
    String userName = System.console().readLine();
    System.out.println("Hello"+ " "+ userName);
    customers.add(userName);
    int customersAhead = customers.size();
    System.out.println("There are "+ customersAhead + " " + "people in front of you.");
  }
} 
