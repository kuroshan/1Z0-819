public class Reindeer {
    @Music(genres="Blues","Jazz") String favorite; //DOES NOT COMPILE
    @Music(genres=) String mostDisliked; //DOES NOT COMPILE
    @Music(genres=null) String other; //DOES NOT COMPILE
    @Music(genres={}) String alternate;
}