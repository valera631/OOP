//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone("123456789", "Samsung Galaxy S21", 170.5);
        Phone phone2 = new Phone("987654321", "iPhone 13", 180.0);

        LandLinePhone landLinePhone1 = new LandLinePhone("123456", "Some Landline Model", 1000.0, true);
        LandLinePhone landLinePhone2 = new LandLinePhone("654321", "Another Landline Model", 1100.0, false);

        MobilePhone mobilePhone1 = new MobilePhone("111222333", "Samsung Galaxy Fold", 280.0, 7.6, true);
        MobilePhone mobilePhone2 = new MobilePhone("444555666", "Google Pixel 6", 190.0, 6.4, false);

        phone1.setModelName("Xiaomi Redmi Note 11");
        phone1.setWeight(150.0);


        // Вызов созданных и переопределенных методов для каждого экземпляра
        System.out.println("Phone 1:");
        System.out.println(phone1);
        phone1.receiveCall("John");
        phone1.ring();

        System.out.println("\nPhone 2:");
        System.out.println(phone2);
        phone2.receiveCall("Anna");
        phone2.ring();

        System.out.println("\nLandline Phone 1:");
        System.out.println(landLinePhone1);
        landLinePhone1.receiveCall("Mike");
        landLinePhone1.ring();

        System.out.println("\nLandline Phone 2:");
        System.out.println(landLinePhone2);
        landLinePhone2.receiveCall("Emily");
        landLinePhone2.ring();

        System.out.println("\nMobile Phone 1:");
        System.out.println(mobilePhone1);
        mobilePhone1.receiveCall("David");
        mobilePhone1.sendMessage("Hello!", "999888777");
        mobilePhone1.ring();

        System.out.println("\nMobile Phone 2:");
        System.out.println(mobilePhone2);
        mobilePhone2.receiveCall("Sophia");
        mobilePhone2.sendMessage("Hi!", "666777888");
        mobilePhone2.ring();

        // Вызов метода aboutPhone() для каждого созданного экземпляра
        System.out.println("\nCalling aboutPhone() for each instance:");
        System.out.println("Phone 1:");
        PhoneManager.aboutPhone(phone1);

        System.out.println("\nLandline Phone 1:");
        PhoneManager.aboutPhone(landLinePhone1);

        System.out.println("\nMobile Phone 1:");
        PhoneManager.aboutPhone(mobilePhone1);
    }
}