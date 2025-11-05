package interfaces;

interface calls{
    void makecalls();
    void receivecalls();
}
interface musicplayer{
    void startmusic();
    void stopmusic();

}
interface camera{
    void takephotos();
    void recordvideos();
}

class mobile implements calls,musicplayer,camera {
    public void makecalls(){
        System.out.println("people can make calls using mobile");
    }
    public void receivecalls(){
        System.out.println("people can receive calls using mobile");
    }
    public void startmusic(){
        System.out.println("people can start and listen to music");
    }
    public void stopmusic(){
        System.out.println("people can stop music ");
    }
    public void takephotos(){
        System.out.println("people can capture their memories");
    }
    public void recordvideos(){
        System.out.println("record the videos");
    }
}
