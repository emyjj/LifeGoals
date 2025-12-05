package controllers;

import controllers.models.Pessoa;
import repositories.PessoaRepository;

public class PessoaController {
    public static void cadastrar(Context ctx) {
    String nome = ctx.formParam("nome");
    String email = ctx.formParam("email");
    String senha = ctx.formParam("password");
    String dataNascimento = ctx.formParam("data_nascimento");

    Pessoa pessoa = new Pessoa(nome, email, senha, dataNascimento);

    PessoaRepository repo = new PessoaRepository();
    repo.salvar(pessoa);

    ctx.redirect("/Login.html");
}

}
