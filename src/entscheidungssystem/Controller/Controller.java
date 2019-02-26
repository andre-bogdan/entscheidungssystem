package entscheidungssystem.Controller;

import entscheidungssystem.Model.Alternativen;
import entscheidungssystem.Model.Kriterien;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class Controller {
    @FXML
    Pane
            fxPaneRoot, fxPane_1, fxPane_2, fxPane_3, fxPane_4;

    @FXML
    TextField
            fxPane_1_tf_1, fxPane_1_tf_2, fxPane_1_tf_3, fxPane_1_tf_4, fxPane_1_tf_5,
            fxPane_2_tf_1, fxPane_2_tf_2, fxPane_2_tf_3, fxPane_2_tf_4, fxPane_2_tf_5;

    //ArrayList fuer die Kriterien
    ArrayList<Kriterien> kriterien = new ArrayList<>();
    //ArrayList fuer die Alternativen
    ArrayList<Alternativen> alternativen = new ArrayList<>();

    //Initialisierung der Oberflaeche
    public void initialize(){
        fxPaneRoot.getChildren().clear();
        fxPaneRoot.getChildren().add(fxPane_1);
    }

    //MenueItem beenden
    public void progBeenden(){
        System.exit(0);
    }

    //Button weiter auf GridPane_1
    public void weiter_12(){
        //Kriterien aus Pane_1 auslesen und in ArrayList schreiben
        if (!(fxPane_1_tf_1.getText().equals(""))) {
            Alternativen alt1 = new Alternativen(fxPane_1_tf_1.getText());
            alternativen.add(alt1);
        }
        if (!(fxPane_1_tf_2.getText().equals(""))) {
            Alternativen alt2 = new Alternativen(fxPane_1_tf_2.getText());
            alternativen.add(alt2);
        }
        //test
        System.out.println(alternativen.size());

        fxPaneRoot.getChildren().clear();
        fxPaneRoot.getChildren().add(fxPane_2);
    }

    //Button zurueck auf GridPane_2
    public  void zurueck_21(){
        fxPaneRoot.getChildren().clear();
        fxPaneRoot.getChildren().add(fxPane_1);
    }

    //Button weiter auf GridPane_3
    public void weiter_23(){
        fxPaneRoot.getChildren().clear();
        fxPaneRoot.getChildren().add(fxPane_3);
    }

    //Button zurueck auf GridPane_3
    public  void zurueck_32(){
        fxPaneRoot.getChildren().clear();
        fxPaneRoot.getChildren().add(fxPane_2);
    }

    //Button weiter auf GridPane_4
    public void weiter_34(){
        fxPaneRoot.getChildren().clear();
        fxPaneRoot.getChildren().add(fxPane_4);
    }

    //Button zurueck auf GridPane_4
    public  void zurueck_43(){
        fxPaneRoot.getChildren().clear();
        fxPaneRoot.getChildren().add(fxPane_3);
    }
}
