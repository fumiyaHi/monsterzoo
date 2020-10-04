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
line: 146, getter method found.
line: 150, getter method found.
line: 154, getter method found.
line: 158, getter method found.
line: 162, setter method found.
line: 166, setter method found.
line: 170, setter method found.
line: 173, setter method found.
line: 95, else statement found.
line: 24,25,26,34,35,39,45,46, field count is more than 4.
line: 24,25,26,34,35,39,45,46, not first class collection.
line: 63, indentation level is too much (more than 2 indent level).
line: 83, indentation level is too much (more than 2 indent level).
line: 111, indentation level is too much (more than 2 indent level).
line: 24,25,26,34,35,39,45,46, no primitives.
line: 63, method is too long (over 10 lines).
line: 83, method is too long (over 10 lines).
line: 111, method is too long (over 10 lines).
line: 177, source code is too long (over 100 lines).
*/
import java.util.stream.IntStream;
import java.util.ArrayList;

public class MonsterZoo {
    double distance=0.0;//歩いた距離
    int balls=10;//モンスターを捕まえられるボールの数
    int fruits=0;//ぶつけるとモンスターが捕まえやすくなるフルーツ

    //卵は最大9個まで持てる．卵を取得するとeggにtrueが代入され，
    //移動するたびに,eggDistanceに1.0kmずつ加算される．
    //3km移動するとランダムでモンスターが孵る

    //double eggDistance[] = new double[9];
    //boolean egg[] = new boolean[9];
    ArrayList<Double> eggDistance = new ArrayList<>();
    ArrayList<Boolean> egg = new ArrayList<>();
    
    //ユーザがGetしたモンスター一覧
    //String userMonster[] = new String[100];
    ArrayList<String> userMonster = new ArrayList<>();
    
    //モンスター図鑑．モンスターの名前とレア度(0.0~9.0)がそれぞれの配列に保存されている
    //レア度が高いほうが捕まえにくい
    //String monsterZukan[] = new String[22];
    //double monsterRare[] = new double[22];
    ArrayList<String> monsterZukan = new ArrayList<>();
    ArrayList<Double> monsterRare = new ArrayList<>();

    
    //呼び出すと1km distanceが増える
    void move(){
	this.distance++;
	eggDistance();
	flg1challeng();
	getegg();
    }
    //
    public void flg1challeng(){
	int flg1 = (int)(Math.random()*10);//0,1の場合はズーstation，7~9の場合はモンスター
	if(flg1<=1){
	    getzoostation();
	}else if(flg1>=7){
	    getzoo();
	}
    }
    ///
    public void userindexing(int m){
	for(int j=0;j<userMonster.size();j++){
	    //if(this.userMonster.get(j)==null){
	    if(this.userMonster.get(j)==""){
		//this.userMonster[j]=this.monsterZukan[m];
		this.userMonster.set(j,this.monsterZukan.get(m));
		break;
	    }
	}
    }
    public void getegg(){
	/*
	IntStream.range(0,this.egg.size())
	    .filter(i -> this.egg.get(i)==true&&this.eggDistance.get(i)>=3)
	    .forEach(i -> System.out.println("卵が孵った！"));
	.map(m -> (int)(this.monsterZukan.size()*Math.random()))
	    .forEach(m -> System.out.println(this.monsterZukan.get(m)+"が産まれた！"));
	*/
	
	for(int i=0;i<this.egg.size();i++){
	    if(this.egg.get(i)==true&&this.eggDistance.get(i)>=3){
		System.out.println("卵が孵った！");
		int m = (int)(this.monsterZukan.size()*Math.random());
		System.out.println(this.monsterZukan.get(m)+"が産まれた！");
		userindexing(m);
		this.egg.set(i,false);
		this.eggDistance.set(i,0.0);
	    }
	}	
    }
    ///
    public void getusermonster(int m,int r){
	for(int j=0;j<userMonster.size();j++){
	    if(this.userMonster.get(j)==""){
		this.userMonster.set(j,this.monsterZukan.get(m));
		break;
	    }
	}
    }
    public void getzoo(){
	int m = (int)(this.monsterZukan.size()*Math.random());//monsterZukanからランダムにモンスターを出す
	System.out.println(this.monsterZukan.get(m)+"が現れた！");
	for(int i=0;i<3&&this.balls>0;i++){//捕まえる or 3回ボールを投げるまで繰り返す
	    int r = (int)(6*Math.random());//0~5までの数字をランダムに返す
	    if(this.fruits>0){
		System.out.println("フルーツを投げた！捕まえやすさが倍になる！");
		this.fruits--;
		r = r * 2;
	    }
	    System.out.println(this.monsterZukan.get(m)+"にボールを投げた");
	    this.balls--;

	    if(this.monsterRare.get(m)<=r){//monsterRare[m]の値がr以下の場合
		System.out.println(this.monsterZukan.get(m)+"を捕まえた！");
		getusermonster(m,r);
		break;//ボール投げ終了
	    }
	    System.out.println(this.monsterZukan.get(m)+"に逃げられた！");
		//}else{
		//System.out.println(this.monsterZukan.get(m)+"に逃げられた！");
		//}
	}
    }
    public void getzoostation(){
	System.out.println("ズーstationを見つけた！");
	int b=(int)(Math.random()*3);//ball,fruits,eggがランダムに出る
	int f=(int)(Math.random()*2);
	int e=(int)(Math.random()*2);
	System.out.println("ボールを"+b+"個，"+"フルーツを"+f+"個"+"卵を"+e+"個Getした！");
	this.balls=this.balls+b;
	this.fruits=this.fruits+f;
	if(e>=1){//卵を1つ以上Getしたら
	    //egg[]に10個以上卵がない場合は新しい卵データをセットする
	    for(int i=0;i<this.eggDistance.size();i++){
		if(this.egg.get(i)==false){
		    this.egg.set(i,true);
		    this.eggDistance.set(i,0.0);
		    break;
		}
	    }
	}
    }
    public void eggDistance(){
	for(int i=0;i<this.egg.size();i++){//卵は移動距離が進むと孵化するため，何km移動したかを更新する
	    if(this.egg.get(i)==true){
		this.eggDistance.set(i,this.eggDistance.get(i)+1);
	  }
	}
    }








    
    public double getDistance() {
	return distance;
    }

    public int getBalls() {
	return balls;
    }

    public int getFruits() {
	return fruits;
    }

    public ArrayList<String> getUserMonster() {
	return userMonster;
    }

    public void setMonsterZukan(ArrayList<String> monsterZukan) {
	this.monsterZukan = monsterZukan;
    }

    public void setMonsterRare(ArrayList<Double> monsterRare) {
	this.monsterRare = monsterRare;
    }

    public void setEggDistance(ArrayList<Double> eggDistance) {
	this.eggDistance = eggDistance;
    }
    public void setEgg(ArrayList<Boolean> egg) {
	this.egg = egg;
    }
    public void setuserMonster(ArrayList<String> userMonster) {
	this.userMonster = userMonster;
    }
}
