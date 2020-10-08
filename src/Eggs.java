/*
〜プログラムの内容〜
卵からモンスターが誕生

9ルール適応時の状態(--rough)
指摘箇所なし
 */

import java.util.stream.IntStream;

public class Eggs{
    //卵は最大9個まで持てる．卵を取得するとeggにtrueが代入され，
    //移動するたびに,eggDistanceに1.0kmずつ加算される．
    //3km移動するとランダムでモンスターが孵る
    EggDistance eggDistance = new EggDistance();
    Egg egg = new Egg();
    
    public Eggs(){//卵の状態、卵距離の初期化
	this.eggDistance.eggdistance_init();
	this.egg.egg_init();
    }
    public void eggDistance(){//卵距離の更新
	IntStream.range(0,this.egg.eggsize())
	    .filter(i -> eggnum(i)==true)
	    .forEach(i -> eggdistanceset(i));
    }
    public void getegg(Monsterdata monsterdata,UserMonster userMonster){//卵からモンスター誕生
	IntStream.range(0,this.egg.eggsize())
	    .filter(i -> eggnum(i)==true && eggdistenceget(i)>=3)
	    .forEach(i -> eggborn(i,monsterdata,userMonster));	
    }
    public void eggborn(Integer i,Monsterdata monsterdata,UserMonster userMonster){
	System.out.println("卵が孵った！");
	int m = (int)(monsterdata.monsterZukansize()*Math.random());
	System.out.println(monsterdata.monsterZukannum(m)+"が産まれた！");
	new Getusermonster().getusermonster(m,userMonster,monsterdata);
	eggset(i,false);
	eggdistanceset_init(i);//卵距離を0.0にする
    }
    //
    public Integer eggdistancesize(){
	return this.eggDistance.eggdistancesizesize();
    }
    public void eggdistanceset(Integer i){
	this.eggDistance.eggdistancesetset(i);
    }
    public void eggdistanceset_init(Integer i){
	this.eggDistance.eggdistancesetset_init(i);
    }
    private Double eggdistenceget(Integer i){
	return this.eggDistance.eggdistancenum(i);
    }   
    public void eggset(Integer i,Boolean truth){
	this.egg.eggsetset(i,truth);
    }
    public Boolean eggnum(Integer i){
	return this.egg.eggnumnum(i);
    }

}
