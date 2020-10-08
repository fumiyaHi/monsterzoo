/*
卵の情報

9ルール適応時の状態(--rough)
指摘箇所なし
 */
import java.util.stream.IntStream;
import java.util.ArrayList;

public class Egg{    
    ArrayList<Boolean> egg = new ArrayList<>();
    
    public void egg_init(){
	IntStream.range(0,9)
	    .forEach(value -> this.egg.add(false));
    }
    public Integer eggsize(){
	return this.egg.size();
    }
    public Boolean eggnumnum(int i){
	return this.egg.get(i);
    }
    public void eggsetset(Integer i,Boolean truth){
	this.egg.set(i,truth);
    }
}
