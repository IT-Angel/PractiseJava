import animal.Bear;
import animal.BrownBear;
import animal.Panda;
import ball.Ball;
import ball.Color;
import ball.Size;
import bird.Bird;
import bird.Duck;
import exception.MyArrayException;
import file.FileUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FileUtils fileUtils = new FileUtils();
        fileUtils.readFile();



    }
}






        /*Ball ball = new Ball();
        ball.setName("World 2023");
        ball.setColor(Color.GREEN);
        ball.setType("Football");
        ball.setSize(Size.FOURTH);
        ball.setBrand("Adidas");
System.out.println(ball);*/

        //Panda panda = new Panda("Rex", (byte) 20);

//final Integer intVal;





//        BrownBear bearOne = new BrownBear();
//        bearOne.setName("Mike");
//        bearOne.setColour("purple");
//
//        BrownBear bearTwo = new BrownBear();
//        bearTwo.setName("Mike");
//        bearTwo.setColour("purple");
//System.out.println(brownBearTwo.hashCode());
//        System.out.println(bearOne.equals(bearTwo));





//        Panda panda = new Panda();
//        panda.setName("Ann");
//        panda.setType("Chinese");
//        panda.setColour("Black-white");
//        panda.setWeight(100);
//        System.out.println(panda);
//        panda.eat();


//Bear panda = new Panda();
//        panda.setName("Mike");
//printName(panda);
//        }
//
//static void printName(Bear bear) {
//    System.out.println(bear.getName());
//}