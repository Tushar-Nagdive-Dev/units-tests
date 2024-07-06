package com.in.tests.business;

import java.util.ArrayList;
import java.util.List;

import com.in.tests.data.ToDoService;

public class ToDoServiceBusinessImpl {

    private ToDoService toDoService;

    public ToDoServiceBusinessImpl(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String users) {
        List<String> filteredTodos = new ArrayList<String>();
        List<String> todos = toDoService.retrieveTodos(users);
        for(String todo: todos) {
            if(todo.contains("Spring")) {
                filteredTodos.add(todo);
            }
        }

        return filteredTodos;
    }
}
