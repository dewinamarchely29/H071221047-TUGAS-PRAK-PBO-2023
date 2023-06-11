package No2;

public class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm; // Words Per Minute
    private TypeRacer typeRacer;

    public Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public void setWpm(double wpm) {
        this.wpm = wpm;
    }

    public void addWordTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public String getBotName() {
        return botName;
    }

    public double getWpm() {
        return wpm;
    }

    @Override
    public void run() {

        String[] wordsToType = typeRacer.getWordsToType().split(" ");

        // TODO 1
        //Perhitungan dilakukan dengan cara membagi 60000 (karena 1 menit = 60 detik X 1000 milidetik/menit) dengan nilai WPM. 
        int howLongToType = (int) (60000 / wpm);

        // TODO 2
        for (String word : wordsToType) {
            try {
                Thread.sleep(howLongToType);
                //perulangan dijalankan akan mengambil setiap elemen dari array "wordsToType" dan 
                //menunggu selama "howLongToType" milidetik dengan menggunakan method "Thread.sleep()".

                this.addWordTyped(word);
                //Selanjutnya kode akan mengeksekusi method "addWordTyped()", dimana nilai element array "wordsToType"
                // akan dimasukkan sebagai parameter di dalamnya. Jika terjadi kesalahan saat melakukan "Thread.sleep()",
                // error message akan ditampilkan di dalam statement "catch".
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //

        this.addWordTyped("(selesai)");

        // TODO 3
        typeRacer.addResult(this);
    }
}
