public class DecoratorPatternDemo
 
{
   public static void main(String[] args)
      {

	   Shape circle = new Circle();

	      Shape blueCircle = new BlueColorShapeDecorator(new Circle());

	     
	      System.out.println("Circle with normal border");
	      circle.draw();

	      System.out.println("\nCircle of Blue border");
	      blueCircle.draw();

   }
}