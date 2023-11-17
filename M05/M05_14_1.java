import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ImageDisplayApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane gridPane = new GridPane();

        ImageView canadaImageView = new ImageView(new Image("ca.gif"));
        canadaImageView.setFitHeight(200);
        canadaImageView.setFitWidth(300);
        canadaImageView.setSmooth(true);
        canadaImageView.setCache(true);

        ImageView chinaImageView = new ImageView(new Image("china.gif"));
        chinaImageView.setFitHeight(200);
        chinaImageView.setFitWidth(300);
        chinaImageView.setSmooth(true);
        chinaImageView.setCache(true);

        ImageView ukImageView = new ImageView(new Image("uk.gif"));
        ukImageView.setFitHeight(200);
        ukImageView.setFitWidth(300);
        ukImageView.setSmooth(true);
        ukImageView.setCache(true);

        ImageView usImageView = new ImageView(new Image("us.gif"));
        usImageView.setFitHeight(200);
        usImageView.setFitWidth(300);
        usImageView.setSmooth(true);
        usImageView.setCache(true);

        GridPane.setConstraints(canadaImageView, 0, 1);
        GridPane.setConstraints(chinaImageView, 2, 4);
        GridPane.setConstraints(ukImageView, 0, 4);
        GridPane.setConstraints(usImageView, 2, 1);

        gridPane.getChildren().addAll(canadaImageView, chinaImageView, ukImageView, usImageView);
        Scene scene = new Scene(gridPane);
        primaryStage.setTitle(getClass().getName());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
