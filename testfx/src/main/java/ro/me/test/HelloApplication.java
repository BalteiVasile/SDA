package ro.me.test;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.chart.ScatterChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import org.w3c.dom.Text;
import org.w3c.dom.events.Event;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//#region explicatii

//vbox - vertical
    //vbox v=new vbox (dimensiune,elemente dorite,x,y,z);
//hbox - orizontal
    //hbox h=new hbox (la fel ca la vbox)

//endregion
public class HelloApplication extends Application
{
    TextField text;
    ArrayList<produse> lista=new ArrayList<produse>();

    @Override
    public void start(Stage stage) throws IOException
    {
        Button citire=new Button("citire");
        text=new TextField();

        citire.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                if(citeste())
                    for (produse obj : lista) {
                        text.appendText(obj.toString());
                    }

                //stage.hide();
            }
        });

        VBox v=new VBox(20,citire,text);
        Scene scena=new Scene(v,25,300);

        stage.setScene(scena);
        stage.setTitle("testplm");
        stage.show();
    }

    public static void main(String[] args)
    {
        //citeste();
        launch();
    }

    public boolean citeste()
    {
        try
        {
            File f=new File("in.txt");
            Scanner s= new Scanner(f);

            while(s.hasNextLine())
            {
                String aux=s.nextLine();
                String[] p=aux.split("'");

                produse prod=new produse(p[0],p[1],Double.parseDouble(p[2]));
                lista.add(prod);
            }

            return true;
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Eroare, fisier negasit");
            return false;
        }
    }
}

//#region prim exemplu
/*
Button buton=new Button();
        buton.setText("ceaw");
        buton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("ceaw lume");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(buton);

        Scene scene = new Scene(root,300,200);

        stage.setTitle("hello world");
        stage.setScene(scene);
        stage.show();
 */
//#endregion

//#region exemplu 2
/*
deasupra executarii start:
    Label etic;
    TextField camp;

camp=new TextField();
        Button buton=new Button();

        buton.setText("citeste");


        buton.setOnAction
                (
                        actionEvent ->
                        {
                            etic.setText("Ati introdus: "+camp.getText());
                            camp.setText("");
                        }
                );

        SAU

        buton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
                etic.setText("ati introdus: "+camp.getText());
                camp.setText("");
                }
                });

                etic=new Label("Introduceti un sir in campul de editare");

                VBox root=new VBox(10,camp,buton,etic);

                root.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN,CornerRadii.EMPTY, Insets.EMPTY)));

                stage.setTitle("ex2");
                stage.setScene(new Scene(root,300,120));
                stage.show();
 }
 */
//#endregion

//#region exemplu 3     ecuatia grad 1
/*
TextField ca= new TextField();
    TextField cb= new TextField();
    Label rezultat=new Label("Rezultatul:");

    @Override
    public void start(Stage stage) throws IOException
    {
        //cerinte, primul coeficient si al doilea
        Label mesaj= new Label("Dati coef. ecuatiei ax+b=0");
        HBox randA=new HBox(10,new Label("a:"),ca);
        HBox randB=new HBox(10,new Label("b:"),cb);

        //butonul si rezultatul
        Button buton= new Button("Calculeaza");
        buton.setOnAction(this);
        HBox randRezultat=new HBox(10,buton,rezultat);
        VBox panou=new VBox(10,mesaj,randA,randB,randRezultat);
        Scene scene=new Scene(panou,320,240);
        stage.setScene(scene);
        stage.setTitle("ex3");
        stage.show();
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        try {
            double a = Double.parseDouble(ca.getText());
            double b = Double.parseDouble(cb.getText());
            if(a!=0) {
                rezultat.setText("x=" + (-b/a));
            } else {
                rezultat.setText("Ecuatie incompatibila");
            }
        } catch (NumberFormatException e){
            rezultat.setText("Nunar incorect");
        }
    }
 */
//endregion