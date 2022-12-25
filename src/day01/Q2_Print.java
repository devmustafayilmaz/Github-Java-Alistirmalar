package day01;

public class Q2_Print {
    public static void main(String[] args) {

        //76453 sayisinin her bir basamagini konsolda alt alta yazdirin.
        int input=76453;

        int birler=input%10;
        int onlar=(input/10)%10;
        int yuzler=(input/100)%10;
        int binler=(input/1000)%10;
        int onbinler=(input/10000)%10;
        System.out.println(birler+ "\n"+onlar+"\n"+yuzler+"\n"+binler+"\n"+ onbinler);

    }
}
