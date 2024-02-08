package assignments;

final class PackageRestrictedClass {
	 final int finalVariable = 10;

	 final void packageRestrictedMethod() {
        System.out.println("This method can only be accessed within the same package");
     }
}
