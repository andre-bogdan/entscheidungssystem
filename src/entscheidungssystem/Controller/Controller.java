package entscheidungssystem.Controller;

import entscheidungssystem.Model.Alternativen;
import entscheidungssystem.Model.Kriterien;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
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

    @FXML
    Label
            fxPane_3_l_1, fxPane_3_l_2, fxPane_3_l_3, fxPane_3_l_4, fxPane_3_l_5;

    //zur einfacheren Verarbeitung TextFelder in ArrayList speichern
    ArrayList<TextField> tf_pane_1 = new ArrayList();
    ArrayList<TextField> tf_pane_2 = new ArrayList();
    ArrayList<Label> l_pane_3 = new ArrayList();

    //ArrayList fuer die Alternativen
    ArrayList<Alternativen> alternativen = new ArrayList<>();
    //ArrayList fuer die Kriterien
    ArrayList<Kriterien> kriterien = new ArrayList<>();

    //Initialisierung der Oberflaeche
    public void initialize() {
        fxPaneRoot.getChildren().clear();
        fxPaneRoot.getChildren().add(fxPane_1);
    }

    //MenueItem beenden
    public void progBeenden() {
        System.exit(0);
    }

    //Button weiter auf GridPane_1
    public void weiter_12() {
        //Alternativen aus Pane_1 auslesen und in ArrayList schreiben
        //ArrayList fuer die TextFelder
        tf_pane_1.add(fxPane_1_tf_1);
        tf_pane_1.add(fxPane_1_tf_2);
        tf_pane_1.add(fxPane_1_tf_3);
        tf_pane_1.add(fxPane_1_tf_4);
        tf_pane_1.add(fxPane_1_tf_5);

        //Inhalte aus TextFeldern in ArrayListe schreiben
        for(TextField element : tf_pane_1)
            if (!(element.getText().equals(""))) {
                Alternativen alt = new Alternativen(element.getText());
                alternativen.add(alt);
            }

        fxPaneRoot.getChildren().clear();
        fxPaneRoot.getChildren().add(fxPane_2);
    }

    //Button zurueck auf GridPane_2
    public void zurueck_21() {
        //Inhalte zuruecksetzen
        tf_pane_1.clear();
        alternativen.clear();
        fxPaneRoot.getChildren().clear();
        fxPaneRoot.getChildren().add(fxPane_1);
    }

    //Button weiter auf GridPane_2
    public void weiter_23() {
        tf_pane_2.clear();
        kriterien.clear();
        //Kriterien aus Pane_2 auslesen und in ArrayList schreiben
        //ArrayList fuer die TextFelder
        tf_pane_2.add(fxPane_2_tf_1);
        tf_pane_2.add(fxPane_2_tf_2);
        tf_pane_2.add(fxPane_2_tf_3);
        tf_pane_2.add(fxPane_2_tf_4);
        tf_pane_2.add(fxPane_2_tf_5);

        //Inhalte aus TextFeldern in ArrayListe schreiben
        for(TextField element : tf_pane_2)
            if (!(element.getText().equals(""))) {
                Kriterien krit = new Kriterien(element.getText());
                kriterien.add(krit);
            }

        fxPaneRoot.getChildren().clear();
        fxPaneRoot.getChildren().add(fxPane_3);

        /*fxPane_3_l_1.setText("test");*/

        //ArrayList fuer die TextFelder
        l_pane_3.add(fxPane_3_l_1);
        l_pane_3.add(fxPane_3_l_2);
        l_pane_3.add(fxPane_3_l_3);
        l_pane_3.add(fxPane_3_l_4);
        l_pane_3.add(fxPane_3_l_5);

        for (int i = 0; i < kriterien.size(); i++) {
            l_pane_3.get(i).setText(kriterien.get(i).getKriterium());
        }
    }

    //Button zurueck auf GridPane_3
    public void zurueck_32() {
        //Inhalte zuruecksetzen
        tf_pane_2.clear();
        kriterien.clear();
        fxPaneRoot.getChildren().clear();
        fxPaneRoot.getChildren().add(fxPane_2);
    }

    //Button weiter auf GridPane_3
    public void weiter_34() {

        //ArrayList fuer die TextFelder
        l_pane_3.add(fxPane_3_l_1);
        l_pane_3.add(fxPane_3_l_2);
        l_pane_3.add(fxPane_3_l_3);
        l_pane_3.add(fxPane_3_l_4);
        l_pane_3.add(fxPane_3_l_5);

        fxPaneRoot.getChildren().clear();
        fxPaneRoot.getChildren().add(fxPane_4);
    }

    //Button zurueck auf GridPane_4
    public void zurueck_43() {
        fxPaneRoot.getChildren().clear();
        fxPaneRoot.getChildren().add(fxPane_3);
    }

    //Button hoch 01
    public void change_01(){
        if (kriterien.size() >= 2) {
            Kriterien element_0 = kriterien.get(0);
            Kriterien element_1 = kriterien.get(1);
            kriterien.set(0, element_1);
            kriterien.set(1, element_0);
            update_3();
        }
    }
    //Button hoch 12
    public void change_12(){
        if (kriterien.size() >= 3) {
            Kriterien element_1 = kriterien.get(1);
            Kriterien element_2 = kriterien.get(2);
            kriterien.set(1, element_2);
            kriterien.set(2, element_1);
            update_3();
        }
    }
    //Button hoch 23
    public void change_23(){
        if (kriterien.size() >= 4) {
            Kriterien element_2 = kriterien.get(2);
            Kriterien element_3 = kriterien.get(3);
            kriterien.set(2, element_3);
            kriterien.set(3, element_2);
            update_3();
        }
    }
    //Button hoch 34
    public void change_34(){
        if (kriterien.size() >= 5) {
            Kriterien element_3 = kriterien.get(3);
            Kriterien element_4 = kriterien.get(4);
            kriterien.set(3, element_4);
            kriterien.set(4, element_3);
            update_3();
        }
    }

    //Pane 3 anzeigen (nach sortierung)
    public void update_3(){
        fxPaneRoot.getChildren().clear();
        fxPaneRoot.getChildren().add(fxPane_3);
        for (int i = 0; i < kriterien.size(); i++) {
            l_pane_3.get(i).setText(kriterien.get(i).getKriterium());
        }
    }
}
