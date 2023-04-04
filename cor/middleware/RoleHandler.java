package middleware;

import framework.Handler;
import framework.Request;

public class RoleHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void handle(Request request) {

        // TODO Auto-generated method stub

        if (request.getUser().getRole().equals("user")) {
            this.nextHandler.handle(request);
        }
    }

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
