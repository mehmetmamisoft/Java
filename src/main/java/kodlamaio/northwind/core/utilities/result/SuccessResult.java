package kodlamaio.northwind.core.utilities.result;

public class SuccessResult extends Result{

	//normalde const için 3 tip const oldu burda 
	//biz ikisini alduk
	//boş ve mesaj olanı
public SuccessResult() {
		
		super(true);
	}
	
   public SuccessResult(String message) {
		
	   super(true,message);
	}
}
