public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        if (this.brand == null || this.brand.isEmpty()) {
            this.brand = "default";
        }
        this.model = model;
        if (this.model == null) {
            this.model = "default";
        }
        this.engineVolume = engineVolume;
        if (Double.compare(this.engineVolume, 0D) == 0)
            this.engineVolume = 1.5;
        this.color = color;
        if (this.color == null) {
            this.color = "белый";
        }
        this.productionYear = productionYear;
        if (this.productionYear <0) {
            this.productionYear = 2000;
        }

        this.productionCountry = productionCountry;
        if (this.productionCountry == null) {
            this.productionCountry = "default";
        }


    }

    String productionCountry;

    void carID() {
        System.out.println( " Марка " + brand + " Модель " + model + " Объем двигателя " +
                  engineVolume + "л. Цвет кузова " + color + " Год производства " + productionYear
                + " Страна сборки " + productionCountry);

    }
}
