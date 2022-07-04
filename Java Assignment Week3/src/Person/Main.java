package Person;
public class Main {
    
    public static void main(String[] args)  {

        WholeSaler wholeSaler1 = new WholeSaler("john",(long) 1222233344);

        Farmer farmer1 = new Farmer("rama", (long) 765746345);
        Farmer farmer2 = new Farmer("Bill", (long) 897654653);
        Farmer farmer3 = new Farmer("Gates", (long) 764563421);
        Farmer farmer4 = new Farmer("jacob", (long) 676758443);
        Farmer farmer5 = new Farmer("sham", (long) 786546738);
        Farmer farmer6 = new Farmer("shubh", (long) 876456567);
        try {
            wholeSaler1.addFarmer(farmer1);
            wholeSaler1.addFarmer(farmer2);
            wholeSaler1.addFarmer(farmer3);
            wholeSaler1.addFarmer(farmer4);
            wholeSaler1.addFarmer(farmer5);
            wholeSaler1.addFarmer(farmer6);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("You cannot add more than 5 farmers to the farmers list");
        }

        System.out.println("List of Farmers");
        System.out.println("_________________________________________________________________");
        for (Farmer f : wholeSaler1.farmers) {
            System.out.printf("\n Farmer name: %s and Phone number: %s", f.getName(), f.getContact());
        }

    }

}