object Q9 extends App{

    def isEven(x:Int)=x%2 match{
        
        case 0=>true;
        case _=>isOdd(x-1);

    }
    def isOdd(x:Int):Boolean= !(isEven(x))

    println("Number 2:"+isEven(2));
    println("Number 3:"+isEven(3));


}