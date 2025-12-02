import io.javalin.Javalin;
import controllers.models.MetaController;

public class App {
    public static void main(String[] args) {

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("/public");
        }).start(8080);

        app.get("/index", MetaController::carregarIndex);

        System.out.println("Servidor rodando em http://localhost:8080");
    }
}
