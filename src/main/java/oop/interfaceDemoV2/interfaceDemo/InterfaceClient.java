package oop.interfaceDemoV2.interfaceDemo;

public class InterfaceClient {

    public static void main(String[] args) {
        DogV2 dogV2 = new DogV2();
        dogV2.makeSoundAndSpeak();

        CatV2 catv2 = new CatV2();
        catv2.makeSoundV2();

//        Animal dogV3 = new DogV2();
//        dogV3.makeSoundAndSpeak();
    }
}
