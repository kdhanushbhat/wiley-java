package models;
import org.springframework.web
.servlet.ModelAndView;
public class HelloWorld extends ModelAndView {
	private String message;
	private String dateTime;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

}
