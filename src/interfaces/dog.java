package interfaces;

interface animal {
    void sound();  //method without body
}
class dog implements animal {
    public void sound()
    {
        System.out.println("bark bark");
    }

}
