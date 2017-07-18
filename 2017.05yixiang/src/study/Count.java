package study;

import java.util.ArrayList;
import java.util.List;

public class Count {
	private String name;
	private List<String> list = new ArrayList();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(String str) {
		list.add(str);
	}
	
}
