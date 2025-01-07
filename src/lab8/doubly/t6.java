package lab8.doubly;

class Song {
    int songID;
    String songTitle;
    Song prev, next;
    Song(int songID, String songTitle) {
        this.songID = songID;
        this.songTitle = songTitle;
        this.prev = this.next = null;
    }
}
class Playlist {
    Song head, tail;
    public void insertSong(int songID, String songTitle) {
        Song newSong = new Song(songID, songTitle);
        if (head == null) {
            head = tail = newSong;
        } else {
            tail.next = newSong;
            newSong.prev = tail;
            tail = newSong;
        }
    }
    public void displayPlaylist() {
        if (head == null) {
            System.out.println("The playlist is empty.");
            return;
        }
        Song current = head;
        System.out.println("Playlist from start to end:");
        while (current != null) {
            System.out.println("Song ID: " + current.songID + ", Title: " + current.songTitle);
            current = current.next;
        }
    }
    public void reversePlaylist() {
        if (head == null) {
            System.out.println("The playlist is empty.");
            return;
        }
        Song current = tail;
        System.out.println("Playlist from end to start:");
        while (current != null) {
            System.out.println("Song ID: " + current.songID + ", Title: " + current.songTitle);
            current = current.prev;
        }
    }
}
class PlaylistSystem {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.insertSong(1, "Lose Yourself - Eminem");
        playlist.insertSong(2, "Stan - Eminem");
        playlist.insertSong(3, "Without Me - Eminem");
        playlist.insertSong(4, "Forgot About Dre - Dr. Dre ft. Eminem");
        playlist.insertSong(5, "The Real Slim Shady - Eminem");
        playlist.insertSong(6, "Till I Collapse - Eminem");

        playlist.displayPlaylist();

        playlist.reversePlaylist();
    }
}
