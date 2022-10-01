public class Last8 {
    int[] last8 = new int[8];
    public void add(int numb) {
        System.arraycopy(last8,0,last8,1,7);
        last8[0]= numb;
    }
    public  int[] last() {
        return last8;
    }
}