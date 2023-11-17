

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class M05_14_1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        javafx.scene.layout.GridPane gridPane = new javafx.scene.layout.GridPane();

        ImageView canadaView = new ImageView(new Image("ca.gif"));
        canadaView.setFitHeight(200);
        canadaView.setFitWidth(300);
        canadaView.setSmooth(true);
        canadaView.setCache(true);

        ImageView chinaView = new ImageView(new Image("china.gif"));
        chinaView.setFitHeight(200);
        chinaView.setFitWidth(300);
        chinaView.setSmooth(true);
        chinaView.setCache(true);

        ImageView ukView = new ImageView(new Image("uk.gif"));
        ukView.setFitHeight(200);
        ukView.setFitWidth(300);
        ukView.setSmooth(true);
        ukView.setCache(true);

        ImageView usView = new ImageView(new Image("us.gif"));
        usView.setFitHeight(200);
        usView.setFitWidth(300);
        usView.setSmooth(true);
        usView.setCache(true);

        javafx.scene.layout.GridPane.setConstraints(canadaView, 0, 1);
        javafx.scene.layout.GridPane.setConstraints(chinaView, 2, 4);
        javafx.scene.layout.GridPane.setConstraints(ukView, 0, 4);
        javafx.scene.layout.GridPane.setConstraints(usView, 2, 1);

        gridPane.getChildren().addAll(canadaView, chinaView, ukView, usView);
        Scene scene = new Scene(gridPane);
        primaryStage.setTitle(getClass().getName());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
