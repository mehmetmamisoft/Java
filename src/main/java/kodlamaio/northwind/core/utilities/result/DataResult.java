package kodlamaio.northwind.core.utilities.result;

public class DataResult<T> extends Result{

	private T data;
	public DataResult(T data,boolean success, String message) {
		
		//base(result) constructor barındırır
		super(success, message);
		this.data=data;
	}

    public DataResult(T data,boolean success) {
		
		 
		super(success);
		this.data=data;
	}

	public T getData() {
		return this.data;//data'da olur tekli
	}
	
}
