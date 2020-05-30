object Q8 extends App{

    def sum(n:Int):Int=if(n==1) 1 else n+sum(n-1);
    println("Sum of 1 to 5: "+sum(5));

}