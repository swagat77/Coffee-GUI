public class Java extends Product{
protected Darkness darkness;
protected ArrayList<Shot> shots;
ArrayList<Shot> shots= new ArrayList<>();
shots.add(none);
shots.add(chocolate);
shots.add(vanilla);
shots.add(peppermint);
shots.add(hazelnut);
public Darkness enum{
blond(0),
light(1),
medium(2),
dark(3),
extreme(4);}
for (int i=0; i<shots.length();i++){
System.out.println(shots.get(i));}
public java(String name,double price,double cost,Darkness darkness){
super(name,cost,price);
}
public addShot(Shot:shot){
return shot;
}
@override
public String toString(){
return cost;
return darkness; 
  }
}
