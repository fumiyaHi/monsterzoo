/*
〜プログラムの内容〜
獲得モンスターを格納するための変数

9ルール適応時の状態(--rough)
指摘箇所なし
 */

import java.util.stream.IntStream;
import java.util.ArrayList;

public class UserMonster{
    //ユーザがGetしたモンスター一覧
    ArrayList<String> userMonster = new ArrayList<>();

    public UserMonster(){
	this.userMonster_init();
    }
    public void userMonster_init(){
	IntStream.range(0,100)
	    .forEach(value -> this.userMonster.add(""));	
    }

    public Integer userMonstersizesize(){
	return this.userMonster.size();
    }
    public String userMonsternumnum(Integer j){
	return this.userMonster.get(j);
    }
    public void userMonstersetset(Integer j,String name){
	this.userMonster.set(j,name);
    }
}
