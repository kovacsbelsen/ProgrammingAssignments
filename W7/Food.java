import java.util.*;


//Create public class food
public class Food {

    protected String name;
    protected int price;

    // Create constructor for food
    public Food(String foodname, int foodprice) {

        price = foodprice;
        name = foodname;
    }

    public int getPrice() {
        return price;
    }

    public void display() {
        System.out.println(price + " kr " + name);
    }
}


class Pizza extends Food {

    protected static List<String> toppings = new ArrayList<String>();

    public Pizza() {
        super("Pizza", 45);   
    }

    public void addTopping(String topping){
        price = price + 10;                             //increase price by 10
        toppings.add(topping);                          // add topping from method to the toppings list of strings
    }

    public void display() {

        String str = String.join(", ", toppings);
        

                                                        /* alternative methods could be using the append()
                                                        StringBuilder str = new StringBuilder();
		                                                for (String top : toppings) {
			                                            str.append(top);
			                                            str.append(", ");
		                                                System.out.println(str);

                                                        for (String top : toppings) { 
                                                        str+= top+", ";                             // turn the arraylist of string into a string with a + operator , leaves an additional comma at the end


                                                        or use the join()
                                                        String str = String.join(", ", toppings);
		                                                System.out.println(str);                                                            
                                                        */



        System.out.println(price + " kr " + name + " { " + str + " }");
    }

    public void setName(String name) {
        super.name = name;
    }
    
}

class Order{

    //protected List<Food> ordered = Collections.emptyList();   unmutable empty list, not
    protected List<Food> ordered = new ArrayList<Food>();
    int payment = 0;

    public void addFood(Food food) {
        //System.out.println(food.price);
        ordered.add(food);
        //System.out.println(ordered);
    }

    public int total() {
        int totalp = 0;
        if (ordered.isEmpty()) {
            return 0;
        }
        else {
            for (Food order : ordered) {
                totalp = totalp + order.price;
            }
        }
    payment = totalp;
    return totalp;
    }

    public void display() {
        int totalprice = 0;
        for (Food order : ordered) {
            if (order instanceof Pizza) {
                String str = String.join(", ", Pizza.toppings);
                System.out.println(order.price + " kr " + order.name + " { " + str + " }");
                totalprice = totalprice + order.price;
            }

            else {
                System.out.println(order.price + " kr " + order.name);
                totalprice = totalprice + order.price;
            }
        }
        payment = totalprice;
        System.out.println(totalprice + " kr TOTAL");
    }

    

    public boolean payWith(CreditCard card) {

        int pay = 0;
        for (Food order : ordered) {
            pay = pay + order.price;
        }

        boolean statement = card.withdraw(pay);

        if(statement){
            return statement;
        }
        else
        System.out.println("ERROR: Payment failed");
        return statement;
    
    }

}
