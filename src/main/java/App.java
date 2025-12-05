import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("public");
        }).start(8080);

        app.get("/metas", ctx -> {
            ctx.json(MetaDAO.listar());
        });
    }
}
