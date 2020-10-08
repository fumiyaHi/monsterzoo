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
※行数は、プログラム修正の段階で変化します。

修正後の9ルール適応時の状態(--rough)
指摘箇所なし
*/
public class MonsterZoo {
    /*
      主な変数の内容：
      Playerdata：{
      　Player：distance(歩いた距離=0.0),balls(モンスターを捕まえられるボールの数=0.0),fruits(ぶつけるとモンスターが捕まえやすくなるフルーツ=0)の初期化
      　eggs：egg(卵保持状態=最大9個),eggDistance(卵距離=0.0)の初期化
      　//卵は最大9個まで持てる．卵を取得するとeggにtrueが代入され，
      　//移動するたびに,eggDistanceに1.0kmずつ加算される．
      　//3km移動するとランダムでモンスターが孵る
      　userMonster：ユーザがGetしたモンスターの一覧
      }
      Monsterdata：{
      　monsterdata：モンスター図鑑．monsterZukan(モンスターの名前)とmonsterRare(レア度(0.0~9.0))がそれぞれ保存されている
      　//レア度が高いほうが捕まえにくい
      }
      */
    
    //プレイヤーのボール、フルーツ、獲得モンスター、卵に関する情報が格納されています
    //(初期設定等は、Playerdata.javaから該当するファイルで変更)
    Playerdata playerdata = new Playerdata();
    //モンスターの登録を行います(モンスターの追加は、Monsterdata.javaで)
    Monsterdata monsterdata = new Monsterdata();

    //呼び出すと1km distanceが増える
    //このプログラムのメイン
    void move(){
	this.playerdata.playerdistanceadd();
	this.playerdata.eggseggDistance();//卵の状態を更新
	flg1challeng();//モンスターGET
	this.playerdata.eggsgetegg(this.monsterdata);//モンスター誕生〜登録
    }
    public void flg1challeng(){
	int flg1 = (int)(Math.random()*10);//0,1の場合はズーstation，7~9の場合はモンスター
	if(flg1<=1){
	    new Getplayer_item().getzoostation(this.playerdata.player,this.playerdata.eggs);
	}else if(flg1>=7){
	    new Getmonster().getzoo(this.monsterdata,this.playerdata.player,this.playerdata.userMonster);
	}
    }    
    public String userMonsternum(Integer i){
	return this.playerdata.userMonster.userMonsternumnum(i);
    }
    public Integer userMonstersize(){
	return this.playerdata.userMonster.userMonstersizesize();
    }
    public Integer playerballnum(){
	return this.playerdata.player.ballnum();
    }
    public Integer playerfruitnum(){
	return this.playerdata.player.fruitnum();
    }
    public Double playerdistancenum(){
	return this.playerdata.player.distancenum();
    }
}
