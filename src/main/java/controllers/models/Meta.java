package controllers.models;

public class Meta {
    public int id;
    public String titulo;
    public String descricao;
    public String status;

    public Meta(int id, String titulo, String descricao, String status) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
    }
}
