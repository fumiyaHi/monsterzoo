//Main.javaの修正ファイル
/*
※行数は、プログラム修正の段階で変化します。
修正前の9ルール適応時の状態(--rough)
line: 49, setter method found.
line: 26, else statement found.
line: 17, indentation level is too much (more than 2 indent level).
line: 17, method is too long (over 10 lines).
line: 49, method is too long (over 10 lines).

修正後の9ルール適応時の状態(--rough)
line: 68, setter method found.
line: 40, indentation level is too much (more than 2 indent level).
line: 68, method is too long (over 10 lines).
*/

import java.util.stream.IntStream;
import java.util.ArrayList;

public class Main {
    static MonsterZoo pz = new MonsterZoo();

    public static void main(String[] args) {
	setMonsterZukan();
	//1000ミリ秒（1秒）ずつ止まりながらpz.move()を呼び出し続ける
	//手持ちのボールが無くなったら終了
	move_main();
	final_result();
    }
    //
    public static void final_result(){
	System.out.println("ボールがなくなった！");
	Integer usermonstersize = pz.userMonster.userMonster.size();
	IntStream.range(0,usermonstersize)
	    .filter(value -> pz.userMonster.userMonster.get(value)!="")
	    .forEach(value -> System.out.println(pz.userMonster.userMonster.get(value)+"を捕まえた．")); 
    }
    //モンスターがgetできるかをチャレンジするメソッド
    public static void move_main(){
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
	if(pz.player.balls > 0){
	    pz.move();
	    System.out.println("手持ちのボールは"+pz.player.balls+"個，フルーツは"+pz.player.fruits+"個");
	    System.out.println(pz.player.distance+"km歩いた．");
	    return true;
	}
	return false;
    }
    //テスト用のモンスターデータを登録するメソッド
    public static void setMonsterZukan(){
	ArrayList<String> tempMonster = new ArrayList<>();
	ArrayList<Double> tempMonsterRare = new ArrayList<>();
	tempMonster.add("イガキン");	tempMonsterRare.add(9.0);
	tempMonster.add("ナマチュウ");	tempMonsterRare.add(3.0);
	tempMonster.add("イノウエン");	tempMonsterRare.add(1.0);
	tempMonster.add("リョージィ");	tempMonsterRare.add(2.0);
	tempMonster.add("アキモトン");	tempMonsterRare.add(5.0);
	tempMonster.add("ゴージマ");	tempMonsterRare.add(4.0);
	tempMonster.add("チュウデン");	tempMonsterRare.add(6.0);
	tempMonster.add("ヅカホン");	tempMonsterRare.add(8.0);
	tempMonster.add("ニシムラー");	tempMonsterRare.add(7.0);
	tempMonster.add("サコーデン");	tempMonsterRare.add(2.0);
	tempMonster.add("ウッチー");	tempMonsterRare.add(5.0);
	tempMonster.add("ハヤッシー");	tempMonsterRare.add(4.0);
	tempMonster.add("キーチー");	tempMonsterRare.add(3.0);
	tempMonster.add("リョクン");	tempMonsterRare.add(1.0);
	tempMonster.add("デコポン");	tempMonsterRare.add(6.0);
	tempMonster.add("カミサン");	tempMonsterRare.add(5.0);
	tempMonster.add("シスイ");	tempMonsterRare.add(1.0);
	tempMonster.add("ジョナ");	tempMonsterRare.add(7.0);
	tempMonster.add("ギダギダ");	tempMonsterRare.add(2.0);
	tempMonster.add("ミッツー");	tempMonsterRare.add(8.0);
	tempMonster.add("ゾエサン");	tempMonsterRare.add(5.0);
	tempMonster.add("キタバー");	tempMonsterRare.add(3.0);
	pz.setMonsterZukan(tempMonster);
	pz.setMonsterRare(tempMonsterRare);
    }
}
