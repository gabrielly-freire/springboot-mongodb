package com.studies.springbootmongodb.config;

import com.studies.springbootmongodb.domain.Post;
import com.studies.springbootmongodb.domain.User;
import com.studies.springbootmongodb.dto.AuthorDto;
import com.studies.springbootmongodb.dto.CommentDto;
import com.studies.springbootmongodb.repositories.PostRepository;
import com.studies.springbootmongodb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, alex, bob));

        Post post1 = new Post(null, simpleDateFormat.parse("21/03/2018"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!", new AuthorDto(maria));
        Post post2 = new Post(null, simpleDateFormat.parse("23/03/2018"), "Bom dia", "Acordei feliz hoje!", new AuthorDto(maria));

        CommentDto comment1 = new CommentDto("Boa viagem mano!", simpleDateFormat.parse("21/03/2018"), new AuthorDto(alex));
        CommentDto comment2 = new CommentDto("Aproveite!", simpleDateFormat.parse("22/03/2018"), new AuthorDto(bob));
        CommentDto comment3 = new CommentDto("Tenha um ótimo dia!", simpleDateFormat.parse("23/03/2018"), new AuthorDto(alex));

        post1.getComments().addAll(Arrays.asList(comment1, comment2));
        post2.getComments().add(comment3);

        postRepository.saveAll(Arrays.asList(post1, post2));

        maria.getPosts().addAll(Arrays.asList(post1, post2));
        userRepository.save(maria);
    }
}
