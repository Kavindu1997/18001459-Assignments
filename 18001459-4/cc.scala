object CeaserCipher extends App{


    val src="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    val E=(c:Char,key:Int,s:String)=>s((s.indexOf(c.toUpper)+key)%26);
    val D=(c:Char,key:Int,s:String)=>s((s.indexOf(c.toUpper)-key)%26);

    val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a));
        val encryp=cipher(E,"Kavindu",1,src);
        val decryp=cipher(D,encryp,1,src);

        println(encryp);
        println(decryp);



}