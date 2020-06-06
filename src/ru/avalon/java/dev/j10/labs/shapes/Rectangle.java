package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Shape, Point, Polygon {
 private float x, y, x1, y1;
         
 public float p, s, lenght1, lenght2;
 
 public Rectangle(float x, float y, float x1, float y1) {
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
 }
 
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
 /**
  * s - площадь прямоугольника
  * @return 
  */
@Override
    public float getArea() {
        return s = (lenght1*lenght2);
      }
/**
 * параметр р - периметр прямоугольника
 * lenght1, lenght2 - длины стоорон прямоугольника
 * @return 
 */
@Override
    public float getPerimeter() {
       lenght1 = x1-x;
       lenght2 = y1-y;
        p = 2*(lenght1 + lenght2);
       if( p  > 0) {
       return p;        
       }
       else return 0.0f;
    }
/**
 * точки x, y, x1, y1 - вершины пряиоугольника
 * @return 
 */
    @Override
    public float getX() {
       return x;
    }

    @Override
       public float getY() {
         return y;
    }
    @Override
       public float getX1() {
         return x1;   
    }

    @Override
       public float getY1() {
         return y1;
    }
}
