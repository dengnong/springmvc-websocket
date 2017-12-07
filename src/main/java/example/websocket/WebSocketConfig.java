package example.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * Created by 54472 on 2017/12/7.
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig extends WebMvcConfigurerAdapter implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(new SystemWebSocketHandler(), "/ws")
                .addInterceptors(new Handshake());
        webSocketHandlerRegistry.addHandler(new SystemWebSocketHandler(), "/ws/sockjs")
                .addInterceptors(new Handshake())
                .withSockJS();
    }
}
