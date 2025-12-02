package controllers;

import io.javalin.http.Context;
import repositories.MetaRepository;

import java.util.*;

public class MetaController {

    static MetaRepository metaRepo = new MetaRepository();

    public static void carregarIndex(Context ctx) {

        Integer pessoaId = ctx.sessionAttribute("usuarioId");

        if (pessoaId == null) {
            ctx.redirect("/login");
            return;
        }

        ctx.render("Index.html", Map.of(
                "metas", metaRepo.listarMetasPorPessoa(pessoaId)
        ));
    }
}
