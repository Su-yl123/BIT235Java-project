public class Exercise2 {
    public static void main(String[] args) {
        String[] songs = {"Ddu-du Ddu-du", "Fancy", "Feel Special", "I Can't Stop Me", "Cry For Me", "Like Ooh-ahh", "Cheer Up", "TT", "Alcohol-Free", "Moonlight Sunrise"};
        String[] artists = {"Twice", "Twice", "Twice", "Twice", "Twice", "Twice", "Twice", "Twice", "Twice", "Twice"};

        for(int i = 0; i < songs.length -1; i++){
            for(int j = 0; j < songs.length -1 -i; j++){
                if(songs[j].compareTo(songs[j+1]) > 0){
                    String tempSong = songs[j];
                    String tempArtist = artists[j];
                    songs[j] = songs[j+1];
                    artists[j] = artists[j+1];
                    songs[j+1] = tempSong;
                    artists[j+1] = tempArtist;
                }
            }
        }

        for(int i = 0; i < songs.length; i++){
            System.out.println("Song: " + songs[i] + " | Artist: " + artists[i]);
        }
    }
}
