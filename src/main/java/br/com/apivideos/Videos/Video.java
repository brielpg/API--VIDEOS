package br.com.apivideos.Videos;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "VIDEOS")
@Entity(name = "Video")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Video {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private Boolean ativo;
    private String url;

    public Video(DadosCadastroVideo dados){
        this.titulo = dados.titulo();
        this.descricao = dados.descricao();
        this.url = dados.url();
        this.ativo = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUrl() {
        return url;
    }

    public void atualizarInformacoes(DadosUpdateVideo dados) {
        if (dados.titulo() != null){
            this.titulo = dados.titulo();
        }

        if (dados.descricao() != null) {
            this.descricao = dados.descricao();
        }
    }

    public void desativarEativarVideo(){
        this.ativo = !this.ativo;
    }
}
