package br.com.apivideos.Videos;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VideoRepository extends JpaRepository<Video, Long> {
    List<Video> findAllByAtivoTrue();
    Optional<Video> findByIdAndAtivoTrue(Long id);

}
