package models;

public class TodoItem {

	private String description;


	public TodoItem(String description){
		this.description = description;
	}

	public String getDescription(){
		return this.description;
	}
	
}