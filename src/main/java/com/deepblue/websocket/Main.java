package com.deepblue.websocket;

/**
 *
 */
public class Main {

   public static void main(String[] args) {
       MineWebSocketServer socketServer = new MineWebSocketServer(1234);
       socketServer.start();
   }

}
