package inheritance;

import java.util.*;
interface Areaperimeter
{
	float calculateArea(float x,float y);
	float calculatePerimeter(float a,float b);
}

class Rectangle implements Areaperimeter
{
	public float calculateArea(float x,float y)
	{
		float area=x*y;
		return area;
	}
	public float calculatePerimeter(float a,float b)
	{
		float perimeter = (2*a) + (2*b);
				return perimeter;
	}
}
class Triangle implements Areaperimeter
{
	public float calculateArea(float x,float y)
	{
		float area = (float) 0.5 * x * y;
		return area;
	}
	public float calculatePerimeter(float a,float b)
	{
		float perimeter=2*(float) Math.PI*a;
				return perimeter;
	}
}




public class Areaofgeometricalshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float area,perimeter;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a:");
		float a = sc.nextFloat();
		System.out.println("enter value of b:");
		float b = sc.nextFloat();
		
		Rectangle rect = new Rectangle();
		area = rect.calculateArea(a, b);
		perimeter = rect.calculatePerimeter(a,b);
				
		System.out.println("rectangle");
		System.out.println("area:\t" + area);
		System.out.println("perimeter:\t" + perimeter);
		
		Triangle triangle = new Triangle();
		area = triangle.calculateArea(a,b);
		perimeter = triangle.calculatePerimeter(a,b);
		
		System.out.println("triangle");
		System.out.println("area:\t" + area);
		System.out.println("perimeter:\t" + perimeter);
		
		
		

	}

}
