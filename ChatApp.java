package com.example.dem;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChatApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextArea chatArea = new TextArea();
        chatArea.setEditable(false);
        chatArea.setWrapText(true);

        // Simulating the chat conversation
        chatArea.appendText("Ngọc: Would you want to go outside now?\n");
        chatArea.appendText("Khoa: It is a good idea. What time?\n");
        chatArea.appendText("Ngọc: Wait a minute, I will go to your home now. Get ready and remember I will come at 5 p.m.\n");
        chatArea.appendText("Khoa: OK!");

        VBox root = new VBox(chatArea);
        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Chat App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

