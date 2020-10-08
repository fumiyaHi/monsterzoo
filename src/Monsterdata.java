/*
〜プログラムの内容〜
テスト用のモンスターデータを登録する
モンスターの図鑑、レア度の情報を格納するための変数を用意

9ルール適応時の状態(--rough)
line: 15, method is too long (over 10 lines).
 */
import java.util.HashMap;
import java.util.Map;

public class Monsterdata{
    HashMap<Integer, Monsters> monsterdata = new HashMap<>();

    public Monsterdata(){//モンスターを登録する
	Monsters monsters = new Monsters(); 
	this.monsterdata.put(0,monsters.Monsters_index("イガキン",9.0));
	this.monsterdata.put(1,monsters.Monsters_index("ナマチュウ",3.0));	
	this.monsterdata.put(2,monsters.Monsters_index("イノウエン",1.0));
	this.monsterdata.put(3,monsters.Monsters_index("リョージィ",2.0));
	this.monsterdata.put(4,monsters.Monsters_index("アキモトン",5.0));
	this.monsterdata.put(5,monsters.Monsters_index("ゴージマ",4.0));
	this.monsterdata.put(6,monsters.Monsters_index("チュウデン",6.0));
	this.monsterdata.put(7,monsters.Monsters_index("ヅカホン",8.0));
	this.monsterdata.put(8,monsters.Monsters_index("ニシムラー",7.0));
	this.monsterdata.put(9,monsters.Monsters_index("サコーデン",2.0));
	this.monsterdata.put(10,monsters.Monsters_index("ウッチー",5.0));
	this.monsterdata.put(11,monsters.Monsters_index("ハヤッシー",4.0));
	this.monsterdata.put(12,monsters.Monsters_index("キーチー",3.0));	
	this.monsterdata.put(13,monsters.Monsters_index("リョクン",1.0));
	this.monsterdata.put(14,monsters.Monsters_index("デコポン",6.0));
	this.monsterdata.put(15,monsters.Monsters_index("カミサン",5.0));
	this.monsterdata.put(16,monsters.Monsters_index("シスイ",1.0));
	this.monsterdata.put(17,monsters.Monsters_index("ジョナ",7.0));
	this.monsterdata.put(18,monsters.Monsters_index("ギダギダ",2.0));
	this.monsterdata.put(19,monsters.Monsters_index("ミッツー",8.0));
	this.monsterdata.put(20,monsters.Monsters_index("ゾエサン",5.0));
	this.monsterdata.put(21,monsters.Monsters_index("キタバー",3.0));	
    }
    public Integer monsterZukansize(){
	return this.monsterdata.size();
    }
    public String monsterZukannum(Integer m){
	Monsters monstername = this.monsterdata.get(m); 
	return monstername.monsterZukan;
    }
    public Double monsterRarenum(Integer m){
	Monsters monstername = this.monsterdata.get(m); 
	return monstername.monsterRare;
    }
}
