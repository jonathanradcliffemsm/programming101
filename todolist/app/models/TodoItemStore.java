package models;
import java.util.*;

public class TodoItemStore {

	private ArrayList<TodoItem> todoItems;

	public TodoItemStore(){
		todoItems = new ArrayList<TodoItem>();
	}

	public void addItem(TodoItem item){
		todoItems.add(item);
	}

	public ArrayList getAllItems(){

		return todoItems;

	}


}