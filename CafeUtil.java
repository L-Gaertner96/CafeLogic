import java.util.ArrayList;

public class CafeUtil{
    public int getStreakGoal(){
        int numWeeks = 10;
        int streak = 0;
        for(int i = 0; i <= numWeeks; i++){
            streak += i;
        }
        return streak;
    }

    public double getOrderTotal(double[] lineItems){
        double total = 0.0;
        for(double price : lineItems){
            total += price;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i=0; i<menuItems.size(); i++){
            System.out.println(i+". "+menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello, "+userName+"!");
        int peopleAhead = customers.size();
        System.out.println("There are "+peopleAhead+" customers ahead of you.");
        customers.add(userName);
        System.out.println(customers);
    }

    // public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
    //     if(menuItems.size() != prices.size()){
    //         return false;
    //     }
    //     for(int i = 0; i<menuItems.size();i++){
    //         System.out.println(i + " " + menuItems.get(i)+" " + prices.get(i) +"\n");
    //     }
    //     return true;
    // }
}