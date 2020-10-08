/*
〜プログラムの内容〜
ボールやフルーツを投げてモンスターを獲得するためのプログラム

9ルール適応時の状態(--rough)
指摘箇所なし
 */
public class Getmonster{
    public void getzoo(Monsterdata monsterdata,Player player,UserMonster userMonster){//monsterZukanからランダムにモンスターを出す
	int m = (int)(monsterdata.monsterZukansize()*Math.random());
	System.out.println(monsterdata.monsterZukannum(m)+"が現れた！");
	monster_judge(m,monsterdata,player,userMonster);
    }
    public void monster_judge(int m,Monsterdata monsterdata,Player player,UserMonster userMonster){//モンスターにボールやフルーツを投げて獲得判定
	for(int i=0;i<3&&player.ballnum()>0;i++){//捕まえる or 3回ボールを投げるまで繰り返す
	    int r = (int)(6*Math.random());//0~5までの数字をランダムに返す
	    monster_attack(m,monsterdata,player);//モンスターにボールを投げて攻撃
	    r = fruits_throw(player,r);
	    if(monsterdata.monsterRarenum(m)<=r){//monsterRareの値がr以下の場合
		monster_get(m,monsterdata,userMonster);//モンスター獲得
		break;//ボール投げ終了
	    }
	    System.out.println(monsterdata.monsterZukannum(m)+"に逃げられた！");
	}
    }
    public void monster_get(int m,Monsterdata monsterdata,UserMonster userMonster){
	System.out.println(monsterdata.monsterZukannum(m)+"を捕まえた！");
	new Getusermonster().getusermonster(m,userMonster,monsterdata);
    }
    public void monster_attack(int m,Monsterdata monsterdata,Player player){
	System.out.println(monsterdata.monsterZukannum(m)+"にボールを投げた");
	player.ballsub();
    }
    public int fruits_throw(Player player,int r){
	if(player.fruitnum()>0){
	    System.out.println("フルーツを投げた！捕まえやすさが倍になる！");
	    player.fruitsub();
	    return r = r * 2;
	}
	return r;
    }
}
