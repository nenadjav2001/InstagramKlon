package org.example.instaklon;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;



public class LoadingScreen extends Application{




    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage Stage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root , 800 , 600 , Color.WHITE);
        Stage.setTitle("Instagram");

        Stage stage = new Stage();
        stage.initStyle(StageStyle.UNDECORATED);


        loadingGif("C:\\Users\\bewer\\Documents\\InstaKlon\\src\\insta_loading_screen_mograph_dribbble.gif" , 0 , 0 , root);


        initLoginPage(stage , new LoginPage());


        stage.setScene(scene);
        stage.show();

    }

    private static void loadingGif(String gifPath , int x , int y , Group root){
        Image gifImage = new Image(gifPath);
        ImageView imageView = new ImageView(gifImage);
        imageView.setX(x);
        imageView.setY(y);
        root.getChildren().add(imageView);
    }


    private static void initLoginPage(Stage stage , Stage loginStage){

        PauseTransition delay = new PauseTransition(Duration.seconds(7));
        delay.setOnFinished(event -> {
            stage.close();
            loginStage.show();
        });
        delay.play();



    }

}