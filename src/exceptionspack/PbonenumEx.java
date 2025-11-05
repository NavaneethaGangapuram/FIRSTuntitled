package exceptionspack;

public class PbonenumEx {
    static void phone(String num) throws Userexception2{
        if(num.length() !=10){
            throw new Userexception2("phone number must be ten digits");
        }
        System.out.println("valid phone number: "+num);
    }
    public static void main(String[] args){
        try{
            phone("9100372773");
        }
        catch(Userexception2 error){
            System.out.println("invalid phone number" +error.getMessage());
        }

    }
}
