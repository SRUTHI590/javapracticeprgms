package programs;



	 class Child extends Exmplsuper{
			
		 //constructor 3
		 Child(){
			System.out.println("In child no arguments");
		}
		 //constructor 4
		 Child(String name){
			 super(name);
				System.out.println("In child have arguments in constructor 4");
			}

		public static void main(String[] args) {
			
			Child cd=new Child("Sruthi");

		}

	}



