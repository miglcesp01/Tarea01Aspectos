package Application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root,240,240);
		Button rojo = new Button("Rojo");
		Button azul = new Button("Azul");
		Button verde = new Button("Verde"); 
		HBox bot = new HBox();
		bot.getChildren().addAll(azul, rojo,verde);
		bot.setAlignment(Pos.CENTER);
		bot.setPadding(new Insets(10, 10, 10,10));
		root.setBottom(bot);
		
		rojo.setOnAction(e->{
			PintarRojo(root);
		});
		azul.setOnAction(e->{
			PintarAzul(root);
		});
		//#008f39
		verde.setOnAction(e->{
			PintarVerde(root);
		});
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hello World");
		primaryStage.show();
		}
		public static void main(String[] args){
			
			Application.launch(args);
		}
		public static void PintarRojo(BorderPane root) {
			root.setStyle("-fx-background-color: #ff0000;");
		}
		public static void PintarVerde(BorderPane root) {
			root.setStyle("-fx-background-color: #008f39;");
		}
		public static void PintarAzul(BorderPane root) {
			root.setStyle("-fx-background-color: #3b83bd;");
		}
		


}
