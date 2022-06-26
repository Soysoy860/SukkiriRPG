public class Kinoko {
    //属性
    int hp = 50;
    private char suffix;
    public Kinoko(char suffix){
        this.suffix = suffix;
    }
    public char getSuffix(){
        return this.suffix;
    }
   public void attack(Hero h){
       System.out.println("キノコ"+this.suffix+"の攻撃");
       System.out.println("10のダメージ");
       h.setHp(h.getHp() -10);
   }
}
