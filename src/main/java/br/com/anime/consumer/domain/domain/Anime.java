package br.com.anime.consumer.domain.domain;

import br.com.anime.consumer.domain.enums.genreType;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Anime implements Serializable {

    private Long id;
    private String name;
    private String author;
    private Integer yearPublication;
    private Integer episodesNumber;
    private genreType genre;
    private String synopsis;

}

