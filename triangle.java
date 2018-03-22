package cn.tju.scs;

public class triangle {
    public triangle(){}
	public String triangles(int a, int b, int c) {
		if(a + b > c && a + c > b && b + c > a)	
		{
			if(a == b && b == c)
				return "equilateral";
			else if(a == b || b == c || a == c)
				return "isosceles";
			else {
				return "scalene";
			}
		}
		else {
			return "Non-triangular";
		}
	}

}
