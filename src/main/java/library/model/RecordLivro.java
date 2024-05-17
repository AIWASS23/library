package library.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import library.dto.LivroDTO;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public record RecordLivro(
        @JsonAlias({"results", "docs"}) List<LivroDTO> results
) { }