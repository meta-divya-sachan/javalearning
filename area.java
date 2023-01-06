package assigmentsacademy;

public class area {
	
	static class triangle{
		double width;
		double height;
		
		public triangle(double width, double height){
			this.width=width;
			this.height=height;
			
			
		}
		
		double getArea() {
			return width*height;
		}
	}
static class rectangle{
		double width;
		double height;
		public rectangle(double width, double height){
			this.width=width;
			this.height=height;
			
			
		}
		public double getArea() {
			return width*height;
		}
	}
	static class square{
		double width;
		
	public	square(double width){
			this.width = width;
			
			
		}
		double getArea() {
			return width*width;
		}
	}
	static class circle{
		double radius;
		
		public circle(double radius){
			this.radius=radius;
			
			
			
		}
		double getArea() {
			return 22/7*radius*radius;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
triangle t = new triangle(30, 40);
rectangle r = new rectangle(30, 40);
square s = new square( 40);
circle c = new circle(40);

System.out.println("Area of traingle:"+ t.getArea());
System.out.println("Area of rectangle:"+ r.getArea());
System.out.println("Area of square:"+ s.getArea());
System.out.println("Area of circle:"+ c.getArea());
	}

}
