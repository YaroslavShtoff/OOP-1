import java.time.LocalDate;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(LocalDate.now().getYear() -35,  " Максим ", " Минск",
                "бренд-менеджера " );
        maxim.life();

        Human anny = new Human(LocalDate.now().getYear() - 29," Аня "," Москва",
                "методиста образовательных программ" );
        anny.life();

        Human katy = new Human(LocalDate.now().getYear() - 28," Катя ", " Калиниград",
                "продакт-менеджера ");
        katy.life();

        Human anton = new Human(LocalDate.now().getYear() - 27," Антон "," Москва"," директора по развитию бизнеса ");
        anton.life();



        Car lada = new Car("Lada","Grande",1.7,"желтый", 2015,
                "Россия");
        lada.carID();

        Car audi = new Car("Audi","A8 50 L TDI quattro",3.0,"черный",2020,
                "Германия");
        audi.carID();

        Car bmw = new Car("BMW ","Z8",3.0,"черный",2021,
                "Германия");
        bmw.carID();

        Car kia = new Car("Kia","Sportage 4 поколение",2.4,"красный",
                2018,"Южная Корея");
        kia.carID();

        Car hyndai = new Car("Hyundai","Avante",1.6,"оранжевый",2016,
                "Южная Корея");
        hyndai.carID();

    }
}

