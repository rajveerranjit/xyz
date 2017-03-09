package demo.workingwitharray;

class A{
	
}
class subharu extends A{
	 
}
class ferrari extends A{
	
}
class notinrelation{
	
}


public class ArrayElementAssignment {

	public static void main(String[] args) {
             int [] ref=new int[4];
             int a=5;byte b=2;
             char c='c';
             short d=6;
             double e=1.2;
             ref[0]=a;
             ref[1]=b;
             ref[2]=c;
             ref[3]=d;
             //ref[4]=(int)e;
          
             
             A [] mycars={new A(),new subharu(),new ferrari()}; 
             //car [] mycars={new car(),new subharu(),new ferrari(),new notinrelation()};
             
	}

}
