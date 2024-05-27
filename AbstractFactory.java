interface NotificacionFactory {
    EmailNotificacion crearEmailNotificacion();
    SMSNotificacion crearSMSNotificacion();
    AppNotificacion crearAppNotificacion();
}

class UrgenteNotificacionFactory implements NotificacionFactory {

    
    public EmailNotificacion crearEmailNotificacion() {
        System.out.println("URGENTE:");
        return new EmailNotificacion();
    }


    public SMSNotificacion crearSMSNotificacion() {
        System.out.println("URGENTE:");
        return new SMSNotificacion();

    }


    public AppNotificacion crearAppNotificacion() {
        System.out.println("URGENTE:");
        return new AppNotificacion();
    }
    
}

class RegularNotificacionFactory implements NotificacionFactory {
    public EmailNotificacion crearEmailNotificacion() {
        return new EmailNotificacion();
    }


    public SMSNotificacion crearSMSNotificacion() {
        return new SMSNotificacion();

    }


    public AppNotificacion crearAppNotificacion() {
        return new AppNotificacion();
    }
}

