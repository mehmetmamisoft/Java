package kodlamaio.northwind.core.utilities.result;

public class ErrorResult extends Result{

	//normalde const için 3 tip const oldu burda 
	//biz ikisini alduk
	//boş ve mesaj olanı
public ErrorResult() {
		
		super(false);
	}
	
   public ErrorResult(String message) {
		
	   super(false,message);
	}
}
