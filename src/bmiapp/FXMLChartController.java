/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmiapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class FXMLChartController implements Initializable {
    @FXML private VBox vCtrls;
    @FXML private StackPane pChart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void themHandler(ActionEvent evt) {
        TextField txt = new TextField();
        
        vCtrls.getChildren().add(txt);
    }
    
    public void veHandler(ActionEvent evt) {
        // Xử lý sự kiện vẽ biểu đồ
        PieChart chart = new PieChart();
        chart.setTitle("Biểu đồ dữ liệu");
        
        for (Node n: vCtrls.getChildren()) {
            TextField t = (TextField) n;
            chart.getData().add(new PieChart.Data(t.getText(), 
                    Integer.parseInt(t.getText())));
        }
        
        pChart.getChildren().add(chart);
    }
}
