public class FDemo {
    int x;

    FDemo(int i){
        x = i;
    }
    protected void finalize() {
        System.out.println("Finalize " + x);
    }
    void generetor(int i) {
        FDemo o = new FDemo(i);
    }
}
