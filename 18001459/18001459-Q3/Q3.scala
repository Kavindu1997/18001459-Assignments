object Q3 extends App{
  
    def coverprice(x:Int)=x*24.95;
    def discount(y:Double)=y*0.4;
    def shippingcost(z:Int)=if(z<=50) 3 else 3+(z-50)*0.75;

    println("The total wholesale cost for 60 copies:");
    println(coverprice(60)+shippingcost(60)-discount(coverprice(60)));

}