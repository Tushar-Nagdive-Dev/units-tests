package com.in.tests.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*; 
import static org.mockito.BDDMockito.given;
import static org.hamcrest.CoreMatchers.is;

import java.util.List;

import org.junit.Test;

public class ListTest {

    @Test
    public void mockListSizeMethod() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        assertEquals(2, listMock.size());
    }

    @Test
    public void mockListSize_multipleReturn() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3).thenReturn(10);

        assertEquals(2, listMock.size());
        assertEquals(3, listMock.size());
        assertEquals(10, listMock.size());
    }

    @Test
    public void mockListGet() {
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("get value");

        assertEquals("get value", listMock.get(0));
        assertEquals(null, listMock.get(1));
    }

    /* BDD pattern */
    @Test
    public void letsMockListGet_BDD() {
        //Given
        List listMock = mock(List.class);
        given(listMock.get(anyInt())).willReturn("Set Values");

        //when
        String firstElement = (String) listMock.get(0);
 
        //then TESTSS
        assertThat(firstElement, is("Set Values"));

    }
}
