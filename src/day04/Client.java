package day04;

public class Client {
    private Service service;

    public void start(){
        service.doIt();
    }
    public static void main(String[] args) {
        Service service=new Service();
        service.doIt();
    }
}
