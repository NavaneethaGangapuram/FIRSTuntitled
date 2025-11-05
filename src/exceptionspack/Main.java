package exceptionspack;

public class Main {
    static void CheckAge(int age) throws UserException{
        if(age<18){
            throw new UserException("you are not eligible to vote");
        }
        else{
            System.out.println("you are eligible to vote");
        }
    }
    public static void main(String[] args){
        try{
            CheckAge(14);
        }
        catch(UserException error){
            System.out.println("these is an user exception "+error.getMessage());
        }
    }



}
