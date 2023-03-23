package tech.ada.java.movieslibrary.api.movie;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_movie")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MovieModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imdbID;
    private String title;
    private String genre;
    private String director;
    private String actors;
    @Column( name = "year_film")
    private Long year;

}