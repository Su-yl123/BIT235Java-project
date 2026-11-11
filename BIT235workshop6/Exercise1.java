public abstract class Exercise1 {
    public static void main(String[] args) {
        String[] songs = {"Ddu-du Ddu-du", "Fancy", "Feel Special", "I Can't Stop Me", "Cry For Me", "Like Ooh-ahh", "Cheer Up", "TT", "Alcohol-Free", "Moonlight Sunrise"};
        String[] artists = {"Twice", "Twice", "Twice", "Twice", "Twice", "Twice", "Twice", "Twice", "Twice", "Twice"};

        for(int i = 0; i < songs.length; i++){
            System.out.println("Song: " + songs[i] + " | Artist: " + artists[i]);
        }
    }
}
