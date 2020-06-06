package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */

public class Circle implements Shape, Point, Ellipse {
  private float  x, y, x1, y1;
  private int j;
  private float  lenght, radius, s;
  
    public Circle(float x, float y, float x1, float y1) {
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }
    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
    @Override
    public float getArea() {
          return s = (3.14f*(lenght*lenght));    
    }

  @Override
    public int getRotation() {
        return j;
    }
// возвращение радиуса эллипса
    @Override
    public float getRadius() {
        float dx = x - x1;
        float dy = y - y1;
        
       radius = (float) Math.sqrt(dx*dx + dy*dy);       
          if(radius > 0.0);
            return radius;
    }
    // возвращение длины эллипса
    @Override
    public float getLength() {
        float dx = x1 - x;
        float dy = y1 - y;
       
        lenght = (float) 3.14*(dx + dy);
           if(lenght > 0.0) {
            return lenght;  }
      return 0;
    }
    
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