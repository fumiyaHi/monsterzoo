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
    public UserMonster userMonster_init(){
	UserMonster usermonster = new UserMonster();
	IntStream.range(0,100)
	    .forEach(value -> usermonster.userMonster.add(""));	
	return usermonster;
    }
}
