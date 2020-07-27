object MyApp extends App{

class Rational(x:Int,y:Int){
         require(y>0,"Denominator Should be a Positive Number");
         def this(x:Int)=this(x,1);
    private def gcd(a:Int,b:Int):Int={
         if(a==0) b else gcd(b%a,a)
    }     

    val numer=x/gcd(x,y);
    val denom=y/gcd(x,y);

def add(r:Rational)=new Rational(this.numer*r.denom+r.numer*this.denom,this.denom*r.denom);
def neg=new Rational(-this.numer,this.denom);
def -(r:Rational)=this.add(r.neg);

override def toString=numer+"/"+denom;

}

val r1=new Rational(3,4);
val r2=new Rational(5,8);
val r3=new Rational(2,7);


println("First Rational number is  = "+r1);
println("Second Rational number is = "+r2);
println("Third Rational number is  = "+r3);
println("Negative of Second Rational   = "+ r2.neg);
println("Negative of Third Rational    = "+ r3.neg);
val res=r1.add(r2.neg).add(r3.neg);
println("Result of r1-r2-r3 is = "+res);


}