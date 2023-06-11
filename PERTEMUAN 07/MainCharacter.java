import java.util.ArrayList;

class MainCharacter {
    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>(5);
        Fighter pocahontas = new Fighter("Pocahontas", 12);  characters.add(pocahontas);
        Mage moana = new Mage("Moana", 8); characters.add(moana);
        Fighter mother_gothel = new Fighter("Mother Gothel", 8); characters.add(mother_gothel);
        Fighter tinkerbell = new Fighter("Tinkerbell", 8); characters.add(tinkerbell);
        Mage lady_tremaine = new Mage("Lady Tremaine", 9); characters.add(lady_tremaine);

        for (int i = 0; i < characters.size(); i++) {
            /* digunakan loop for yang akan berjalan sebanyak ukuran dari list "characters".
             * setiap iterasi dari loop, variabel i akan di-increment atau ditambahkan nilai 1. */

            Character character = characters.get(i);
            /*  kemudian, pada setiap iterasi, loop akan mengambil objek karakter pada indeks i 
             * menggunakan method get() pada list characters dengan parameter indeks i. objek tsb
             * kemudian disimpan dalam variabel "character" dnegan tipe data "Character". 
            */
            
            character.printAttack(character);
            //method "printAttack()" akan memanggil suatu aksi atau penggunaan kemampuan serangan dari karakter
        }
    }
}