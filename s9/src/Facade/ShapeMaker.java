package Facade;

import java.util.Objects;

public class ShapeMaker {
    Circle circle;
    Rectangle rectangle;
    Square square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle(){
        circle.draw();
        circle.fill();
    }
    public void drawRectangle(){
        rectangle.draw();
        rectangle.dash();
    }
    public void drawSquare(){
        square.draw();
        square.dot();
    }
}
