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
        

        Caroplane  c = new Caroplane();

        Aeroplane   ref ;
         ref = p;
        ref = c;
        // ref.carrayPassenger(); // canot call from parents becoz it is child created own method 
        // ref.carrayGoods();

        ///////////////////- sol-1 : call only from child  object refrence 
        // p.carrayPassenger(); 
        // c.carrayGoods();

        ///////   soln-2 : if want call from parents use  downcasting method

      ( ( PassengerPlane) ref ).carrayPassenger();

    }
}