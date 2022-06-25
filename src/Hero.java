import javax.sound.midi.Soundbank;

public class Hero {
    //属性
    String name;
    int hp;
    static int money;//静的フィールド


    //コンストラクタその１
    Hero(String name){
        this.hp = 100;
        this.name =name;
    }

    //コンストラクタその２でコンストラクタその１を呼び出す this=同一クラスの別のコンストラクタを呼び出す
    Hero(){
        this("ダミー");
    }

    //動作
    //眠る
    void sleep(){
        //this=自分のインスタンスのフィールド
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した！");
    }
    //〇秒座る
    void sit(int sec){
        this.hp +=sec;
        System.out.println(this.name +"は"+sec+"秒座った！" );
        System.out.println("HPが"+sec+"ポイント回復した");
    }
    //転んだ
    void slip(){
        this.hp -= 5;
        System.out.println(this.name +"は、転んだ！");
        System.out.println("5のダメージ‼");
    }
    //逃げる
    void run(){
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GAMEOVER!");
        System.out.println("最終はHPは"+this.hp+"でした");

    }
    void attack(){}



}
