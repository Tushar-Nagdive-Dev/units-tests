package com.in.tests.business;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.in.tests.data.ToDoService;
import com.in.tests.data.TodoServiceStub;

public class ToDoServiceBusinessImplStub {

    @Test
    public void test_1() {
        ToDoService todoServiceStub = new TodoServiceStub();
        ToDoServiceBusinessImpl toDoServiceBusinessImpl = new ToDoServiceBusinessImpl(todoServiceStub);
        List<String> filterdTodos = toDoServiceBusinessImpl.retrieveTodosRelatedToSpring("Dummy User");

        assertEquals(2, filterdTodos.size());
    }
}
