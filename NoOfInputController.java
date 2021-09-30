package com.capstone.stresstestui;

import com.jfoenix.controls.JFXButton;


import java.lang.Integer;

import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import com.capstone.stresstestui.InputController;

public class NoOfInputController {

    @FXML
    public static Integer count = 1;

    @FXML
    private Integer one;

    @FXML
    private Integer two;

    @FXML
    private Integer three;

    @FXML
    private Integer four;

    @FXML
    private Integer five;

    @FXML
    public static  Integer userNoOfInput;

    @FXML
    private JFXButton noOfInputNext;



    @FXML
    public JFXComboBox<Integer> noOfInputType;

    // To set he button visible when input selected
    @FXML
    void onNoOfInputChange(ActionEvent event) {
         noOfInputNext.setVisible(true);
    }



    // To load the input scene in the same window
    @FXML
    public void nextScene()throws Exception{

        Parent inputFxml;
        inputFxml = FXMLLoader.load(getClass().getResource("input.fxml"));
        var inputStage = (Stage) noOfInputNext.getScene().getWindow();
        inputStage.setScene(new Scene(inputFxml));
    }

    //To perform action when button clicked
    @FXML
    void onClickNoOfInputNext(ActionEvent event)throws Exception {

        // To load the input scene in the same window
        nextScene();


        // To get the no of input from user
        userNoOfInput = noOfInputType.getSelectionModel().getSelectedItem();
        System.out.println("No Of Inputs : "+userNoOfInput);
    }


}
