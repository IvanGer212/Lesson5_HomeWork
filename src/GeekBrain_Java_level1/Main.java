package GeekBrain_Java_level1;

public class Main {

    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Иван Петрович Ветров", "Инженер", "VetrovIP@gmail.com","+712351546", 45831.25f,38);
        workers[1] = new Worker("Анна Сергеевна Смирнова","Бухгалтер","SmirnovaAS@gmail.com","+7364752",48734.47f,67);
        workers[2] = new Worker("Наталья Александоровна Иванова","Секретарь","IvanovaNA@yandex.ru","+73156213",34781.54f,24);
        workers[3] = new Worker("Борис Михайлович Сергеев","Менеджер","SergeevBM@mail.ru","+748961235",47354.78f,43);
        workers[4] = new Worker("Александр Иванович Петров","Директор","PetrovAI@gmail.com","+7489345678",72364.14f,36);

        for (int i = 0; i<workers.length;i++){
            if (workers[i].getAge()>40){
                workers[i].writeInfo();
                System.out.println();
            }
        }
    }
}
