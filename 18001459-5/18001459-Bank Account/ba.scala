class Account(id:String,n:Int,b:Double){

     val nic:String=id;
     val acnumber:Int=n;
     var balance:Double=b;

def deposit(a:Double)=this.balance=this.balance+a
def withdraw(a:Double)=this.balance=this.balance-a    
def transfer(a:Double,b:Account)={
     this.balance-a;
     b.balance+a;
}

override def toString="["+nic+":"+acnumber+":"+balance+"]";
}

object BA extends App{
    var bank:List[Account]=List(new Account("973651250v",1,-10000), new Account("687490474v",2,8000), new Account("951251450v",3,-1000));

    val overdraft=(b:List[Account])=>b.filter(x=>x.balance<0);
    val balance=(b:List[Account])=>b.reduce((x,y)=>new Account("",0,x.balance+y.balance));
    val interest=(b:List[Account])=>b.map((x)=>if(x.balance<0) x.balance=x.balance+(x.balance*0.1) else x.balance=x.balance+(x.balance*0.05));


println("List of Overdraft Accounts:");
println("---------------------------");
    for(over<-overdraft(bank))
    {
        println(over.toString());
    }


println("\nSum of All Account Balances");
println("-------------------------------");
println("Sum:- "+balance(bank).balance);


println("\nFinal Balances:- ");
interest(bank);

    for(l<-bank)
    {
        println(l.toString());
    }

}
