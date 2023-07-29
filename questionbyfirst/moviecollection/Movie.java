package questionbyfirst.moviecollection;

public class Movie {

        private String title;
        private String director;
        private int releaese_year;
        private String genre;
        private int rating;


        public Movie(String title,String director,String genre,int release_year,int rating){
                this.title = title;
                this.director = director;
                this.genre = genre;
                this.releaese_year = release_year;
                this.rating = rating;

        }


        public String getTitle() {
                return title;
        }


        public void setTitle(String title) {
                this.title = title;
        }


        public String getDirector() {
                return director;
        }


        public void setDirector(String director) {
                this.director = director;
        }


        public int getReleaese_year() {
                return releaese_year;
        }


        public void setReleaese_year(int releaese_year) {
                this.releaese_year = releaese_year;
        }


        public String getGenre() {
                return genre;
        }


        public void setGenre(String genre) {
                this.genre = genre;
        }


        public int getRating() {
                return rating;
        }


        public void setRating(int rating) {
                this.rating = rating;
        }


        @Override
        public String toString() {
                return "Movie [title=" + title + ", director=" + director + ", releaese_year=" + releaese_year
                                + ", genre=" + genre + ", rating=" + rating + "]";
        }

        
}
