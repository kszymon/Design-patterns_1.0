package StrefaKursow.Kreacyjne.StatycznaMetodaWytw√≥rcza.models;

import StrefaKursow.Kreacyjne.StatycznaMetodaWytw√≥rcza.House;

public class FamilyHouse {
    private String adress;
    private Integer floorsNumber;

    public FamilyHouse(String adress, Integer floorsNumber) {
        this.adress = adress;
        this.floorsNumber = floorsNumber;
    }

    public static FamilyHouse from(House house) {
        return new FamilyHouse(house.getAdress(), house.getFloorsNumber());
    }
}
