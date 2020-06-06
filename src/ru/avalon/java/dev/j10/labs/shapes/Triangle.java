package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Shape, Point, Polygon {
   private float  x, y, x1, y1;
   private float p, s, lenhgt3, height;

     public Triangle(float x, float x1, float y, float y1) {
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }
     /**
      * площадь треугольника определится как половина произведения 
      * длины стороны (lenhgt3/3) на высоту 
      * @return 
      */
    @Override
    public float getArea() {
          return  s = 1/2*((lenhgt3/3)*height);
    }
/**
 * рассмотрим равностороннего треугольника,
 * у которого длины всех сторон равны
 * lenhgt3 - сумма длины 3-х сторон треугольника (периметр)
 * соответственно периметр равен сумме трех сторон треугольника
 * @return 
 */
    @Override
    public float getPerimeter() {
     lenhgt3 = (float) 3*(x1-x);
        if(lenhgt3 > 0) {
               return p; 
        }
        else return 0.0f;
    }
    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

@Override
    public float getX() {
       return x;
    }
    
@Override
    public float getX1() {
       return x1;
    }
    
@Override
    public float getY() {
       return y;
    }
    
@Override
    public float getY1() {
    return y1;
    }
    /**
     * для определения высоты треугольника ввевдём и переопределим 
     * метод getHeight, который в который возвратит высоту треугольника
     * @param y1
     * @param y
     * @return 
     */
    @Override
    public float getHeight(float y1, float y) {
       height = (y1 - y);
       if(height > 0){
         return height; 
       }
       else return 0;
   }
}
