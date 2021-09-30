package com.capstone.stresstestui;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;
import javafx.beans.binding.Binding;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import com.capstone.stresstestui.*;
import javafx.stage.Stage;

public class InputController<JFXRadioButton> extends NoOfInputController{

    @FXML
    private ToggleGroup inputType;

    @FXML
    private JFXRadioButton character;

    @FXML
    private JFXRadioButton string;

    @FXML
    private JFXRadioButton array;

    // Inputs for integer
    @FXML
    private JFXRadioButton integer;

    @FXML
    private Label intRange;

    @FXML
    private TextField intLower;

    @FXML
    private TextField intUpper;

    // Inputs for Character
    @FXML
    private Label charTypeLabel;

    @FXML
    private JFXComboBox<String> charType;

    @FXML
    private String charAlpha;

    @FXML
    private String charNum;

    @FXML
    private String charSpecChar;

    @FXML
    private String charPara;

    @FXML
    private String charBracket;

    @FXML
    private Pane charAlphaPlane;

    @FXML
    private Label charAlphaLabel;

    @FXML
    private JFXRadioButton charAlphaUpper;

    @FXML
    private ToggleGroup charAlphaType;

    @FXML
    private JFXRadioButton charAlphaLower;

    @FXML
    private JFXRadioButton charAlphaMixed;

    @FXML
    void onCharTypeChange(ActionEvent event) {

        // check if Alphabet is selected
        if(charAlpha == charType.getSelectionModel().getSelectedItem()){
            charAlphaPlane.setVisible(true);
        }
        else{
            charAlphaPlane.setVisible(false);
        }
    }

    // Inputs for String
    @FXML
    private JFXRadioButton stringWord;

    @FXML
    private ToggleGroup stringType;

    @FXML
    private JFXComboBox <String> stringWordType;

    @FXML
    private Pane stringWordPlane;


    @FXML
    private String stringWordAlpha;

    @FXML
    private String stringWordNum;

    @FXML
    private String stringWordSpecChar;

    @FXML
    private String stringWordPara;

    @FXML
    private String stringWordBracket;

    @FXML
    private Pane stringWordAlphaPane;

    @FXML
    private JFXRadioButton StringWordAlphaUpper;

    @FXML
    private ToggleGroup stringWordAlphaType;

    @FXML
    private JFXRadioButton stringWordAlphaLower;

    @FXML
    private JFXRadioButton stringWordAlphaUpper;

    @FXML
    private JFXRadioButton stringWordAlphaAsc;

    @FXML
    private ToggleGroup stringWordAlphaOrder;

    @FXML
    private JFXRadioButton stringWordAlphaDesc;

    @FXML
    private JFXRadioButton stringWordAlphaNone;

    @FXML
    private JFXRadioButton stringWordAlphaMixed;

    @FXML
    private TextField stringWordNumLower;

    @FXML
    private TextField stringWordNumUpper;

    @FXML
    private Pane stringWordNumPlane;

    // To perform action when string word type changes
    @FXML
    void onStringWordTypeChange(ActionEvent event) {

        // to show alphabet input details in string word
        if(stringWordAlpha == stringWordType.getSelectionModel().getSelectedItem()){
            stringWordAlphaPane.setVisible(true);
        }
        else{
            stringWordAlphaPane.setVisible(false);
        }

        // to show number input details in string word
        if(stringWordNum == stringWordType.getSelectionModel().getSelectedItem()){
            stringWordNumPlane.setVisible(true);
        }
        else{
            stringWordNumPlane.setVisible(false);
        }
    }

    @FXML
    private Pane stringPhrasePlane;

    @FXML
    private JFXRadioButton stringPhraseAlpha;

    @FXML
    private ToggleGroup stringPhraseType;

    @FXML
    private JFXRadioButton stringPhraseNum;

    @FXML
    private Pane stringPhraseAlphaPlane;

    @FXML
    private JFXComboBox<String> stringPhraseAlphaType;

    @FXML
    private String stringPhraseAlphaUpper;

    @FXML
    private String stringPhraseAlphaLower;

    @FXML
    private String stringPhraseAlphaMixed;

    @FXML
    private TextField stringPhraseNumLower;

    @FXML
    private TextField stringPhraseNumUpper;

    @FXML
    private Pane stringPhraseNumPlane;

    // To perform action when string Phrase type changes
    @FXML
    void onStringPhraseTypeChange(ActionEvent event) {

        // To show the input details of string phrase alphabet
        if(stringPhraseAlpha == (JFXRadioButton) stringPhraseType.getSelectedToggle()){
            stringPhraseAlphaPlane.setVisible(true);
        }
        else{
            stringPhraseAlphaPlane.setVisible(false);
        }

        // To show the input details of string phrase Number
        if(stringPhraseNum == (JFXRadioButton) stringPhraseType.getSelectedToggle()){
            stringPhraseNumPlane.setVisible(true);
        }
        else{
            stringPhraseNumPlane.setVisible(false);
        }
    }

    @FXML
    private JFXRadioButton stringPhrase;

    @FXML
    private Pane stringPlane;

    // To perform action when string type changes
    @FXML
    void onStringTypeChange(ActionEvent event) {

        // to Show word input details in string
          if(stringWord == (JFXRadioButton)stringType.getSelectedToggle()){
              stringWordPlane.setVisible(true);
          }
          else{
              stringWordPlane.setVisible(false);
          }
        // to Show word input details in string
          if(stringPhrase == (JFXRadioButton)stringType.getSelectedToggle()){
              stringPhrasePlane.setVisible(true);
          }
          else{
              stringPhrasePlane.setVisible(false);
          }
    }

    // For Array Inputs
    @FXML
    private Pane arrayPlane;

    @FXML
    private JFXComboBox<String> arrayType;

    @FXML
    private String intArray;

    @FXML
    private String stringArray;

    @FXML
    private String twoDArray;

    @FXML
    private Pane intArrayPlane;

    @FXML
    // To perform action on array type change
    void onArrayTypeChange(ActionEvent event) {

        // for integer array
        if(intArray == arrayType.getSelectionModel().getSelectedItem()){
            intArrayPlane.setVisible(true);
        }
        else{
            intArrayPlane.setVisible(false);
        }

        // for String array
        if(stringArray == arrayType.getSelectionModel().getSelectedItem()){
            stringArrayPane.setVisible(true);
        }
        else{
            stringArrayPane.setVisible(false);
        }

        // for 2D  array
        if(twoDArray == arrayType.getSelectionModel().getSelectedItem()){
            twoDArrayPlane.setVisible(true);
        }
        else{
            twoDArrayPlane.setVisible(false);
        }
    }

    // Integer array 2D Array
    @FXML
    private Pane twoDArrayPlane;

    @FXML
    private JFXRadioButton twoDArraySqr;

    @FXML
    private ToggleGroup twoDArrayType;

    @FXML
    private JFXRadioButton twoDArrayRec;

    @FXML
    private TextField twoDArrayLower;

    @FXML
    private TextField twoDArrayUpper;

    // Integer array inputs
    @FXML
    private JFXCheckBox intArraySort;

    @FXML
    private Pane intArraySortPlane;

    @FXML
    private JFXRadioButton intArrayAsc;

    @FXML
    private ToggleGroup intArraySortType;

    @FXML
    private JFXRadioButton intArrayDesc;

    @FXML
    private TextField intArrayLower;

    @FXML
    private TextField intArrayUpper;

    // To perform action when sorted checkbox is changed
    @FXML
    void onClickIntArraySort(ActionEvent event) {
        if(intArraySort.isSelected()){
            intArraySortPlane.setVisible(true);
        }
        else{
            intArraySortPlane.setVisible(false);
        }
    }

   // String Array Input
    @FXML
    private Pane stringArrayPane;

    @FXML
    private JFXRadioButton stringArrayAlpha;

    @FXML
    private ToggleGroup stringArrayType;

    @FXML
    private JFXRadioButton stringArrayNum;

    @FXML
    private Pane stringArrayAlphaPlane;

    @FXML
    private JFXRadioButton stringArrayAlphaLower;

    @FXML
    private ToggleGroup stringArrayAlphaType;

    @FXML
    private JFXRadioButton stringArrayAlphaUpper;

    @FXML
    private JFXRadioButton stringArrayAlphaMixed;

    @FXML
    private TextField stringArrayNumLower;

    @FXML
    private TextField stringArrayNumUpper;

    @FXML
    private Pane stringArrayNumPlane;

    // To perform action when String Array Type changed
    @FXML
    void onStringArrayTypeChange(ActionEvent event) {

        // for String Alphabet type
       if(stringArrayAlpha == (JFXRadioButton) stringArrayType.getSelectedToggle()){
           stringArrayAlphaPlane.setVisible(true);
       }
       else{
           stringArrayAlphaPlane.setVisible(false);
       }

        // for String Number type
        if(stringArrayNum == (JFXRadioButton) stringArrayType.getSelectedToggle()){
            stringArrayNumPlane.setVisible(true);
        }
        else{
            stringArrayNumPlane.setVisible(false);
        }
    }

    // Input type toggle
    @FXML
    void onToggleInput(ActionEvent event) {

        // To show the integer input details
        if(integer == (JFXRadioButton) inputType.getSelectedToggle()){
            intRange.setVisible(true);
            intUpper.setVisible(true);
            intLower.setVisible(true);
        }
        else{
            intRange.setVisible(false);
            intUpper.setVisible(false);
            intLower.setVisible(false);
        }

        // To show the character input details
        if(character == (JFXRadioButton) inputType.getSelectedToggle()){
            charTypeLabel.setVisible(true);
            charType.setVisible(true);
            if(charAlpha == charType.getSelectionModel().getSelectedItem()){
                charAlphaPlane.setVisible(true);
            }
        }
        else{
            charTypeLabel.setVisible(false);
            charType.setVisible(false);
            charAlphaPlane.setVisible(false);
        }

        // To show the string input details
        if(string == (JFXRadioButton) inputType.getSelectedToggle()){
            stringPlane.setVisible(true);
        }
        else{
            stringPlane.setVisible(false);
        }

        // To show the Array input details
        if(array == (JFXRadioButton) inputType.getSelectedToggle()){
            arrayPlane.setVisible(true);
        }
        else{
            arrayPlane.setVisible(false);
        }
    }

    @FXML
    public JFXButton inputNext;

    @FXML
    public  Label inputPageLabel;

    @FXML
    public String label;

    // To load the input scene in the same window
    @FXML
    public void inputReScene()throws Exception{

        Parent inputReFxml = FXMLLoader.load(getClass().getResource("input.fxml"));
        Stage inputReStage = (Stage)inputNext.getScene().getWindow();
        inputReStage.setScene(new Scene(inputReFxml));
    }

    //To load the No of test case scene
    @FXML
    public void noOfTestScene()throws Exception{

        Parent noOfTestFxml = FXMLLoader.load(getClass().getResource("noOfTest.fxml"));
        Stage noOfTestStage = (Stage)inputNext.getScene().getWindow();
        noOfTestStage.setScene(new Scene(noOfTestFxml));
    }

    @FXML
    void onClickInputNext(ActionEvent event) throws Exception {

        // To get the input details from user
        System.out.println("Details for input "+count+" :");
        System.out.println();

        // To get the integer input details from user
        if(integer == (JFXRadioButton)inputType.getSelectedToggle()){
            System.out.println("Input Type : Integer");
            System.out.println("Integer Lower Limit : "+Integer.parseInt(intLower.getText()));
            System.out.println("Integer Upper Limit : "+Integer.parseInt(intUpper.getText()));
        }

        // To get the character input details from user
        else if(character == (JFXRadioButton)inputType.getSelectedToggle()){
            System.out.println("Input Type : Character");
            if(charAlpha==charType.getSelectionModel().getSelectedItem()){
                System.out.println("Character Type : Alphabet");
                if(charAlphaUpper == (JFXRadioButton)charAlphaType.getSelectedToggle()){
                    System.out.println("Alphabet Type : Upper Case");
                }
                if(charAlphaLower == (JFXRadioButton)charAlphaType.getSelectedToggle()){
                    System.out.println("Alphabet Type : Lower Case");
                }
                if(charAlphaMixed == (JFXRadioButton)charAlphaType.getSelectedToggle()){
                    System.out.println("Alphabet Type : Mixed");
                }
            }
            else if(charNum==charType.getSelectionModel().getSelectedItem()){
                System.out.println("Character Type : Number");
            }
            else if(charSpecChar==charType.getSelectionModel().getSelectedItem()){
                System.out.println("Character Type : Special Character");
            }
            else if(charPara==charType.getSelectionModel().getSelectedItem()){
                System.out.println("Character Type : Parenthesis");
            }
            else if(charBracket==charType.getSelectionModel().getSelectedItem()){
                System.out.println("Character Type : Bracket");
            }

        }

        // To get the string input details from user
        else if(string == (JFXRadioButton)inputType.getSelectedToggle()){
            System.out.println("Input Type : String");
            if(stringWord == (JFXRadioButton)stringType.getSelectedToggle()){
                System.out.println("String Type : Word");
                if(stringWordAlpha == stringWordType.getSelectionModel().getSelectedItem()){
                    System.out.println("Word Type : Alphabet");

                    if(stringWordAlphaLower == (JFXRadioButton)stringWordAlphaType.getSelectedToggle()){
                        System.out.println("Alphabet Type: Lower Case");
                    }
                    else if(stringWordAlphaUpper == (JFXRadioButton)stringWordAlphaType.getSelectedToggle()){
                        System.out.println("Alphabet Type: Upper Case");
                    }
                    else if(stringWordAlphaMixed == (JFXRadioButton)stringWordAlphaType.getSelectedToggle()){
                        System.out.println("Alphabet Type: Mixed");
                    }

                    if(stringWordAlphaAsc == (JFXRadioButton)stringWordAlphaOrder.getSelectedToggle()){
                        System.out.println("Order Type: Ascending");
                    }
                    else if(stringWordAlphaDesc == (JFXRadioButton)stringWordAlphaOrder.getSelectedToggle()){
                        System.out.println("Order Type: Descending");
                    }
                    else if(stringWordAlphaNone == (JFXRadioButton)stringWordAlphaOrder.getSelectedToggle()){
                        System.out.println("Order Type: None");
                    }

                }
                else if(stringWordNum == stringWordType.getSelectionModel().getSelectedItem()){
                    System.out.println("Word Type : Number");
                    System.out.println("Number Lower Limit : "+Integer.parseInt(stringWordNumLower.getText()));
                    System.out.println("Number Upper Limit : "+Integer.parseInt(stringWordNumUpper.getText()));
                }
                else if(stringWordSpecChar == stringWordType.getSelectionModel().getSelectedItem()){
                    System.out.println("Word Type : Special Character");
                }
                else if(stringWordPara == stringWordType.getSelectionModel().getSelectedItem()){
                    System.out.println("Word Type : Parenthesis");
                }
                else if(stringWordBracket == stringWordType.getSelectionModel().getSelectedItem()){
                    System.out.println("Word Type : Bracket");
                }
            }
            else if(stringPhrase == (JFXRadioButton)stringType.getSelectedToggle()){
                System.out.println("String Type : Phrase");
                if(stringPhraseAlpha == (JFXRadioButton)stringPhraseType.getSelectedToggle()){
                    System.out.println("Phrase Type : Alphabet");
                    if(stringPhraseAlphaLower == stringPhraseAlphaType.getSelectionModel().getSelectedItem()){
                        System.out.println("Alphabet Type : Lower Case");
                    }
                    else if(stringPhraseAlphaUpper == stringPhraseAlphaType.getSelectionModel().getSelectedItem()){
                        System.out.println("Alphabet Type : Upper Case");
                    }
                    else if(stringPhraseAlphaMixed == stringPhraseAlphaType.getSelectionModel().getSelectedItem()){
                        System.out.println("Alphabet Type : Mixed Case");
                    }
                }
                else if(stringPhraseNum == (JFXRadioButton)stringPhraseType.getSelectedToggle()){
                    System.out.println("Phrase Type : Number");
                    System.out.println("Number Lower Limit : "+Integer.parseInt(stringPhraseNumLower.getText()));
                    System.out.println("Number Upper Limit : "+Integer.parseInt(stringPhraseNumUpper.getText()));
                }
            }
        }

        // To get the array input details from user
        else if(array == (JFXRadioButton)inputType.getSelectedToggle()){
            System.out.println("Input Type : Array");
            if(intArray == arrayType.getSelectionModel().getSelectedItem()){
                System.out.println("Array Type : Integer");
                System.out.println("Integer Lower Limit : "+Integer.parseInt(intArrayLower.getText()));
                System.out.println("Integer Upper Limit : "+Integer.parseInt(intArrayUpper.getText()));
                if(intArraySort.isSelected()){
                    if(intArrayAsc == (JFXRadioButton)intArraySortType.getSelectedToggle()){
                        System.out.println("Order Type : Ascending");
                    }
                    else if(intArrayDesc == (JFXRadioButton)intArraySortType.getSelectedToggle()){
                        System.out.println("Order Type : Descending");
                    }
                }
                else{
                    System.out.println("Order Type : Unsorted");
                }
            }
            else if(stringArray == arrayType.getSelectionModel().getSelectedItem()){
                System.out.println("Array Type : String");
                if(stringArrayAlpha == (JFXRadioButton) stringArrayType.getSelectedToggle()){
                    System.out.println("String Type : Alphabet");
                    if(stringArrayAlphaLower == (JFXRadioButton) stringArrayAlphaType.getSelectedToggle()){
                        System.out.println("Alphabet Type : Lower Case");
                    }
                    else if(stringArrayAlphaUpper == (JFXRadioButton) stringArrayAlphaType.getSelectedToggle()){
                        System.out.println("Alphabet Type : Upper Case");
                    }
                    else if(stringArrayAlphaMixed == (JFXRadioButton) stringArrayAlphaType.getSelectedToggle()){
                        System.out.println("Alphabet Type : Mixed");
                    }
                }
                else if(stringArrayNum == (JFXRadioButton) stringArrayType.getSelectedToggle()){
                    System.out.println("String Type : Number");
                    System.out.println("Number Lower Limit : "+Integer.parseInt(stringArrayNumLower.getText()));
                    System.out.println("Number Upper Limit : "+Integer.parseInt(stringArrayNumUpper.getText()));
                }
            }
            else if(twoDArray == arrayType.getSelectionModel().getSelectedItem()){
                System.out.println("Array Type : Matrix");
                if(twoDArraySqr == (JFXRadioButton)twoDArrayType.getSelectedToggle()){
                    System.out.println("Matrix Type : Square");
                }
                else if(twoDArrayRec == (JFXRadioButton)twoDArrayType.getSelectedToggle()){
                    System.out.println("Matrix Type : Rectangle");
                }
                System.out.println("Values Lower Limit : "+Integer.parseInt(twoDArrayLower.getText()));
                System.out.println("Values Upper Limit : "+Integer.parseInt(twoDArrayUpper.getText()));
            }
        }
        System.out.println();

        // To load the same scene or no of test case scene based on user no of input
        if(count < userNoOfInput){
            count++;
            label = "SELECT INPUT TYPE "+count+" :";
            inputReScene();
            inputPageLabel.setText(label);
        }
        else{
            noOfTestScene();
        }

    }

}