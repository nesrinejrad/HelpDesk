package tn.MedicaSud.app.client.gui;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class Controller implements  Initializable {

    // Get the pane to put the calendar on
    @FXML Pane calendarPane;
        private ArrayList<AnchorPaneNode> allCalendarDays = new ArrayList<>(35);
        private LocalDate calendarDate;

        @Override
    public void initialize(URL url, ResourceBundle rb) {
         for (AnchorPaneNode ap : allCalendarDays) {
            if (ap.getChildren().size() != 0) {
                ap.getChildren().remove(0);
            }
            Text txt = new Text(String.valueOf(calendarDate.getDayOfMonth()));
            ap.setDate(calendarDate);
            String date2="2018-06-01";
            LocalDate ldate2= LocalDate.parse(date2);
            if(calendarDate==ldate2)
            {
                 System.out.println("hiii");
            }
            ap.setTopAnchor(txt, 5.0);
            ap.setLeftAnchor(txt, 5.0);
            ap.getChildren().add(txt);
            calendarDate = calendarDate.plusDays(1);
        }
    } 
}
