public class Phone implements RingAble {
    private String number;
    private String modelName;
    private double weight;

    public Phone(String number, String modelName, double weight){
        this.number = number;
        this.modelName = modelName;
        this.weight = weight;

    }
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Номер телефона: " + number + "\nМодель: " + modelName + "\nВес: " + weight + " г";
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void ring() {
        System.out.println("Звенит телефон");
    }
}
