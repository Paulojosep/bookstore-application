package com.paulo.bookstore;

import com.paulo.bookstore.domain.Categoria;
import com.paulo.bookstore.domain.Livro;
import com.paulo.bookstore.repositories.CategoriaRepository;
import com.paulo.bookstore.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
}
