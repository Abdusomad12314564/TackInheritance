public class Main {
    public static void main(String[] args) {
        //todo Бул фрукты класстан 3 класс мурастап анын обектиси тузулуп консолго маалыматарды чыгарып берет
        Orange orange = new Orange("Сары түстө",150,"Даамы кычкыл",new Vitamin("С витаминге бай"));
        Apple apple = new Apple("Кызыл түстө",100,"Даамы ширин",new Vitamin("С,В витаминге бай"));
        Banana banana = new Banana("Сары түстө",180,"Даамы аябай ширин",new Vitamin("А,С,В витаминге бай"));
        System.out.println("Апелсин: "+orange+"\nАлма: "+apple+"\nБанан: "+banana);

    }
}