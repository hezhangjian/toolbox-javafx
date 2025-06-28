package io.github.hezhangjian.toolbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ToolBoxMain extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setHgap(30);
        grid.setVgap(30);
        grid.setPadding(new Insets(40));
        grid.setAlignment(Pos.CENTER);

        Scene scene = new Scene(grid, 1200, 800);
        primaryStage.setTitle("ChuQin");
        primaryStage.setScene(scene);
        primaryStage.show();

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Button createToolButton(String title, String description) {
        Button button = new Button(title + "\n" + description);
        button.setPrefSize(200, 120);
        button.setWrapText(true);
        button.setFont(Font.font(14));
        button.setStyle("""
            -fx-background-color: white;
            -fx-border-color: #cccccc;
            -fx-border-radius: 10;
            -fx-background-radius: 10;
            -fx-effect: dropshadow(gaussian, rgba(0,0,0,0.1), 4, 0, 0, 2);
            -fx-text-alignment: center;
        """);

        if (title.startsWith("自动登录网站")) {
            button.setOnAction(e -> {
                System.out.println("调用 ChromeDriver 自动登录网站...");
            });
        }

        return button;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
