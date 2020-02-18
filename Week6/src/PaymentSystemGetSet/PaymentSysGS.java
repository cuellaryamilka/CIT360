package PaymentSystemGetSet;
	
	/* The PaymentSysGS class file for payment system project 
	 * that contains a list of getters and setters.
	 */

	import java.io.Serializable;
	
	
	

	public class PaymentSysGS implements Serializable {
		
		
		
	    private String newName;
	    private int paymentYamilka;
	    private int paymentMarisela;
	    private String nameEmployee;
	    

	    
	    public PaymentSysGS() {
	    }

	    public String getNewName() {
	        return newName;
	    }

	    public void setNewName(String newnName) {
	        this.newName = newnName;
	    }

	    public int getPaymentYamilka() {
	        return paymentYamilka;
	    }

	    public void setPaymentYamilka(int paymentYamilka) {
	        this.paymentYamilka = paymentYamilka;
	    }

	    public int getPaymentMarisela() {
	        return paymentMarisela;
	    }

	    public void setPaymentMariselaa(int paymentMarisela) {
	        this.paymentMarisela = paymentMarisela;
	    }

	    public String getNameEmployee() {
	        return nameEmployee;
	    }

	    public void setNameEmployee(String nameEmployee) {
	        this.nameEmployee = nameEmployee;
	    }
		
		}
		
	   
	
	