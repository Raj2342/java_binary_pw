class Aeroplane{
    void fly(){
        System.out.println("Aeroplane is fly");
    }

    void takeoff(){
        System.out.println("aeroplane is takeoff");
    }
}

class Caroplane  extends Aeroplane
{
    
    void carrayGoods(){
        System.out.println("Cargoplane is  carrayGoods");
    }
}
class PassengerPlane  extends Aeroplane
{
    
    void carrayPassenger(){
        System.out.println("PassengerPlane is carrayPassenger");
    }
}


class overriding {
    public static void main(String[] args) {
        
        PassengerPlane p = new PassengerPlane();
        p.fly();
        p.takeoff(); 

        Caroplane  c = new Caroplane();
        c.fly();
        c.takeoff();
    }
}