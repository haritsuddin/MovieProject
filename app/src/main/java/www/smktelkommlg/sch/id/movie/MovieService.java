package www.smktelkommlg.sch.id.movie;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieService {
    @GET("/JSONParsingTutorial/jsonMovie")
    Call<MovieService> getMovies();

}
