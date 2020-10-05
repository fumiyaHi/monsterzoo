/*
〜プログラムの内容〜
プレイヤーに関する情報(歩いた距離、ボール所持数、フルーツ数)を格納するための変数を用意

9ルール適応時の状態(--rough)
line: 11,12,13, field count is more than 4.
line: 11,12,13, no primitives.
 */

public class Player{
    double distance;//歩いた距離
    int balls;//モンスターを捕まえられるボールの数
    int fruits;//ぶつけるとモンスターが捕まえやすくなるフルーツ

    public Player player_init(){
	Player player = new Player();
	player.distance=0.0;
	player.balls=10;
	player.fruits=0;
	return player;
    }
}
