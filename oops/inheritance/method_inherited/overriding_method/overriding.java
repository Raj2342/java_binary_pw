class Aeroplane{
    //override
    void fly(){
        System.out.println("Aeroplane is fly");
    }

    void takeoff(){
        System.out.println("aeroplane is takeoff");
    }
}

class Caroplane  extends Aeroplane
{
    //   thses changes is called overriding
    void takeoff(){
        System.out.println("Cargoplane is takeoff");
    }
}
class PassengerPlane  extends Aeroplane
{
    
    void fly(){
        System.out.println("PassengerPlane is fly");
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