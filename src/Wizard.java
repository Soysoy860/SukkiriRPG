public class Wizard {
    private int hp; private int mp;
    private String name;   private Wand wand;

    //回復魔法
    public void heal(Hero h){
        int basePoint = 10;//基本回復ポイント
        int recoverPoint =(int)(basePoint * this.wand.getPower());//杖による増幅
        h.setHp(h.getHp() + recoverPoint);//勇者のHPを回復させる
        System.out.println(h.getName()+"のHPを"+recoverPoint+"回復した！");

    }
    //HP
    public int getHp(){return this.hp;}
    public void setHp(int hp){
        if(hp <0){this.hp =0;}else{this.hp =hp;}
    }

    //MP
    public int getMp(){return this.mp;}
    public void setMp(int mp){
        if(mp < 0){throw new IllegalArgumentException("設定されようとしているMPが異常です");
        }
        this.mp =mp;
    }

    //名前
    public String getName(){return this.name;}
    public void setName(String name){
        if(name==null||name.length()<3){
            throw new IllegalArgumentException("魔法使いに設定されようとしている名前が異常です");
        }
        this.name = name;
    }

    //杖
    public Wand getWand(){return this.wand;}
    public void setWand(Wand wand){
        if(wand==null){
            throw new IllegalArgumentException("設定されようとしている杖がnullです");
        }
        this.wand=wand;
    }
}
