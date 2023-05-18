package SimpleFactoryShape;

public class ShapeFactory {
    public Shape createShape(ShapeType shapeType) throws Exception {
        switch (shapeType){
            case Circle:{
                return new Circle(0);
            }
            case Rectangle:{
                return new Rectangle(4);
            }
            default:{
                throw new Exception("Incorrect shape type");
            }
        }
    }
}
