

// Polymorphism -- > Bir nesnenin birden fazla nesne gibi davranmasıdır.
// Yani bir java dosyasının içine birden fazla class kayabiliyoruz.

//
class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }


    public static String konus() {

        return "Hayvan konusuyor..";
    }

}
class Kedi extends Hayvan {

    public Kedi(String isim) {
        super(isim);

    }
    public static String konus() {

        return this.getIsim() + " Miyavliyor..";
    }
}

class Kopek extends Hayvan {
    public Kopek(String isim) {
        super(isim);
    }
    public String konus() {
        return this.getIsim() + "havliyor...";
    }
}

class At extends Hayvan {
    public At(String isim) {
        super(isim);
    }
    public static String konus() {
        return this.getIsim() + "Kisniyor...";
    }
}

public class Main {

    public static void konustur(Object object){ //Eğer poly kullanırsanız hayvan sınıfıdan 100 sınıf kalsada polyn'in gerçek fayadası bu
        // System.out.println(object.konus());

        if(object instanceof Kopek) {

            Kopek kopek =(Kopek) object;
            System.out.println(kopek.konus());


        }
        else if(object instanceof Kedi) {
            Kedi kedi =(Kedi) object;
            System.out.println(Kedi.konus());

        }
        else if(object instanceof At) {
            At at =(At) object;
            System.out.println(at.konus());

        }
        else if (object instanceof Hayvan) {
            Hayvan hayvan =(Hayvan) object;
            System.out.println(Hayvan.konus());


        }
    }

    public static void main(String[] args) {

        //konustur(new Kedi("Tekir"));

        //konustur(new Kopek("Karabas"));
        // konustur(new At("Tekirbas"));


        // Polymorphism için bir ana class olacak, (hayvan) diğer kala sınıflar alt sınıf olacak
        // alt classtlarin üst sınıfların referansına hesaplayabiliyoruz.
        // bir objeyi birden fazla obje gibi kullanabiliyoruz.
        // bunları yapmak için inheritians gibi bir yapı olması gerekiyor.
        // override yapmayı unutma.
        // *********************************************
        // bir objenin hangi classdan bulmamız için bir anahtar'ı bilmek lazım.(instanceof)
        // bir obje vericez ve hangi classadan olduğunu bulacağız.
        //


        //Kopek kopek = new Kopek("Karabas");



        //if(kopek instanceof Hayvan) { // kopek sınıfı kopek sınıfından mıdır? True ya da false dönecek

            //System.out.println("Bu nesne Hayvan sinifindan...");

        Kopek kopek = new Kopek("Karabas");
        Kedi kedi = new Kedi("Tekir");
        At at = new At("Sahbatur");

        Hayvan hayvan = new Hayvan("Limon");

        konustur(kopek);
        konustur(kedi);
        konustur(at);
        konustur(hayvan);



        }


    }

}
