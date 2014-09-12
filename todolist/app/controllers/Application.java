package controllers;

import play.*;
import play.mvc.*;
import play.data.*;

import views.html.*;
import java.util.*;
import models.*;

public class Application extends Controller {

	private static TodoItemStore todoItemStore = new TodoItemStore();

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result todolist() {
        return ok(todolist.render("Jon's To Do List.", todoItemStore.getAllItems()));
    }

    public static Result addItem() {

    	DynamicForm requestData = Form.form().bindFromRequest();

    	
    	String todoItem = requestData.get("todoitem");

    	System.out.println("Adding item " + todoItem);

    	//todoItemStore.addItem(todoItem);

    	return redirect("/todolist");
    }

}
