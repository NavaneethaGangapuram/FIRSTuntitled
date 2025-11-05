package usingabstract2;

abstract class onlinevehicle {
    abstract void pickup(String location);

    abstract void dropdown(String destination);

    void service(int amount) {
        System.out.println(amount + " is paid");
    }
}

