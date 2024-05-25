package br.com.apivideos.Videos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

public record DadosCadastroVideo(@NotBlank @NotEmpty String titulo,
                                 @NotBlank @NotEmpty String descricao,
                                 @NotBlank @NotEmpty @URL String url) {

    @Override
    public String toString() {
        return "Vídeo sendo Cadastrado... \nTitulo: " +titulo+ "\nDescricao: " +descricao+ "\nURL: " +url;
    }
}
