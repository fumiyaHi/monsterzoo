/*
〜プログラムの内容〜
プレイヤーに関する情報(歩いた距離、ボール所持数、フルーツ数)を格納するための変数を用意

9ルール適応時の状態(--rough)
指摘箇所なし
 */

public class Player{
    Player_distance distance = new Player_distance();//歩いた距離
    Player_item item = new Player_item();//モンスターを捕まえられるボールの数,//ぶつけるとモンスターが捕まえやすくなるフルーツ

    public Integer ballnum(){
	return this.item.ballnumnum();
    }
    public void ballsub(){
	this.item.ballsubsub();
    }
    public void balladd(Integer b){
	this.item.balladdadd(b);
    }
    public Integer fruitnum(){
	return this.item.fruitnumnum();
    }
    public void fruitsub(){
	this.item.fruitsubsub();
    }
    public void fruitadd(Integer f){
	this.item.fruitaddadd(f);
    }
    public Double distancenum(){
	return this.distance.distancenumnum();
    }
    public void distanceadd(){
	this.distance.distanceaddadd();
    }
}
