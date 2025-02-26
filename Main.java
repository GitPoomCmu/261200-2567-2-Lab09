public class Main {
    public static void main(String[] args){
        // [ OCP ]

        Rectangle newRec = new Rectangle(5, 10);
        Circle newCir = new Circle(5);
        Eclipse newEcl = new Eclipse(5, 10);
        
        System.out.println(newRec.calculateArea());
        System.out.println(newCir.calculateArea());
        System.out.println(newEcl.calculateArea());


        // [ LSP ]

        Penguin pingu = new Penguin();
        pingu.Move();
        //pingu.Fly(); //Error

        Ostrish somali = new Ostrish();
        somali.Move();
        //somali.Fly(); //Error

        Sparrow pretonia = new Sparrow();
        pretonia.Move();
        pretonia.Fly();

        Eagle bald = new Eagle();
        bald.Move();
        bald.Fly();


        // [ DIP ]

        EmailNotifier emailNotif = new EmailNotifier();
        SMSNotifier smsNotif = new SMSNotifier();

        OrderProcessor processorEmail = new OrderProcessor(emailNotif);
        OrderProcessor processorSMS = new OrderProcessor(smsNotif);

        Order Order_01 = new Order();
        processorEmail.processOrder(Order_01);
        processorSMS.processOrder(Order_01); 
    }
}
