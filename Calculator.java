package calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {

    public TextField firstNumberField;
    public TextField secondNumberField;
    public TextField Operation;
    public Label answerLabel;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("CALCULATOR");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(30);
        grid.setVgap(30);
        
        // First number field
        Label firstNumberLabel = new Label("First Number:");
        grid.add(firstNumberLabel, 0, 0);
        firstNumberField = new TextField();
        grid.add(firstNumberField, 1, 0);

        // Second number field
        Label secondNumberLabel = new Label("Second Number:");
        grid.add(secondNumberLabel, 0, 1);
        secondNumberField = new TextField();
        grid.add(secondNumberField, 1, 1);

        Label Operation = new Label("Operation");
        grid.add(Operation, 0, 2);
        // Sum button
        Button sumButton = new Button("Sum");
        grid.add(sumButton, 0, 3);
        /*the code below sets an event handler for the "sumButton" object. The "->" is ,a
        lambda expression, defining the behavior of the event handler when the "sumButton" is 
        clicked.The code after the lambda expression is the code block that gets executed
        when the button is clicked. The "e" parameter in the lambda expression is an event object that is passed to the function.*/
        sumButton.setOnAction(e -> {
            int firstNumber = Integer.parseInt(firstNumberField.getText());
            int secondNumber = Integer.parseInt(secondNumberField.getText());
            int Answer = firstNumber + secondNumber;
            answerLabel.setText("Answer: " + Answer);
        });
        
        // Subtraction button
        Button subtractionButton = new Button("Subtraction");
        grid.add(subtractionButton, 1, 3);
        subtractionButton.setOnAction(e -> {
            int firstNumber = Integer.parseInt(firstNumberField.getText());
            int secondNumber = Integer.parseInt(secondNumberField.getText());
            int Answer = firstNumber - secondNumber;
            answerLabel.setText("Answer: " + Answer);
        });

        // Division button
        Button divisionButton = new Button("Division");
        grid.add(divisionButton, 2, 3);
        divisionButton.setOnAction(e -> {
            int firstNumber = Integer.parseInt(firstNumberField.getText());
            int secondNumber = Integer.parseInt(secondNumberField.getText());
            int Answer = firstNumber / secondNumber;
            answerLabel.setText("Answer: " + Answer);
        });

        // Average button
        Button averageButton = new Button("Average");
        grid.add(averageButton, 3, 3);
        averageButton.setOnAction(e -> {
            int firstNumber = Integer.parseInt(firstNumberField.getText());
            int secondNumber = Integer.parseInt(secondNumberField.getText());
            int Answer = (firstNumber + secondNumber) / 2;
            answerLabel.setText("Answer: " + Answer);
        });

        // Answer label
        answerLabel = new Label("Answer:");
        grid.add(answerLabel, 0, 4, 2, 1);

        Scene scene = new Scene(grid, 500, 450);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}