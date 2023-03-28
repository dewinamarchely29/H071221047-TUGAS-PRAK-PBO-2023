//NOMOR 1

class Blackpink{
    //atribut
    String TitleSong;
    int ReleaseYear;
    String Album;

    //public supaya dapat diakses dari class lain
    public Blackpink(){}


    //constructor
    public Blackpink(String TitleSong, String Album, int ReleaseYear){
        this.TitleSong = TitleSong;
        this.ReleaseYear = ReleaseYear;
        this.Album = Album;
    }

    public Blackpink(String TitleSong, String Album){
        this.TitleSong = TitleSong;
        this.Album = Album;
        this.ReleaseYear =0;
    }

//get set method
String getTitleSongString(){
    return TitleSong;
}

int getReleaseYear(){
    return ReleaseYear;
}

String getAlbum(){
    return Album;
}

public void setReleaseYear(int ReleaseYear ){
    this.ReleaseYear = ReleaseYear ;
}


    //behavior
public void tampilkanDetail(){
    System.out.println("Title Song   : " + TitleSong);
    System.out.println("Album        : " + Album);
    System.out.println("Release Year : " + ReleaseYear);
}


   public void ReleaseYear () {
    if (this.ReleaseYear >= 2019) {
        System.out.println("Lisa Main Rapper"); 
    } else if (this.ReleaseYear < 2016) {
        System.out.println("Jennie Main Vocal");;
    } else {
        System.out.println("Rose Lead Dancer");
    }
    
}}

