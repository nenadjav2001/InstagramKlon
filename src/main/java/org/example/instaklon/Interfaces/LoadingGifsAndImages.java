package org.example.instaklon.Interfaces;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public interface LoadingGifsAndImages {


    public void loadingGif(String gifPath , int x , int y , Group root);

    public void changeSizeOfGif(String gifPath, int x, int y, int width, int height, Group root);

    public  void loadingImage(String imagePath , int x , int y , Group root);



}
