package com.in.tests.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.in.tests.data.ToDoService;

public class ToDoServiceBusinessImplMock {

    @Test
    public void testRetrieveTodosRelatedSpring_usingMock() {

        ToDoService todoServiceTask = mock(ToDoService.class);
        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
        when(todoServiceTask.retrieveTodos("Active")).thenReturn(todos);
        ToDoServiceBusinessImpl toDoServiceBusinessImpl = new ToDoServiceBusinessImpl(todoServiceTask);
        List<String> filterdTodos = toDoServiceBusinessImpl.retrieveTodosRelatedToSpring("Active");

        assertEquals(2, filterdTodos.size());
    }
}
