class Order{
    
}

interface NotificationService {
    void notify(String message);
}

// Notifiers

class EmailNotifier implements NotificationService {
    @Override
    public void notify(String message) {
        System.out.println("[Email] " + message);
    }
}

class SMSNotifier implements NotificationService {
    @Override
    public void notify(String message) {
        System.out.println("[SMS] " + message);
    }
}

// OrderProcessor

class OrderProcessor {
    private final NotificationService notificationService;
    
    public OrderProcessor(NotificationService notificationService) {
      this.notificationService = notificationService;
    }
      
    public void processOrder(Order order) {
      notificationService.notify("Order processed");
    }
  }
  
