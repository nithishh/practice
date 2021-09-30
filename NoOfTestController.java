package com.capstone.stresstestui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NoOfTestController {
    @FXML
    private JFXTextArea noOfTestCase;

    @FXML
    private JFXCheckBox deepRun;

    @FXML
    private JFXButton noOfTestNext;

    // To load the file input scene
    @FXML
    void fileInputScene() throws IOException {
        Parent fileInputFxml = FXMLLoader.load(getClass().getResource("fileInput.fxml"));
        Stage fileInputStage = (Stage) noOfTestNext.getScene().getWindow();
        fileInputStage.setScene(new Scene(fileInputFxml));
    }

    // To perform action when no of text case scene next button is clicked
    @FXML
    void onClickNoOfTestNext(ActionEvent event) throws IOException {
         System.out.println("NO of test cases:"+Integer.parseInt(noOfTestCase.getText()));
         if(deepRun.isSelected()){
             System.out.println("Deep Run is Selected");
         }
         fileInputScene();
    }

}
