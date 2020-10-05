/*
〜プログラムの内容〜
モンスターの図鑑、レア度の情報を格納するための変数を用意

9ルール適応時の状態(--rough)
line: 5,6, not first class collection.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Monsterdata{
    ArrayList<String> monsterZukan = new ArrayList<>();
    ArrayList<Double> monsterRare = new ArrayList<>();
    //HashMap<Integer, Monsters> monsterdata = new HashMap<>();

    /*
    public Monsterdata(){
    }
    public Integer Monsterdatasize(){
	return this.monsterdata.size();
    }
    public String Monsterzukanname(Integer m){
	Monsters monster = this.monsterdata.get(m);
	return monster.monsterZukan;
    }
    */
}
