//MonsterZoo.java修正ファイル
/*
修正前の9ルール適応時の状態(--rough)
line: 94, getter method found.
line: 98, getter method found.
line: 102, getter method found.
line: 106, getter method found.
line: 110, setter method found.
line: 114, setter method found.
line: 62, else statement found.
line: 4,5,6,11,12,15,19,20, field count is more than 4.
line: 23, indentation level is too much (more than 2 indent level).
line: 4,5,6,11,12,15,19,20, no primitives.
line: 23, method is too long (over 10 lines).
line: 115, source code is too long (over 100 lines).

修正後の9ルール適応時の状態(--rough)
line: 60, setter method found.
line: 64, setter method found.
line: 27,31,34,38, field count is more than 4.
*/
import java.util.stream.IntStream;
import java.util.ArrayList;

public class MonsterZoo { 
    //distance(歩いた距離=0.0),balls(モンスターを捕まえられるボールの数=0.0),fruits(ぶつけるとモンスターが捕まえやすくなるフルーツ=0)の初期化
    Player player = new Player().player_init();
    //卵は最大9個まで持てる．卵を取得するとeggにtrueが代入され，
    //移動するたびに,eggDistanceに1.0kmずつ加算される．
    //3km移動するとランダムでモンスターが孵る
    //Eggs eggs = new Eggs().eggs_init();//egg,eggDistanceの初期化
    Eggs eggs = new Eggs();
    
    //ユーザがGetしたモンスター一覧
    UserMonster userMonster = new UserMonster().userMonster_init();//userMonsterの初期化
    //モンスター図鑑．モンスターの名前とレア度(0.0~9.0)がそれぞれの配列に保存されている
    //レア度が高いほうが捕まえにくい
    Monsterdata monsterdata = new Monsterdata();//monsterZukan,monsterRareの初期化

    //呼び出すと1km distanceが増える
    //このプログラムのメイン
    void move(){
	player.distance++;
	eggs.eggDistance(eggs);//卵の状態を更新
	flg1challeng();//モンスターGET
	eggs.getegg(eggs,monsterdata,userMonster);//モンスター誕生〜登録
    }
    public void flg1challeng(){
	int flg1 = (int)(Math.random()*10);//0,1の場合はズーstation，7~9の場合はモンスター
	if(flg1<=1){
	    new Getplayer_item().getzoostation(player,eggs);
	}else if(flg1>=7){
	    new Getmonster().getzoo(monsterdata,player,userMonster);
	}
    }    
    public void setMonsterZukan(ArrayList<String> monsterZukan) {
	this.monsterdata.monsterZukan = monsterZukan;
    }

    public void setMonsterRare(ArrayList<Double> monsterRare) {
	this.monsterdata.monsterRare = monsterRare;
    }

}
