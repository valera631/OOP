public class LandLinePhone extends Phone {
    private boolean isCallable;
    public LandLinePhone(String number, String modelName, double weight, boolean isCallable) {
        super(number, modelName, weight);
        this.isCallable = isCallable;

    }
    @Override
    public void ring() {
        System.out.println("Пищит стационарный телефон");
    }
    // Переопределение метода toString()
    @Override
    public String toString() {
        return super.toString() + "\nМожно совершать звонки: " + (isCallable ? "Да" : "Нет");
    }
}
