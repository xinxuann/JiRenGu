public class Client {
    public static void main(String[] args) {
        Leader ms1 = new Banzhang();
        Leader ms2 = new Paizhang();
        Leader ms3 = new Dean();;
        ms1.setNext(ms2);
        ms2.setNext(ms3);
        ms1.handleRequest(8);
    }
}
abstract class Leader {
    private Leader next;
    public void setNext(Leader next) {
        this.next = next;
    }
    public Leader getNext() {
        return next;
    }
    public abstract void handleRequest(int Persion);
}
class Banzhang extends Leader {
    public void handleRequest(int Persion) {
        if (Persion <= 10) {
            System.out.println("班长下达作战命令);
        } else {
            (getNext() != null) {
                getNext().handleRequest(Persion);
        }
    }
}
class Paizhang extends Leader {
    public void handleRequest(int Persion) {
       if (Persion < 50) {
            System.out.println("排长下达作战命令);
        } else {
            (getNext() != null) {
                getNext().handleRequest(Persion);
        }
    }
}
class Yinzhang extends Leader {
    public void handleRequest(int Persion) {
        if (Persion < 200) {
            System.out.println("营长下达作战命令);
        }  else {
            if (getNext() != null) {
                getNext().handleRequest(Persion);
            } else {
                System.out.println("敌人太多，需要开会再下达命令！");
            }
    }
}