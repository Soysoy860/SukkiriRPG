public class Main {
    public static void main(String[] args){
        //1.インスタンス作成&初期設定
        Hero h1 = new Hero("ヒロ");
        h1.hp = 50;


        Hero h2 = new Hero("ミナ");
        h2.hp = 70;


        Kinoko m1 = new Kinoko();
        m1.hp=50;
        m1.suffix='A';

        Kinoko m2 = new Kinoko();
        m2.hp = 48;
        m2.suffix = 'B';

        Cleric c = new Cleric("マイ");

        Wizard w = new Wizard();
        w.name="魔法使い";

        //2.冒険の始まり
        System.out.println(h1.hp);//インスタンスのHP表示
        //Heroクラスのmoneyを表示　静的フィールドへのアクセス法、インスタンスなくても表示可　クラス変数
        System.out.println(Hero.money);
        h1.sit(5);
        h1.slip();
        h1.sit(25);
        h1.run();
        m1.run();
        m2.run();
        c.selfAid();
        c.pray(2);
        w.heal(h1);
        w.heal(h2);

    }
}
