/*
プレイヤーのボール、フルーツの所持

修正後の9ルール適応時の状態(--rough)
指摘箇所なし
 */

public class Player_item{
    Integer balls= new Integer(10);
    Integer fruits = new Integer(0);
    public Integer ballnumnum(){
	return this.balls;
    }
    public void ballsubsub(){
	this.balls--;
    }
    public void balladdadd(Integer b){
	this.balls = this.balls + b;
    }
    public Integer fruitnumnum(){
	return this.fruits;
    }
    public void fruitsubsub(){
	this.fruits--;
    }
    public void fruitaddadd(Integer f){
	this.fruits = this.fruits + f; 
    }
}
