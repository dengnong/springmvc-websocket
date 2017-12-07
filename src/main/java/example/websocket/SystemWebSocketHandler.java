package example.websocket;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 54472 on 2017/12/7.
 */
public class SystemWebSocketHandler implements WebSocketHandler {
    private static final List<WebSocketSession> session = new ArrayList<WebSocketSession>();
    @Override
    public void afterConnectionEstablished(WebSocketSession webSocketSession) throws Exception {
        System.out.println("已连接服务端……");
    }

    /**
     * 接收到客户端消息时调用
     */
    @Override
    public void handleMessage(WebSocketSession webSocketSession, WebSocketMessage<?> webSocketMessage) throws Exception {
        System.out.println("接收到客户端消息");
    }

    @Override
    public void handleTransportError(WebSocketSession webSocketSession, Throwable throwable) throws Exception {

    }

    @Override
    public void afterConnectionClosed(WebSocketSession webSocketSession, CloseStatus closeStatus) throws Exception {
        System.out.println("WebSocket关闭！");
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }
}
