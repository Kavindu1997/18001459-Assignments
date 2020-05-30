object Q10 extends App{

  def sumEven(a:Int):Int = a match{

    case a if (a<1)=>a;
    case a if (a%2==0)=>(a-2) + sumEven(a-2);
    case a if (a%2==1)=>(a-1) + sumEven(a-1);
    
      }

  println(sumEven(15));

}
