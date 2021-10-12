class Donut extends Product{
protected Frosting frosting;
protected Filling filling;
protected boolean sprinkles;
public Donut( String name,double price,double price,Frosting frosting,boolean sprinkles,Filling filling){
super(name,price,cost);
}
public Filling enum{
unfilled(0),
creme(1),
Bavarian(2),
strawberry(3);
}
public Frosting enum{
unfrosted(0),
choocolate(1),
vanilla(2),
strawberry(3);
}
if(Frosting.equals('0')){
throw  new IllegalArgumentException("sprinkles =no");
}
@override
public String toString(){
return Frosting;
return Filling;
}
}
