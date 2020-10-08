/*
〜プログラムの内容〜
獲得したモンスターを保存するためのプログラム

9ルール適応時の状態(--rough)
指摘箇所なし
 */
public class Getusermonster{
    public void getusermonster(int m,UserMonster userMonster,Monsterdata monsterdata){
	//ここで以下に示すfor文は、その中にbreak;存在しており、Stream文で
	//実行することができない？(調べた結果)ため、変えていません.
	for(int j=0;j<userMonster.userMonstersizesize();j++){
	    if(userMonster.userMonsternumnum(j)==""){
		String getmonster = monsterdata.monsterZukannum(m);//
		userMonster.userMonstersetset(j,getmonster);
		break;
	    }
	}
    }
}
