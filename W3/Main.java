public class Main {
    

    public static void main(String[] args){
        Forest f3 = new Forest();
        f3.addTree(50);
        f3.addTree(25);
        f3.addTree(75);
        System.out.println("A forrest growing to full size:");
        for (int i = 0 ; i < 14 ; i++) {
            f3.growOneYear();
            System.out.println(f3);
        }
    }
}
