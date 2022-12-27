package javajungsuk.ex;

public class Exercise8_9 {

	public static void main(String[] args) {
		throw new UnsupportedFuntionException("지원하지 않는 기능입니다.",100);
	}

}

class UnsupportedFuntionException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final private int Err_code;
	
	UnsupportedFuntionException(String err,int code){
		super(err);
		this.Err_code=code;
	}
	public int get_errcode() {
		return this.Err_code;
	}
	public String getMessage() {
		return "["+get_errcode()+"]"+super.getMessage();
	}
}