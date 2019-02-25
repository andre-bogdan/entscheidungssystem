package entscheidungssystem.Controller;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class Controller {
    @FXML
    Pane fxPaneRoot, fxPane_1, fxPane_2, fxPane_3;

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
        fxPaneRoot.getChildren().clear();
        fxPaneRoot.getChildren().add(fxPane_2);
    }

    //Button zurueck auf GridPane_2
    public  void zurueck_21(){
        fxPaneRoot.getChildren().clear();
        fxPaneRoot.getChildren().add(fxPane_1);
    }

    //Button weiter auf GridPane_2
    public void weiter_23(){
        fxPaneRoot.getChildren().clear();
        fxPaneRoot.getChildren().add(fxPane_3);
    }

    public void zurueck_2_to_1(){

    }
}
