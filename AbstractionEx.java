class HillStations {

    void location() {
        System.out.println("Location is:");
    }

    void famousFor() {
        System.out.println("Famous for:");
    }
}

class Manali extends HillStations {

    void location() {
        System.out.println("Manali is in Himachal Pradesh");
    }

    void famousFor() {
        System.out.println("It is Famous for Hadimba Temple and adventure sports");
    }
}

class Mussoorie extends HillStations {

    void location() {
        System.out.println("Mussoorie is in Uttarakhand");
    }

    void famousFor() {
        System.out.println("It is Famous for education institutions");
    }
}

class Gulmarg extends HillStations {

    void location() {
        System.out.println("Gulmarg is in J&K");
    }

    void famousFor() {
        System.out.println("It is Famous for skiing");
    }
}

public class AbstractionEx {

    public static void main(String[] args) {

        HillStations hs;

        System.out.println("Location is:");
        System.out.println("Famous for:");

        hs = new Manali();
        hs.location();
        hs.famousFor();

        hs = new Mussoorie();
        hs.location();
        hs.famousFor();

        hs = new Gulmarg();
        hs.location();
        hs.famousFor();
    }
}
