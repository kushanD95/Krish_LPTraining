package factoryMethod;

import factoryMethod.enums.PackageCode;
import factoryMethod.packages.Package;
import factoryMethod.packages.PackageFactory;

public class Application {
    public static void main(String[] args) {
        //get basic pack
        System.out.println("________________________________BASIC______________________________");
        Package aPackage = PackageFactory.createPackage(PackageCode.BASIC);
        //gat silver pack
        System.out.println("________________________________SILVER______________________________");
        Package aPackage1 = PackageFactory.createPackage(PackageCode.SILVER);
        //gat silver pack
        System.out.println("________________________________GOLD______________________________");
        Package aPackage2 = PackageFactory.createPackage(PackageCode.GOLD);
    }
}
