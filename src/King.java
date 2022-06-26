public class King {
    void talk(Hero h){
        System.out.println("王様：ようこそ我が国へ、勇者"+h.getName());
        System.out.println("王様：長旅疲れたろう。まずは城下町を見てくるとよい。また会おう");
        h.bye();
    }
}
