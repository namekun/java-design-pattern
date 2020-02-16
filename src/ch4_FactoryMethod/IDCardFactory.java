package ch4_FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<String>();

    @Override
    protected Product createProduct(String owner){ // Factory Method
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product p) {
        owners.add(((IDCard) p).getOwner());
    }

    public List<String> getOwners(){
        return owners;
    }

}
