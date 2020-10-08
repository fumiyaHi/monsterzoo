/*
〜プログラムの内容〜
プレイヤーが保持するアイテムや歩いた距離、モンスター獲得一覧の管理

9ルール適応時の状態(--rough)
line: 11,12,13, field count is more than 4.
指摘箇所なし
 */


public class Playerdata{
    Player player = new Player();
    Eggs eggs = new Eggs();
    UserMonster userMonster = new UserMonster();

    public void playerdistanceadd(){
	this.player.distanceadd();
    }
    public void eggseggDistance(){
	this.eggs.eggDistance();
    }
    public void eggsgetegg(Monsterdata monsterdata){
	this.eggs.getegg(monsterdata,this.userMonster);
    }
}
