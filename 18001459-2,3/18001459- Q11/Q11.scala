object Q11 extends App{

     def fib(n:Int):Int=n match{

         case n if n==0=>0;
         case n if n==1=>1;
         case n=>fib(n-1)+fib(n-2);

     }

     def fsq(n:Int):Any={

         if(n>0) fsq(n-1);
         println(fib(n));
     }

        println(fsq(10));
}