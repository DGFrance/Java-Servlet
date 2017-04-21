package simpleServlet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.sun.org.apache.xpath.internal.functions.Function;

@SessionScoped
@ManagedBean
public class NameWrapper {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
