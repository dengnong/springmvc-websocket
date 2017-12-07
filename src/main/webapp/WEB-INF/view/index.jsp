<html>
<head>
    <script type="text/javascript" src="http://cdn.bootcss.com/jquery/3.1.0/jquery.min.js"></script>
    <script type="text/javascript" src="http://cdn.bootcss.com/sockjs-client/1.1.1/sockjs.js"></script>
    <script>
        var websocket;
        $(document).ready(function(){
            var path = $("#basePath").val();

            if ('WebSocket' in window) {
                websocket = new WebSocket("ws://localhost:8080/ws");
            } else if ('MozWebSocket' in window) {
                websocket = new MozWebSocket("ws://localhost:8080/ws");
            } else {
                websocket = new SockJS("http://localhost:8080/ws/sockjs");
            }
            websocket.onopen = onOpen;
            websocket.onmessage = onMessage;
            websocket.onerror = onError;
            websocket.onclose = onClose;
            window.close=function()
            {
                websocket.onclose();
            }
        });
    </script>
</head>
<body>
<h2>websocket client</h2>
</body>
</html>
