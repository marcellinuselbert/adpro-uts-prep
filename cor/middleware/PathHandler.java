package middleware;

import framework.Handler;
import framework.Request;

public class PathHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void handle(Request request) {

        if (request.getPath().equals("/hello-world")) {
            this.nextHandler.handle(request);
        }
        // TODO Auto-generated method stub

    }

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
