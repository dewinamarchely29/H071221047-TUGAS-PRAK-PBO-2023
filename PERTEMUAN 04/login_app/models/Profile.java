package login_app.models;

public class Profile { 
    
private String NamaLengkap;
private int Umur;
private String Hobby;
private String nickName;

public String getNickName() {
    return nickName;
}
public void setNickName(String nickName) {
    this.nickName = nickName;
}
public String getNamaLengkap() {
    return NamaLengkap;
}
public void setNamaLengkap(String namaLengkap) {
    NamaLengkap = namaLengkap;
}
public int getUmur() {
    return Umur;
}
public void setUmur(int umur) {
    Umur = umur;
}
public String getHobby() {
    return Hobby;
}
public void setHobby(String hobby) {
    Hobby = hobby;
}


}

