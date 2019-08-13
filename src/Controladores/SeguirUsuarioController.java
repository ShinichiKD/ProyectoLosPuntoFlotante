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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import twitter4j.TwitterException;

/**
 * FXML Controller class
 *
 * @author Rodrigo
 */
public class SeguirUsuarioController implements Initializable {

    BotTwitter Bot; 
    @FXML
    private TextField SeguirTF;
    @FXML
    private Button SeguirBoton;
    @FXML
    private StackPane Escena;
    @FXML
    private AnchorPane AnchoPane;
    @FXML
    private Button BotonCerrar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void SeguirPresionar(ActionEvent event) throws TwitterException {
       Bot.seguirUsuario(SeguirTF.getText());
       SeguirTF.clear();
       SeguirTF.setPromptText("Ingresar ID: @Fulanito");
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
    
}
