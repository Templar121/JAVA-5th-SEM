
class PerimeterTriangle { 
	static float findPerimeter(float a, float b, float c) 
	{ 
		// Formula for Perimeter of triangle 
		return (a + b + c); 
	} 

	// Driver method 
	public static void main(String[] args) 
	{ 
		float a = 2.0f, b = 3.0f, c = 5.0f; 
		System.out.println(findPerimeter(a, b, c)); 
	} 
} 
