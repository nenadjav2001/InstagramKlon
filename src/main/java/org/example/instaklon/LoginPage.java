package org.example.instaklon;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.controlsfx.tools.Borders;
import org.example.instaklon.Interfaces.LoadingGifsAndImages;

public class LoginPage extends Stage implements LoadingGifsAndImages {

    private Scene loginScene;
    private Group rootLoginIn;
    private StackPane mainLayout;
    private final int sceneWidth = 480;
    private final int sceneHeight = 720;


    public LoginPage(){
        this.setTitle("Instagram");
        rootLoginIn = new Group();
        loginScene = new Scene(rootLoginIn , 480 , 400);
        this.setScene(loginScene);
    }


    @Override
    public void loadingGif(String gifPath, int x, int y, Group root) {
        Image gifImage = new Image(gifPath);
        ImageView imageView = new ImageView(gifImage);
        imageView.setX(x);
        imageView.setY(y);
        root.getChildren().add(imageView);
    }

    @Override
    public void changeSizeOfGif(String gifPath, int x, int y, int width, int height, Group root) {
        Image gifImage = new Image(gifPath);
        ImageView imageView = new ImageView(gifImage);
        imageView.setX(x);
        imageView.setY(y);
        imageView.setFitWidth(width);
        imageView.setFitHeight(height);
        root.getChildren().add(imageView);
    }

    @Override
    public void loadingImage(String imagePath, int x, int y, Group root) {
        Image image = new Image(imagePath);
        ImageView imageView = new ImageView(image);
        imageView.setX(x);
        imageView.setY(y);
        root.getChildren().add(imageView);
    }
}
