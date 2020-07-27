object MyApp extends App{

val p1=Point(1,0);
val p2=Point(5,0);
val p3=p1.copy(y=4);

println(p1);
println(p2);
println(p1==p2);
println(p3);

val p4=p1.move(10,10);
println(p4);

val p5=p1.add(p2);
println(p5);

val p6=p1.invert();
println(p6);

val p7=p1.distance(p2);
println(p7);


val printinfo=(p:Point)=>p match{

     case Point(0,0)=>println("Point Origin");
     case Point(_,0)=>println("Point on X-axis");
     case Point(0,_)=>println("Point on Y-axis");
     case _=>println(p);

}
printinfo(p1);
printinfo(p4);

}

case class Point(x:Int,y:Int){

def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
def add(that:Point)=Point(this.x+that.x,this.y+that.y)
def invert()=Point(-this.x,-this.y)
def distance(that:Point)=Math.sqrt((that.x-this.x)^2-(that.y-this.y)^2)

}
