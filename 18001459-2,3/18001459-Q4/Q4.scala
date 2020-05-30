object Q4 extends App{

      def wage(hours1:Int)=hours1*150;
      def ot(hours2:Int)=hours2*75;
      def income(hours1:Int,hours2:Int)=wage(hours1)+ot(hours2);
      def tax(income:Int)=income*0.1;
      def takehome(hours1:Int,hours2:Int)=income(hours1,hours2)-tax(income(hours1,hours2));

      println("Take home salary for typical Employee:");
      println(takehome(40,20));

}