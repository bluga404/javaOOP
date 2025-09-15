package bluga.oop.data;

public interface Car extends HasBrand, isMaintenance{

    void drive();

    int tire();

    default boolean isBig(){
        return false;
    }

}
