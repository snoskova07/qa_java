package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    Feline feline;
    // Почему 2 метода Lion? один конструктор, а другой нет.
    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }
 //   Feline feline = new Feline();
    // Не понимаю тему с инъекциями. Вообще.
    public Lion(Feline feline) {
     this.feline = feline;
 }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
