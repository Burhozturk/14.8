package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Main extends Application
{
    @FXML public TextArea textArea;


    ArrayList<String> alist=new ArrayList<String>();
    String stringToArraylistString=new String();
    int randomValueInt;





    @Override
    public void start(Stage primaryStage) throws Exception{
        for(int i=0;i<53;i++)
        {
            alist.add(i+".png");
        }
        Random randomValue=new Random();
        this.randomValueInt=randomValue.nextInt(52)+1;



        Controller newController=new Controller();
        String stringRandom=alist.get(randomValueInt);
        String s="HEJ";
        textArea.setText();




        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

/*    public String stringRandomFromArraylist()
    {

        String stringRandom=alist.get(randomValueInt);
        return stringRandom;


    }*/


    public static void main(String[] args)
    {

        launch(args);
    }
}
