package org.gradle.examples.web;
 
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


//import org.junit.Test;
//import static org.junit.Assert.*;

public class Servlet {
 
  @Mock
  HttpServletRequest request;

  @Mock
  HttpServletResponse response;

  @Before
  public void setUp() throws Exception {
	MockitoAnnotations.initMocks(this);
  }

  @Test
  public void testHelloWorldPrinting() throws IOException, ServletException {
        //StringWriter sw = new StringWriter();
        //PrintWriter pw = new PrintWriter(sw);
        PrintWriter pw = new PrintWriter();
         
        when(response.getWriter()); //.thenReturn(pw);
 
        Servlet Servlet = new Servlet();
        Servlet.doGet(request, response);
        String result = sw.getBuffer().toString().trim();
        assertEquals(result, new String("hello, world"));
  }
}