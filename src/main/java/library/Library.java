package library;

import library.principal.Principal;
import library.repository.IdiomaRepository;
import library.repository.LivroRepository;
import library.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Library implements CommandLineRunner {

	@Autowired
	private LivroRepository repositorioLivro;

	@Autowired
	private AutorRepository repositorioAutor;

	@Autowired
	private IdiomaRepository repositorioIdioma;


	public static void main(String[] args) {
		SpringApplication.run(Library.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorioLivro, repositorioAutor, repositorioIdioma);
		principal.exibeMenu();
	}
}
