/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.MedicaSud.app.client.gui;

import com.jfoenix.controls.JFXButton;

import java.io.IOException;

import javax.swing.text.html.ImageView;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */
public class Utilites {
    
    public void newStage(JFXButton button , String fxml , String Title) throws IOException
    {
         FXMLLoader loader=new FXMLLoader(getClass().getResource(fxml));
         Parent root = (Parent) loader.load();		
         Scene newScene = new Scene(root);
         Stage newStage = new Stage();
       
       
       
         Stage stage = (Stage) button.getScene().getWindow();
         newStage.setHeight(stage.getHeight());
         newStage.setTitle(Title);
         newStage.setWidth(stage.getWidth());
         newStage.setScene(newScene);
         newStage.show();
         // do what you have to do
         stage.close();
    }
    
    public void closeStage(JFXButton button)
    {
        
         Stage stage = (Stage) button.getScene().getWindow();
         // do what you have to do
         stage.close();
    }
   public void newStageWithOldStage(String fxml) throws IOException
   {
        FXMLLoader loader=new FXMLLoader(getClass().getResource(fxml));
         Parent root = (Parent) loader.load();		
         Scene newScene = new Scene(root);
         Stage newStage = new Stage();
          newStage.setHeight(300);
        newStage.setWidth(450);
         newStage.setScene(newScene);
         newStage.show();
   }
    
    public void backgroundImage(AnchorPane anchorPane)
    {
            BackgroundImage myBI= new BackgroundImage(new Image("Assets/MSI-Group.jpg",200,80,false,true),
        BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
          BackgroundSize.DEFAULT);
        //then you set to your node
        anchorPane.setBackground(new Background(myBI));
    }
    
  
}
