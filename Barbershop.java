package barbershopservice;

public class Barbershop implements BarbershopService {
    
    @Override
    public void getTotal(int cut, int shave, int haircolor) {
        int total = cut + shave + haircolor;

        System.out.println("Total Services: " + total + "\n");
    }
}
