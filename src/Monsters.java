/*
〜プログラムの内容〜
モンスターの図鑑、レア度の情報を格納するための変数を用意

9ルール適応時の状態(--rough)
line: 9,10, no primitives.
 */

public class Monsters{
    String monsterZukan;
    Double monsterRare;
    public Monsters Monsters_index(String name,Double rare){
	Monsters monsters = new Monsters();
	monsters.monsterZukan = name;
	monsters.monsterRare = rare;
	return monsters;
    }
}
