/*
~MonsterZooプログラムの修正ファイル~
Main.javaを親としてプログラムは、動きます。
モンスターの追加やプレイヤーの初期情報などの設定は、
MonsterZoo.javaでも記載していますが、各該当クラスファイルにて設定が可能です。

修正前の9ルール適応時の状態(--rough)
line: 49, setter method found.
line: 26, else statement found.
line: 17, indentation level is too much (more than 2 indent level).
line: 17, method is too long (over 10 lines).
line: 49, method is too long (over 10 lines).
※行数は、プログラム修正の段階で変化します。

修正後の9ルール適応時の状態(--rough)
line: 37, indentation level is too much (more than 2 indent level).
*/

import java.util.stream.IntStream;

public class Main {
    static MonsterZoo pz = new MonsterZoo();

    public static void main(String[] args) {
	//手持ちのボールが無くなったら終了
	move_main();
	final_result();
    }
    //獲得モンスターの一覧を表示
    public static void final_result(){
	System.out.println("ボールがなくなった！");
	IntStream.range(0,pz.userMonstersize())
	    .filter(i -> pz.userMonsternum(i)!="")
	    .forEach(i -> System.out.println(pz.userMonsternum(i)+"を捕まえた．")); 
    }
    //モンスターを獲得するためのメソッド
    public static void move_main(){//1000ミリ秒（1秒）ずつ止まりながらpz.move()を呼び出し続ける
	while(true){
	    try {
		Thread.sleep(1000);
		if(move_distance()){
		    break;
		};
	    }catch(InterruptedException e){
		e.printStackTrace();
	    }
	}
    }
    public static boolean move_distance(){
	if (move_challeng()){//移動が可能な限りチャレンジ
	    return false;//ループから抜けない
	}
	return true;
    }
    public static boolean move_challeng(){
	if(pz.playerballnum() > 0){
	    pz.move();
	    System.out.println("手持ちのボールは"+pz.playerballnum()+"個，フルーツは"+pz.playerfruitnum()+"個");
	    System.out.println(pz.playerdistancenum()+"km歩いた．");
	    return true;
	}
	return false;
    }
}
