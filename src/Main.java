public class Main {
    public static void main(String[] args){
        //1.インスタンス作成&初期設定
        Hero h1 = new Hero();
        h1.setHp(50);
        h1.setName("ヒロ");


        Hero h2 = new Hero();
        h1.setHp(70);
        h1.setName("ミナ");


        Kinoko m1 = new Kinoko('A');
        m1.hp=50;


        Kinoko m2 = new Kinoko('B');
        m2.hp = 48;

        PoisonKinoko pm =new PoisonKinoko('A');

        Cleric c = new Cleric("マイ");

        Wizard w = new Wizard();
        w.setName("魔法使い");
        w.setMp(2);


        Wand wand = new Wand();
        wand.setName("はじまり");
        wand.setPower(2.3);

        w.setWand(wand);



        //2.冒険の始まり
        System.out.println(h1.getHp());//インスタンスのHP表示
        //Heroクラスのmoneyを表示　静的フィールドへのアクセス法、インスタンスなくても表示可　クラス変数
        System.out.println(Hero.money);
//        h1.sit(5);
//        h1.slip();
//        h1.sit(25);
//        h1.run();
//        c.selfAid();
//        c.pray(2);
        w.heal(h1);
        w.heal(h2);
        pm.attack(h1);
    }
}
