interface Syrupable{
    void getSugary();
}
abstract class Pancake implements Syrupable{}

class BlueBerryPancake extends BlueBerryPancake{
    public void getSugary() {;}
}

class SourdoughBlueBerryPancake extends BlueBerryPancake{
    void getSugary(int s){;}
}
