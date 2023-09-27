package Interface;

public class FortisHospital implements UKMedical, USMedical, INMedical {
	@Override
	public void pediaService() {
		System.out.println("FH---- Pedia");
	}
	@Override
	public void dentalService() {
		// TODO Auto-generated method stub
		System.out.println("FH---- dental");
	}
	@Override
	public void entService() {
		// TODO Auto-generated method stub
		System.out.println("FH---- ent");
	}
	@Override
	public void orthoService() {
		System.out.println("FH---- ortho");
	}
	
	@Override
	public void physioService() {		
		System.out.println("FH---- physio");		
	}

	@Override
	public void cardioService() {
		System.out.println("FH---- cardio");		
	}

	@Override
	public void oncologyService() {
		System.out.println("FH---- oncology");				
	}
	
	public void medicalTrianing()
	{
		System.out.println("FH---- MedicalTraining");
	}
	 public void OP()
	 {
		 System.out.println("FH---- OP");
	 }

	@Override
	public void emergencyService() {
			System.out.println("FH---- Emergency");		
	}
	
	//@Override 
	//public static void sample1() {  // giving error
	//	System.out.println("Call static method");
	//}
	
	@Override
	public void sample2() {
		System.out.println("Access Modifier changed - Interface default method is changed to public");
	}
}
