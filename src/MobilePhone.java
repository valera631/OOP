public class MobilePhone extends Phone {
    private double screenSize;
    private boolean isFoldable;

    public MobilePhone(String number, String modelName, double weight, double screenSize, boolean isFoldable) {
        super(number, modelName, weight);
        this.isFoldable = isFoldable;
        this.screenSize = screenSize;
    }
    @Override
    public void ring() {
        System.out.println("Играет полифония мобильника");
    }

    // Метод для отправки сообщения
    public void sendMessage(String message, String recipientNumber) {
        System.out.println("Сообщение \"" + message + "\" отправлено на номер " + recipientNumber);
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return super.toString() + "\nДиагональ экрана: " + screenSize + " дюймов" +
                "\nРаскладной: " + (isFoldable ? "Да" : "Нет");
    }

}
