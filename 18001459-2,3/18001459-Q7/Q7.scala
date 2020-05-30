object Q7 extends App{

 def prime(z:Int,n:Int=2):Int = z match {

    case z if(z==2)=>z;
    case z if(z%n==0)=>prime(z-1);
    case z if(n*n>z)=>{
      println(z)
      prime(z-1)
    }
    
    case _=>prime(z,n+1)
  }

  println(prime(10));


}