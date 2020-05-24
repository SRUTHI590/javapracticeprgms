package programs;

public class Thisconstructor {
	 private int a,b,width,height;
	Thisconstructor(){
		System.out.println("haiii");
		
	}
  Thisconstructor(int a){
	  this();
	  System.out.println("second constructor");
		}
  Thisconstructor(int a,int b){
	this(9);
	System.out.println("the addition is:"+(a+b));
  }

	public static void main(String[] args) {
		 
		Thisconstructor cc=new Thisconstructor(8,9);
	
		
		
			}

}
