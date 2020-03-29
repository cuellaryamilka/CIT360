package PaymentSystemControl;

import java.util.HashMap;

public interface Handler {
	
	// This is the first HashMap contains the label of the 
	//method and its data
	public Object handleIt (HashMap<String, Object> data);
	}

