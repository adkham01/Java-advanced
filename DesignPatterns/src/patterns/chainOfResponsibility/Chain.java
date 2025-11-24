package patterns.chainOfResponsibility;

import com.sun.net.httpserver.Request;

public interface  Chain {
    void setNextChain(Chain nextChain);
    void calculate(Numbers request);
}
