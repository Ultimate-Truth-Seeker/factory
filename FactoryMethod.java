interface Notificacion {
    void enviarMensaje(String mensaje);
}

class EmailNotificacion implements Notificacion {
    public void enviarMensaje(String mensaje) {
        System.out.println("Notificación enviada por correo electrónico: " + mensaje);
    }
}

class SMSNotificacion implements Notificacion {
    public void enviarMensaje(String mensaje) {
        System.out.println("Notificación enviada por SMS: " + mensaje);
    }
}

class AppNotificacion implements Notificacion {
    public void enviarMensaje(String mensaje) {
        System.out.println("Notifiación enviada por APP: " + mensaje);
    }
}

class NotificacionFactory {
    public Notificacion crearNotificacion(String tipo) {
        switch (tipo) {
            case "SMS":
                return new SMSNotificacion();
            case "email":
                return new EmailNotificacion();
            case "app":
                return new AppNotificacion();
            default:
                break;
        }
        throw new IllegalArgumentException("Unknown notification type");
    }
}

