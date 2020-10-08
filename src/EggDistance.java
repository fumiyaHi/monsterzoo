/*
卵距離の情報

9ルール適応時の状態(--rough)
指摘箇所なし
 */

import java.util.stream.IntStream;
import java.util.ArrayList;

public class EggDistance{    
    ArrayList<Double> eggDistance = new ArrayList<Double>();    
    public void eggdistance_init(){
	IntStream.range(0,9)
	    .forEach(value -> this.eggDistance.add(0.0));
    }
    public Double eggdistancenum(Integer i){
	return this.eggDistance.get(i);
    }
    public void eggdistancesetset(Integer i){
	this.eggDistance.set(i,eggdistancenum(i)+1);
    }
    public void eggdistancesetset_init(Integer i){
	this.eggDistance.set(i,0.0);
    }
    public Integer eggdistancesizesize(){
	return this.eggDistance.size();
    }
}
