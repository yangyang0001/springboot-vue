package com.deepblue.websocket;

import java.net.InetSocketAddress;
import java.util.Iterator;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;


/**
 * websocket服务器
 */
public class MineWebSocketServer extends WebSocketServer{

    public MineWebSocketServer(int port) {
        super(new InetSocketAddress(port));
    }

    /**
     * WebSocket连接关闭时调用
     */
    @Override
    public void onClose(WebSocket ws, int arg1, String arg2, boolean arg3) {
        System.out.println("------------------onClose-------------------");
    }

    /**
     * 错误发生时调用。
     */
    @Override
    public void onError(WebSocket ws, Exception e) {
        System.out.println("------------------onError-------------------");
        if(ws != null) {
        }
        e.getStackTrace();
    }

    /**
     * 接收到的消息
     */
    @Override
    public void onMessage(WebSocket ws, String msg) {

        if(ws.isClosed()) {
            System.out.println("ws连接已经关闭...");
        } else if (ws.isClosing()) {
            System.out.println("ws连接正在关闭...");
        } else if(ws.isOpen()) {
            System.out.println("服务端收到消息 :" + msg);
            // 收到什么消息后 回复消息!
            ws.send("Server send message " + msg);
        }
    }

    /**
     * WebSocket 进行握手之后调用, 并且给 WebSocket 写做准备, 通过握手可以获取请求头信息
     */
    @Override
    public void onOpen(WebSocket ws, ClientHandshake shake) {
        System.out.println("-----------------onOpen--------------------, isOpen= " + ws.isOpen() +
                ", readyState = " + ws.getReadyState() +
                ", attachment = " + ws.getAttachment());
        for(Iterator<String> it=shake.iterateHttpFields();it.hasNext();) {
            String key = it.next();
            System.out.println(key + ":" + shake.getFieldValue(key));
        }
    }
    /**
     * 当服务器成功启动时调用
     */
    @Override
    public void onStart() {
        System.out.println("------------------onStart-------------------");
    }
}





