package Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author Rodrigo
 */
public class MensajeDirectoController implements Initializable {

    @FXML
    private StackPane Escena;
    @FXML
    private AnchorPane AnchoPane;
    @FXML
    private TextField PersonaBuscada;
    @FXML
    private Label Text1;
    @FXML
    private Button BotonCerrar;
    @FXML
    private TextField TextoMensaje;
    @FXML
    private Button BotonEnviar;
    @FXML
    private Label Text2;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    /**
     * Cierra la ventana actual y vuelve al Inicio
     * @param event
     * @throws IOException 
     */
    @FXML
    private void CerrarVentana(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Vistas/MenuInicio.fxml"));
        Scene scene = BotonCerrar.getScene();
        root.translateYProperty().set(scene.getHeight());

        Escena.getChildren().add(root);
        
        Escena.getChildren().remove(AnchoPane);
        Escena.setVisible(false);
    }

    @FXML
    private void EnviarMensaje(ActionEvent event) {
        
    }
    
}
