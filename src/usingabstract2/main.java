package usingabstract2;

public class main {
    public static void main(String[] args) {
        onlinevehicle onve;
        onve=new cab();
        onve.pickup("jntu");
        onve.dropdown("RGI airport");
        onve.service(345);
        onve=new ola();
        onve.pickup("miyapur");
        onve.dropdown("ameerpet");
        onve.service(345);
        onve=new rapido();
        onve.pickup("KBHP");
        onve.dropdown("jntu");
        onve.service(345);
    }
}
