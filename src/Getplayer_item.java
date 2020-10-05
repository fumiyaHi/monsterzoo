/*
ボール、フルーツ、卵をランダムに取得するためのプログラム

9ルール適応時の状態(--rough)
指摘箇所なし
 */
import java.util.ArrayList;

public class Getplayer_item{
    public void getzoostation(Player player,Eggs eggs){
	System.out.println("ズーstationを見つけた！");
	int b=(int)(Math.random()*3);//ball,fruits,eggがランダムに出る
	int f=(int)(Math.random()*2);
	int e=(int)(Math.random()*2);
	System.out.println("ボールを"+b+"個，"+"フルーツを"+f+"個，"+"卵を"+e+"個Getした！");
	player.balls=player.balls+b;
	player.fruits=player.fruits+f;
	if(e>=1){//卵を1つ以上Getしたら
	    eggset(e,eggs);
	}
    }
    public void eggset(int e,Eggs eggs){
	//ここで以下に示すfor文は、その中にbreak;存在しており、Stream文で
	//実行することができない？(調べた結果)ため、変えていません.	
	//egg[]に10個以上卵がない場合は新しい卵データをセットする		
	for(int i=0;i<eggs.eggDistance.size();i++){
	    if(eggs.egg.get(i)==false){
		eggs.egg.set(i,true);
		eggs.eggDistance.set(i,0.0);
		break;
	    }
	}
    }
}
