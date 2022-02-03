package com.company;


public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Fish info:");
        Fish fish = new Fish();
        fish.setNameVid("рыба-ангел");
        fish.setNameFish("Флаундер");
        fish.setAgeFish(5);
        fish.setWeightFish(0.5);
        fish.setColorFish("yellow and black");
        fish.showInfo();
        fish.fish();
        System.out.println("+-------------------------------------------------+");

        System.out.println("Parrot info:");
        Parrot parrot = new Parrot();
        parrot.setparVid("Ара");
        parrot.setNamePar("Голубчик");
        parrot.setAgeParrot(4);
        parrot.setWeightParrot(3.5);
        parrot.setColorPar("blue");
        parrot.showInfo();
        parrot.parrot();
        System.out.println("+-------------------------------------------------+");

        System.out.println("Cat info:");
        Cat cat = new Cat();
        cat.setCatPoroda("Дейн Кун");
        cat.setNameCat("Люцифер");
        cat.setAgeCat(10);
        cat.setWeightCat(14.5);
        cat.setColorCat("черный с белым лицом");
        cat.showInfo();
        cat.cat();
        System.out.println("+-------------------------------------------------+");


        System.out.println("Dog info:");
        Dog dog = new Dog();
        dog.setDogPoroda("Далматин");
        dog.setNameDog("Понго");
        dog.setAgeDog(10);
        dog.setWeightDog(15.6);
        dog.setColorDog("белый с черными точками или пятнами");
        dog.showInfo();
        dog.dog();
    }
}


//         Балык, Попугай, мышык жана ит деген класс тузунуз
//        Алардын свойстваларын ойлоп табыныз
//        Бир канча объектилерин тузуп жана аларга маанилерин бериниз
//        Аларды консольго чыгарыныз
//        Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек