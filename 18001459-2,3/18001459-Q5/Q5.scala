object Q5 extends App{

     def attendees(price:Int)=120+(15-price)/5*20;
     def revenue(price:Int)=attendees(price)*price;
     def cost(price:Int)=500+attendees(price)*3;
     def profit(price:Int)=revenue(price)-cost(price);

     println("");

    println("Profit for Rs.5/= ticket price  :"+profit(5));
    println("Profit for Rs.10/= ticket price :"+profit(10));
    println("Profit for Rs.15/= ticket price :"+profit(15));
    println("Profit for Rs.20/= ticket price :"+profit(20));
    println("Profit for Rs.25/= ticket price :"+profit(25));
    println("Profit for Rs.30/= ticket price :"+profit(30));
    println("Profit for Rs.35/= ticket price :"+profit(35));
    println("Profit for Rs.40/= ticket price :"+profit(40));


}