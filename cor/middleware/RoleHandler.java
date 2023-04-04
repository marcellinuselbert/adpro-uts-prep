package middleware;

import framework.Handler;
import framework.Request;

public class RoleHandler implements Handler {

    @Override
    public void handle(Request request) {

        // TODO Auto-generated method stub

    }

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
