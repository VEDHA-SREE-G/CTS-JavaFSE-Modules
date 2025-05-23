interface Playable{
    void play();
}
class Guitar implements Playable{
public void play(){
    System.out.println("Guitar is playing");
}
}
class Piano implements Playable{
public void play(){
    System.out.println("Piano is playing");
}
}
public class InterfaceImplementation{
public static void main(String[] args) {
    Playable myGuitar = new Guitar();
    Playable myPiano = new Piano();
    myGuitar.play();
    myPiano.play();
}
}