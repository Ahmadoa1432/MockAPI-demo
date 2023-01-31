package com.example;

import static org.mockito.Mockito.*;

import java.net.SocketPermission;
import java.net.SocketTimeoutException;
import java.rmi.StubNotFoundException;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        // Linked List
    //    LinkedList mockedLinkedList = mock();

    //    when(mockedList.get(0)).thenReturn("first");

    //    System.out.println(mockedList.get(0));

    //    System.out.println(mockedList.get(999));
    
    // Verification
       List mockedList = mock();

       mockedList.add("hi");
       mockedList.clear();

       verify(mockedList).add("hi");
       verify(mockedList).clear();

       // Argument Matchers, print "element" to the console if the same element type matched
       when(mockedList.get(anyInt())).thenReturn("element");

       System.out.println(mockedList.get(999));

    }
}
