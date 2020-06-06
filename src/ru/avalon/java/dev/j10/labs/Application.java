package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;

public class Application {

    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5.5f, 5.2f, 15.7f, 19.8f), new Circle(2.3f, 2.1f, 15.7f, 19.8f),
                          new Circle(1.3f, 5.9f, 5.7f, 19.8f), new Rectangle(9.3f, 6.4f, 15.4f, 6.4f),
                          new Rectangle(9.3f, 6.4f, 16.4f, 6.4f), new Rectangle(4.3f, 1.8f, 5.3f, 1.8f),
                          new Triangle(2.3f, 6.4f, 6.4f, 9.4f), new Triangle(2.3f, 6.4f, 6.4f, 13.4f),
                          new Triangle(2.3f, 6.4f, 6.4f, 36.4f), new Triangle(2.3f, 6.4f, 9.4f, 56.4f)};
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */
    
    }  
      static void equalArea(Shape[] shapes){
        Shape shapest = null;
        for(Shape shape : shapes) {
            if(shapest == null || shapest.getArea() < shape.getArea()) {
                shapest = shape;
            }  
        }
    }
}
