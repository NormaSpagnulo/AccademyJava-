public class Bank {

    int getRateOfInterest() {
        return 0;
    }

    String nome() {
        return "Bank";
    }
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 8;
    }

    String nome() {
        return "SBI";
    }
}

class ICICI extends Bank {
    int getRateOfInterest() {
        return 7;
    }

    String nome() {
        return "ICICI";
    }
}

class AXIS extends Bank {
    int getRateOfInterest() {
        return 9;
    }

    String nome() {
        return "AXIS";
    }
}

class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();

        System.out.println(s.nome() + " Rate of Interest is " + s.getRateOfInterest());
        System.out.println(i.nome() + " Rate of Interest is " + i.getRateOfInterest());
        System.out.println(a.nome() + " Rate of Interest is " + a.getRateOfInterest());
    }
}
