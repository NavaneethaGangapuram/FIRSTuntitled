package enumexample;

class directionex{
    enum directions{
        NORTH,SOUTH,EAST,WEST
    }
    public static void main(String[] args)
    {
        directions d=directions.SOUTH;
        System.out.println("Telangana is a south state"+d);
        for(directions d1:directions.values()){
            System.out.println("directions is: "+d1);
        }
        directions dd;
        dd=directions.WEST;
        if(dd.toString()=="NORTH")
        {
            System.out.println("NORTH");
        }
        else if(dd.toString()=="SOUTH")
        {
            System.out.println("SOUTH");
        }
        else if(dd.toString()=="EAST")
        {
            System.out.println("EAST");
        }
        else if(dd.toString()=="WEST")
        {
            System.out.println("WEST");
        }
    }
}
