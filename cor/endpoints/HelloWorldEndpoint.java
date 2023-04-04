package endpoints;

import framework.Handler;
import framework.Request;

public class HelloWorldEndpoint implements Handler {
    @Override
    public void handle(Request request){
        System.out.println("Hello world, and especially you, " + request.getQuery("name"));
    }
}
