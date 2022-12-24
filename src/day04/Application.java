package day04;

public class Application {
    public static void main(String[] args) {
        String str="selam naber";
        // ıf arguments is provide, use it ,otherwise, display "Selam"
        if (args.length>0){
            System.out.println(args[0]);
        }else{
            System.out.println("hello world :)");
        }
    }
}
