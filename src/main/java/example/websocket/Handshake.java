package example.websocket;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

import java.util.Map;

/**
 * Created by 54472 on 2017/12/7.
 */
public class Handshake extends HttpSessionHandshakeInterceptor {

    //当有新的websocket连接进入时触发
    @Override
    public boolean beforeHandshake(ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse, WebSocketHandler webSocketHandler, Map<String, Object> map) throws Exception {
        System.out.println("beforeHandshake");
        return super.beforeHandshake(serverHttpRequest, serverHttpResponse, webSocketHandler, map);
    }

    @Override
    public void afterHandshake(ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse, WebSocketHandler webSocketHandler, Exception e) {
        System.out.println("afterHandshake");
        super.afterHandshake(serverHttpRequest, serverHttpResponse, webSocketHandler, e);
    }
}
