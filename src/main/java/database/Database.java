package database;

import org.example.bot.model.Telefon;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Database {
  public static   List<Telefon> TELEFON_LIST = new ArrayList<>(){{

         String s23 = "Xususiyatlari\n" +
                 "Aloqa standarti\n" +
                 "3G, 4G LTE, 5G\n" +
                 "Operatsion tizim versiyasi\n" +
                 "Android 13\n" +
                 "Ekran yangilanish chastotasi\n" +
                 "120 Гц\n" +
                 "SIM-karta formati\n" +
                 "nano SIM+eSIM\n" +
                 "SIM-kartalar soni\n" +
                 "2\n" +
                 "Himoya darajasi\n" +
                 "IP68\n" +
                 "NFC\n" +
                 "Есть\n" +
                 "Bluetooth standarti\n" +
                 "5.3\n" +
                 "Protsessor\n" +
                 "Qualcomm Snapdragon 8 Gen2\n" +
                 "Old Kamera\n" +
                 "12 МП\n" +
                 "Orqa kamera\n" +
                 "50 МП, 12 МП, 10 МП\n" +
                 "Vazn\n" +
                 "168 г\n" +
                 "Batareya quvvati\n" +
                 "3900 мА⋅ч\n" +
                 "Ekran tomonlari nisbati\n" +
                 "20:9\n" +
                 "Ekran piksellari o'lchamlari\n" +
                 "2340x1080\n" +
                 "Ekran o'lchami\n" +
                 "6.1\"\n" +
                 "Ekran texnologiyasi\n" +
                 "Dynamic AMOLED 2X\n" +
                 "Doimiy xotira hajmi\n" +
                 "256 ГБ\n" +
                 "Operativ xotira hajmi\n" +
                 "8 ГБ\n" +
                 "Brend\n" +
                 "Samsung";
         add(new Telefon(UUID.randomUUID().toString(),UUID.randomUUID().toString(),UUID.randomUUID().toString(),"Samsung/S23.png","Samsung S23",256,8,1000,s23));
         String s23puls = "Кратко о товаре:\n" +
                 "Экран - 6.6\" (2340×1080) Dynamic AMOLED 120 Гц\n" +
                 "Камеры - задняя камера (50 МП + 10 МП + 12 МП) , фронтальная камера 12 МП\n" +
                 "Аккумулятор - 4700 мА/ч\n" +
                 "Процессор - Qualcomm Snapdragon 8 Gen2\n" +
                 "Операционная система - Android 13\n" +
                 "Беспроводные интерфейсы - Bluetooth, Wi-Fi, стандарт связи 2G, 3G, 4G LTE, 5G\n" +
                 "Степень защиты - IP68\n" +
                 "Вес - 195 г";
         add(new Telefon(UUID.randomUUID().toString(),UUID.randomUUID().toString(),UUID.randomUUID().toString(),"Samsung/S23+.png","Samsung S23+",256,12,1100,s23puls));
      String samsungS23 = "Кратко о товаре:" +"\n"+
              "Процессор - Qualcomm Snapdragon 8 Gen2\n" +
              "Операционная система - Android 13\n" +
              "Степень защиты - IP68\n" +
              "Вес - 234 г\n" +
              "Экран - 6.8\" Dynamic AMOLED 2* 120 Гц\n" +
              "Камеры - 4 с задней стороны (200 МП + 10 МП + 12 МП + 10 МП), фронтальная камера 12 МП\n" +
              "Аккумулятор - 5000 мАч";
      add(new Telefon(UUID.randomUUID().toString(),UUID.randomUUID().toString(),UUID.randomUUID().toString(),"Samsung/S23U.png", "Samsung S23Ultra", 256, 12,1400,samsungS23));
      String Ayfon15 = "Og'irligi\t171 г\n" +
              "O'lchami\t71.6x147.6x7.8 мм\n" +
              "Ekran diagonali\t6''–6,4''\n" +
              "Versiya OS\tios 17\n" +
              "Rang\tQora\n" +
              "Wi-Fi standarti\t802.11ax\n" +
              "SIM karta turi\tnano-sim+eSIM\n" +
              "Video Protsessor\tNeural Engine\n" +
              "Kafolat muddati\t1 год\n" +
              "Old kamera o'lchamlari\t12 мп\n" +
              "Naushniklar\tUSB Type-C\n" +
              "Protsessor\tApple A16 Bionic\n" +
              "Ichki xotira\t128 GB\n" +
              "Maks. video o'lchamlari\t3840x2160\n" +
              "Asosiy (orqa) kameralar soni\t2\n" +
              "Слот для карт памяти\tнет\n" +
              "Simsiz interfeyslar\tbluetooth, nfc, wi-fi\n" +
              "Asosiy (orqa) kameralar\t48 МП\n" +
              "LTE diapazonlarini qo'llab-quvvatlash\t2G, 3G, 4G LTE, 5G\n" +
              "Yadro Protsessorlar soni\t6\n" +
              "Operativ xotirasi\t6 GB\n" +
              "Operatsion tizimi\tiOS\n" +
              "Sharhlar";
      add(new Telefon(UUID.randomUUID().toString(),UUID.randomUUID().toString(),UUID.randomUUID().toString(),"Ayfon/Afon_15.png","Apple 15",256,4,1330,Ayfon15));
String ayfon15pro = "Xususiyatlar\n" +
        "Og'irligi\t187 г\n" +
        "O'lchami\t70.6x146.6x8.25 мм\n" +
        "Ekran diagonali\t6''–6,4''\n" +
        "Versiya OS\tios 17\n" +
        "Wi-Fi standarti\t802.11ax\n" +
        "SIM karta turi\tnano-sim+eSIM\n" +
        "Video Protsessor\tNeural Engine\n" +
        "Kafolat muddati\t1 год\n" +
        "Old kamera o'lchamlari\t12 мп\n" +
        "Naushniklar\tUSB Type-C\n" +
        "Protsessor\tApple A17 Pro\n" +
        "Ichki xotira\t256 GB\n" +
        "Maks. video o'lchamlari\t3840x2160\n" +
        "Asosiy (orqa) kameralar soni\t3\n" +
        "Слот для карт памяти\tнет\n" +
        "Simsiz interfeyslar\tbluetooth, nfc, wi-fi\n" +
        "Asosiy (orqa) kameralar\t48 МП\n" +
        "Yadro Protsessorlar soni\t6\n" +
        "Operativ xotirasi\t6 GB\n" +
        "Operatsion tizimi\tiOS\n";
add(new Telefon(UUID.randomUUID().toString(),UUID.randomUUID().toString(),UUID.randomUUID().toString(),"Ayfon/Ayfon15Pro.png","Apple 15 pro",256,6,1400,ayfon15pro));
  String Ayfon15ProMax = "Xususiyatlar\n" +
          "Og'irligi\t221 г\n" +
          "O'lchami\t76.7x159.9x8.25 мм\n" +
          "Ekran diagonali\t6,5''–6,9''\n" +
          "Versiya OS\tios 17\n" +
          "Wi-Fi standarti\t802.11ax\n" +
          "SIM karta turi\tnano-sim+eSIM\n" +
          "Video Protsessor\tNeural Engine\n" +
          "Kafolat muddati\t1 год\n" +
          "Old kamera o'lchamlari\t12 мп\n" +
          "Naushniklar\tUSB Type-C\n" +
          "Protsessor\tApple A17 Pro\n" +
          "Ichki xotira\t256 GB\n" +
          "Maks. video o'lchamlari\t3840x2160\n" +
          "Asosiy (orqa) kameralar soni\t3\n" +
          "Слот для карт памяти\tнет\n" +
          "Simsiz interfeyslar\tbluetooth, nfc, wi-fi\n" +
          "Asosiy (orqa) kameralar\t48 МП\n" +
          "Yadro Protsessorlar soni\t6\n" +
          "Operativ xotirasi\t6 GB\n" +
          "Operatsion tizimi\tiOS\n";
  add(new Telefon(UUID.randomUUID().toString(),UUID.randomUUID().toString(),UUID.randomUUID().toString(),"Ayfon/Ayfon15proMax.png","Apple 15 Pro Max",512,8,1650,Ayfon15ProMax));
  String redmiNote12 = "Xususiyatlar\n" +
          "Og'irligi\t188 г\n" +
          "O'lchami\t165.88 x 76.21 x 7.98 мм\n" +
          "Ekran diagonali\t6,5''–6,9''\n" +
          "Ekran turi\tSuper AMOLED\n" +
          "Versiya OS\tandroid 12\n" +
          "Rang\tQora\n" +
          "Wi-Fi standarti\t802.11ac\n" +
          "SIM karta turi\tnano sim\n" +
          "Modeli\tXiaomi Redmi Note 12\n" +
          "Video Protsessor\tAdreno™ 619\n" +
          "Kafolat muddati\t1 год\n" +
          "Old kamera o'lchamlari\t13 МП\n" +
          "Naushniklar\tmini jack 3.5 mm\n" +
          "Xotira\t128 ГБ\n" +
          "RAM\t6 ГБ\n" +
          "Protsessor\tQualcomm Snapdragon 685\n" +
          "Ichki xotira\t128 GB\n" +
          "Ishlab chiqaruvchi mamlakat\tXitoy\n" +
          "Asosiy (orqa) kameralar soni\t3\n" +
          "Слот для карт памяти\tmicrosd (до 1тб)\n" +
          "Simsiz interfeyslar\tBluetooth, Wi-Fi, инфракрасный порт (IRDA)\n" +
          "Batareya quvvati\t5000 - 5999 mA / soat\n" +
          "Asosiy (orqa) kameralar\t48+8+2 MP\n" +
          "LTE diapazonlarini qo'llab-quvvatlash\t2G, 3G, 4G LTE\n" +
          "Maks. video kadr tezligi\t120fps\n" +
          "Yadro Protsessorlar soni\t8\n" +
          "Operativ xotirasi\t6 GB\n" +
          "Operatsion tizimi\tAndroid\n";
  add(new Telefon(UUID.randomUUID().toString(),UUID.randomUUID().toString(),UUID.randomUUID().toString(),"Redmi/RedmiNote12.png","Redmi Note 12",8,128,200,redmiNote12));
String redmiNote12Pro = "Xususiyatlar\n" +
        "Og'irligi\t187 г\n" +
        "O'lchami\t76x162.9x7.9 мм\n" +
        "Ekran diagonali\t6,5''–6,9''\n" +
        "Ekran turi\tAMOLED\n" +
        "Versiya OS\tAndroid 13\n" +
        "Rang\tKulrang\n" +
        "Wi-Fi standarti\t802.11n\n" +
        "SIM karta turi\tnano sim\n" +
        "Modeli\tXiaomi Redmi Note 12 Pro\n" +
        "Video Protsessor\tAdreno 618\n" +
        "Kafolat muddati\t1 год\n" +
        "Old kamera o'lchamlari\t16 МП\n" +
        "Naushniklar\tusb type-c\n" +
        "Xotira\t256 гб\n" +
        "RAM\t8 ГБ\n" +
        "Protsessor\tQualcomm Snapdragon 732G\n" +
        "Ichki xotira\t256 GB\n" +
        "Maks. video o'lchamlari\t3840x2160\n" +
        "Asosiy (orqa) kameralar soni\t6\n" +
        "Слот для карт памяти\tесть\n" +
        "Simsiz interfeyslar\tBluetooth, NFC, Wi-Fi\n" +
        "Batareya quvvati\t5000 - 5999 mA / soat\n" +
        "Asosiy (orqa) kameralar\t108 МП\n" +
        "LTE diapazonlarini qo'llab-quvvatlash\t2G, 3G, 4G LTE\n" +
        "Yadro Protsessorlar soni\t8\n" +
        "Operativ xotirasi\t8 GB\n" +
        "Operatsion tizimi\tAndroid\n";
add(new Telefon(UUID.randomUUID().toString(),UUID.randomUUID().toString(),UUID.randomUUID().toString(),"Redmi/RedmiNote12Pro.png","Redmi Note 12 Pro",8,256,300,redmiNote12Pro));

String redmiNote12pulus = "Xususiyatlar\n" +
        "Og'irligi\t208,4 г\n" +
        "O'lchami\t76.03x162.9x8.9 мм\n" +
        "Ekran diagonali\t6,5''–6,9''\n" +
        "Versiya OS\tAndroid 12\n" +
        "Rang\tQora\n" +
        "Wi-Fi standarti\t802.11n\n" +
        "SIM karta turi\tnano sim\n" +
        "Video Protsessor\tMali-G68 MC4\n" +
        "Kafolat muddati\t1 год\n" +
        "Old kamera o'lchamlari\t16 МП\n" +
        "Naushniklar\tusb type-c\n" +
        "Protsessor\tMediaTek Dimensity 1080\n" +
        "Ichki xotira\t256 GB\n" +
        "Maks. video o'lchamlari\t3840x2160\n" +
        "Asosiy (orqa) kameralar soni\t3\n" +
        "Слот для карт памяти\tнет\n" +
        "Simsiz interfeyslar\tBluetooth, NFC, Wi-Fi\n" +
        "Asosiy (orqa) kameralar\t200 МП\n" +
        "LTE diapazonlarini qo'llab-quvvatlash\t2G, 3G, 4G LTE, 5G\n" +
        "Yadro Protsessorlar soni\t8\n" +
        "Operativ xotirasi\t8 GB\n" +
        "Operatsion tizimi\tAndroid\n";
add(new Telefon(UUID.randomUUID().toString(),UUID.randomUUID().toString(),UUID.randomUUID().toString(),"Redmi/RedmiNote12Pro+.png","Redmi note 12 Pro +",256,8,350,redmiNote12pulus));

      String xiaomi13 = "Xususiyatlar\n" +
              "Og'irligi\t193 г\n" +
              "O'lchami\t76.3x168.6x8.5 мм\n" +
              "Ekran diagonali\t6,5''–6,9''\n" +
              "Ekran turi\tAMOLED\n" +
              "Versiya OS\tAndroid 13\n" +
              "Rang\tHavorang\n" +
              "Wi-Fi standarti\tWi-Fi 802.11 a/b/g/n/ac/6\n" +
              "SIM karta turi\tNano-SIM\n" +
              "Video Protsessor\tMali-G610 MC6\n" +
              "Kafolat muddati\t1 Год\n" +
              "Old kamera o'lchamlari\t20 MP\n" +
              "Naushniklar\tUSB Type-C\n" +
              "Protsessor\tMediatek Dimensity 8200 Ultra\n" +
              "Ichki xotira\t256 GB\n" +
              "Maks. video o'lchamlari\t3840x2160\n" +
              "Asosiy (orqa) kameralar soni\t3\n" +
              "Слот для карт памяти\tнет\n" +
              "Simsiz interfeyslar\tBluetooth, NFC, Wi-Fi\n" +
              "Batareya quvvati\t5000 - 5999 mA / soat\n" +
              "Asosiy (orqa) kameralar\t50 МП\n" +
              "LTE diapazonlarini qo'llab-quvvatlash\t4G LTE, 5G, 3G, 2G\n" +
              "Yadro Protsessorlar soni\t8\n" +
              "Operativ xotirasi\t12 GB\n" +
              "Operatsion tizimi\tAndroid\n";
      add(new Telefon(UUID.randomUUID().toString(),UUID.randomUUID().toString(),UUID.randomUUID().toString(),"Xiaomi/Xiaomi13.png","Xiaomi 13T",256,12,500,xiaomi13));
       String xiaomi13TPro ="Xususiyatlar\n" +
               "Og'irligi\t206 г\n" +
               "O'lchami\t75.7x162.2x8.5 мм\n" +
               "Ekran diagonali\t6,5''–6,9''\n" +
               "Ekran turi\tAMOLED\n" +
               "Versiya OS\tAndroid 13\n" +
               "Rang\tYashil\n" +
               "Wi-Fi standarti\tWi-Fi 802.11 a/b/g/n/ac/6\n" +
               "SIM karta turi\tNano-SIM\n" +
               "Video Protsessor\tArm Immortalis-G715\n" +
               "Kafolat muddati\t1 Год\n" +
               "Old kamera o'lchamlari\t20 MP\n" +
               "Naushniklar\tUSB Type-C\n" +
               "Protsessor\tMediaTek Dimensity 9200 Plus\n" +
               "Ichki xotira\t512 GB\n" +
               "Maks. video o'lchamlari\t3840x2160\n" +
               "Asosiy (orqa) kameralar soni\t3\n" +
               "Слот для карт памяти\tнет\n" +
               "Simsiz interfeyslar\tBluetooth, NFC, Wi-Fi\n" +
               "Batareya quvvati\t5000 - 5999 mA / soat\n" +
               "Asosiy (orqa) kameralar\t50 МП\n" +
               "LTE diapazonlarini qo'llab-quvvatlash\t4G LTE, 5G, 3G, 2G\n" +
               "Yadro Protsessorlar soni\t8\n" +
               "Operativ xotirasi\t12 GB\n" +
               "Operatsion tizimi\tAndroid\n";
       add(new Telefon(UUID.randomUUID().toString(),UUID.randomUUID().toString(),UUID.randomUUID().toString(),"Xiaomi/Xiaomi13TPro.png","Xiaomi 13T Pro",512,12,700,xiaomi13TPro));

  }};


}
