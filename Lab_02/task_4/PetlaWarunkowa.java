public class PetlaWarunkowa {
	   public void compareNumbers() {
		   int a = 10;
		   int b = 20;
	      if (a > b) {
	         System.out.println("a is greater than b");
	      } else if (a < b) {
	         System.out.println("a is less than b");
	      } else {
	         System.out.println("a is equal to b");
	      }
	   }
	   public static void main(String[] args) {
		   PetlaWarunkowa object=new PetlaWarunkowa();
		   object.compareNumbers();
	   }
	   
	}