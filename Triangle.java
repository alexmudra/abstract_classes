package Abstract;

public class Triangle extends Shape {
	double a;
	double b;
	double c;
	
	@Override
	double calculatePerimetr (){
		return a+b+c;
	}
	@Override
	double calculateArea(){
		return Math.sqrt(a) // 
	}
}
   
