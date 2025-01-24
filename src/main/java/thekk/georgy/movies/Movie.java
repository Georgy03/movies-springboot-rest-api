package thekk.georgy.movies;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;

    @JsonProperty
    private String imdbId;

    @JsonProperty
    private String title;

    @JsonProperty
    private String releaseDate;

    @JsonProperty
    private String trailerLink;

    @JsonProperty
    private String poster;

    @JsonProperty
    private List<String> genres;

    @JsonProperty
    private List<String> backdrops;


    @JsonProperty
    @DocumentReference
    private List<Review> reviewIds;



}
