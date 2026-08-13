module pe.edu.upeu.repaso03 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens pe.edu.upeu.repaso03 to javafx.fxml;
    exports pe.edu.upeu.repaso03;
}