import javax.sound.midi.Soundbank;

public class Hero {
    //属性
    private int hp;
    String name;
    static int money;//静的フィールド
    Sword sword;


//    //コンストラクタその１
//    Hero(String name){
//        this.hp = 100;
//        this.name =name;
//    }
//
//    //コンストラクタその２でコンストラクタその１を呼び出す this=同一クラスの別のコンストラクタを呼び出す
//    Hero(){
//        this("ダミー");
//    }

    //メソッド経由でフィールにアクセス ゲッター
    //名前
    public String getName(){
        return  this.name;
    }

    public void setName(String name){
        if(name == null){
            throw new IllegalArgumentException("名前がnullである。処理を中断");
        }
        if(name.length() <=1){
            throw new IllegalArgumentException("名前が短すぎる。処理を中断");
        }
        if(name.length() >= 8){
            throw new IllegalArgumentException("名前が長すぎる。処理を中断");
        }
        this.name =name;
    }

    //HP
    public int getHp(){
        return this.hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }


    //動作
    void bye(){
        System.out.println("勇者は分かれを告げた");
    }

    private void die(){
        System.out.println(this.name + "は死んでしまった！");
        System.out.println("GAME OVERです");
    }


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
    public void attack(Kinoko m){
        System.out.println(this.name +"の攻撃！");
        System.out.println("お化けキノコ"+m.getSuffix()+"から2ポイントの反撃を受けた");
        this.hp -=2;
        if(this.hp <= 0){
            this.die();
        }


    }



}
