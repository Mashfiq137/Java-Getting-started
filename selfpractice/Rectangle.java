package selfpractice;

public class Rectangle {
	
    double width=1,height=1;
	
	Rectangle(){
		
		
		
	}
	
	Rectangle(double x , double y){
		
		width = x;
		
		height = y;
		
	}
	
	double getArea(){
		
				double area;
		
				area = height*width;
		
				return area;
		
				
		
	}
	
	double getPerimeter() {
		
		double perimeter;
		
		perimeter = 2*(height+width);
		
		
		return  perimeter;
		
	}
	
	
}
