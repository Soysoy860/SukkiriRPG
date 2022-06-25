import java.util.*;
//乱数を使うため
public class Cleric {
    String name;
    int hp = 50;
    static final int MAXHP = 50;
    int mp = 10;
    static final int MAXMP =10;

//コンストラクタの作成
//３つの引数
   Cleric(String name,int hp, int mp){
    this.name = name;
    this.hp = hp;
    this.mp = mp;
   }
   //2つの引数
    Cleric(String name,int hp){
    this(name,hp,Cleric.MAXMP);
    }

    Cleric(String name){
    this(name,Cleric.MAXHP,Cleric.MAXMP);
    }

    //HP回復魔法
    void selfAid(){
        System.out.println(this.name+"はセルフエイドを唱えた!");
        this.mp -= 5;
        this.hp = this.MAXHP;
        System.out.println(this.name+"はMPを5使用してHPを"+this.hp+"まで回復した！");
    }

    //MP回復
    public int  pray(int sec){
        System.out.println(this.name +"は"+sec+"秒間天に祈った！");

        //論理上の回復量を乱数を用いて決定する
        int recover = new Random().nextInt(3) +sec;

        //実際の回復量を計算する 最大MPー現在MP　と　回復量を比べて小さいほうを実際の回復量とする
        int recoverActual = Math.min(this.MAXMP - this.mp,recover);

        this.mp += recoverActual;
        System.out.println("MPが"+recoverActual+"回復した");
        return recoverActual;

//        自分の解答
        //int r = new java.util.Random().nextInt(3);
//        if (this.mp + sec + r > this.MAXMP){
//            return this.mp = this.MAXHP;
//        }else{
//            return this.mp +=sec + r;
//        }

    }
}
