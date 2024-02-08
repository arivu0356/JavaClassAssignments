package assignments;

public class FinalMethod {
	 public static void main(String[] args) {
	        PackageRestrictedClass restrictedObj = new PackageRestrictedClass();
	
	        System.out.println("Final Variable: " + restrictedObj.finalVariable);
	        
	        restrictedObj.packageRestrictedMethod();
	 }
}
