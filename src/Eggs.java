/*
line: 11,12, not first class collection.
*/
import java.util.stream.IntStream;
import java.util.ArrayList;

public class Eggs{
    //卵は最大9個まで持てる．卵を取得するとeggにtrueが代入され，
    //移動するたびに,eggDistanceに1.0kmずつ加算される．
    //3km移動するとランダムでモンスターが孵る    
    ArrayList<Double> eggDistance = new ArrayList<Double>();
    ArrayList<Boolean> egg = new ArrayList<>();
    
    public Eggs(){
	this.eggdistance_init();
	this.egg_init();
    }
    public void eggdistance_init(){
	IntStream.range(0,10)
	    .forEach(value -> this.eggDistance.add(0.0));
    }
    public void egg_init(){
	IntStream.range(0,10)
	    .forEach(value -> this.egg.add(false));
    }
    
    public void eggDistance(Eggs eggs){
	IntStream.range(0,eggs.egg.size())
	    .filter(i -> eggs.egg.get(i)==true)
	    .forEach(i -> eggs.eggDistance.set(i,sumeggdistace(i,eggs)));
    }
    private double sumeggdistace(Integer i,Eggs eggs){
	return eggs.eggDistance.get(i)+1;
    }
    public void getegg(Eggs eggs,Monsterdata monsterdata,UserMonster userMonster){
	IntStream.range(0,eggs.egg.size())
	    .filter(i -> geteggtrue(i,eggs)==true && eggDistenceget(i,eggs)>=3)
	    .forEach(i -> eggborn(i,eggs,monsterdata,userMonster));	
    }
    private Boolean geteggtrue(Integer i,Eggs eggs){
	return eggs.egg.get(i);
    }
    private Double eggDistenceget(Integer i,Eggs eggs){
	return eggs.eggDistance.get(i);
    }
    
    public void eggborn(Integer i,Eggs eggs,Monsterdata monsterdata,UserMonster userMonster){
	System.out.println("卵が孵った！");
	int m = (int)(monsterdata.monsterZukan.size()*Math.random());
	System.out.println(monsterdata.monsterZukan.get(m)+"が産まれた！");
	new Getusermonster().getusermonster(m,userMonster,monsterdata);
	eggs.egg.set(i,false);
	eggs.eggDistance.set(i,0.0);
    }
}
