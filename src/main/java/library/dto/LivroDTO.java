package library.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import library.model.Autor;
import library.model.Idioma;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)

public record  LivroDTO (
    @JsonAlias("title")
    String nome,

    @JsonAlias({"download_count", "readinglog_count"})
    int downloads,

    @JsonAlias("author_name")
    List<Autor> autorNome,

    @JsonAlias({"authors"})
    List<AutorDTO> autor,

    @JsonAlias({"languages", "language"})
    List<Idioma> idiomas
) { }