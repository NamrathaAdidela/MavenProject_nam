package Interface;

public interface INMedical {

	public void physioService();
	public void cardioService();
	public void oncologyService();
	public void emergencyService();
	 public static void sample1() {
		 System.out.println("Static Method in IN interface");
	 }
	 
	 default void sample2() {
		 System.out.println("Deafult method, can be overriddenin implemneted class");	
	 }
	
}
