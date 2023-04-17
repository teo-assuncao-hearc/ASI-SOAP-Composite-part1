package presentation;

import webservice.PublicationWebService;

import javax.xml.ws.Endpoint;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        Endpoint.publish("http://localhost:9000/HelloWorld", new PublicationWebService());
    }
}
