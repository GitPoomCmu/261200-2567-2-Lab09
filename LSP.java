// Interfaces

interface Movable {
    void Move();
}
interface Flyable extends Movable {
    void Fly();
}

// Classes

class Penguin implements Movable{
    @Override
    public void Move(){
        System.out.println("Penguin is moving.");
    }
}

class Ostrish implements Movable{
    @Override
    public void Move(){
        System.out.println("Ostrish is moving.");
    }
}

class Sparrow implements Flyable{
    @Override
    public void Move(){
        System.out.println("Sparrow is moving.");
    }
    @Override
    public void Fly(){
        System.out.println("Sparrow is flying.");
    }
}

class Eagle implements Flyable{
    @Override
    public void Move(){
        System.out.println("Eagle is moving.");
    }
    @Override
    public void Fly(){
        System.out.println("Eagle is flying.");
    }
    
}