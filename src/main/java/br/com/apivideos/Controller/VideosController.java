package br.com.apivideos.Controller;

import br.com.apivideos.Videos.DadosCadastroVideo;
import br.com.apivideos.Videos.DadosUpdateVideo;
import br.com.apivideos.Videos.Video;
import br.com.apivideos.Videos.VideoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/videos")
public class VideosController {

    @Autowired
    private VideoRepository videoRepository;

    @PostMapping
    @Transactional
    public void cadastrarVideo(@RequestBody @Valid DadosCadastroVideo dados){
        videoRepository.save(new Video(dados));
    }

    @GetMapping
    public List<Video> exibirTodosVideos(){
        return videoRepository.findAllByAtivoTrue();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Video> exibirVideoPorId(@PathVariable Long id) {
        Optional<Video> videoOptional = videoRepository.findByIdAndAtivoTrue(id);
        if (videoOptional.isPresent()) {
            return ResponseEntity.ok(videoOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping
    @Transactional
    public void atualizarDadosVideo(@RequestBody @Valid DadosUpdateVideo dados){
        Video video = videoRepository.getReferenceById(dados.id());
        video.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void desativarEativarVideo(@PathVariable Long id){
        Video video = videoRepository.getReferenceById(id);
        video.desativarEativarVideo();
    }
}
