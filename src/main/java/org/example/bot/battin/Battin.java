package org.example.bot.battin;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import database.Database;
import lombok.SneakyThrows;
import org.example.bot.model.Dollar;

import org.example.bot.model.Telefon;
import org.example.bot.model.UserType;
import org.example.bot.model.Users;
import org.example.bot.servis.UserServis;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;


public class Battin {
    public static SendMessage inMainMenu(String chatId) {
        Users users = UserServis.findChatId(chatId);
        users.setUserType(UserType.REGESTRED);
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Main");
        sendMessage.setReplyMarkup(Battinku.BatinChiqarish());
        return sendMessage;
    }

    public static SendMessage getContact(String chatId) {
        SendMessage sendMessage = new SendMessage(chatId,"Telefon nomer kirting");
        sendMessage.setReplyMarkup(Battinku.RuyhadanUtish());
        return sendMessage;
    }


    public static SendPhoto murojat(String chatId) {
        SendPhoto sendPhoto = new SendPhoto(chatId,new InputFile(new File("foro/img.png")));
        sendPhoto.setCaption("Dasturchi  bilan aloqa qilish uchin linkdi ustiga bosing \n<< [Ushbu bot Dasturchisi](https://t.me/Javlonchik_oke_BlogGer_Rasmiy)>>");
        sendPhoto.setParseMode("Markdown");
        return sendPhoto;
    }

    public static SendMessage Telefonlar(String chatId) {
   SendMessage sendMessage = new SendMessage(chatId," \uD83D\uDCF1 Telefonlar ");
   sendMessage.setReplyMarkup(Battinku.BarchaTelefonlar());
   return sendMessage;
    }

    public static SendMessage Dollor(String chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
      List<Dollar>list = DollarKursi();
      Dollar dollar2 = null;
        for (Dollar dollar : list) {
            if (dollar.getCcy().equalsIgnoreCase("USD")){
              dollar2 =dollar;
              break;
            }
        }
        String str = "Valyuta -> " + dollar2.getCcy() + "\n" + "Hozirdagi narxi sumda -> "+dollar2.getRate()+" sum \n"+
                "Valyuta yangilangan vaqti -> "+dollar2.getDate();
            sendMessage.setText(str);
        return sendMessage;
    }

    @SneakyThrows
    private static List<Dollar> DollarKursi() {
        URL url = new URL(textlarUchun.dollarAppi);
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        ObjectMapper objectMapper = new ObjectMapper();
        List<Dollar> dollars = objectMapper.readValue(inputStream, new TypeReference<List<Dollar>>() {
        });
        return dollars;
    }

    public static SendPhoto TELEFON(Telefon telefon, String chatId) {
        SendPhoto sendPhoto = new SendPhoto(chatId,new InputFile(new File(telefon.getFile())));
        String str  = "Telefon Nomi "+telefon.getNomi()+"\n"+"Telefon xotirasi "+telefon.getRam()+"/"+telefon.getDoimiyXotirasi()+"\n Telefon Narxi :"+telefon.getNarxi()+"$";
        sendPhoto.setReplyMarkup(Battinku.Buyruqlar(telefon));
        sendPhoto.setCaption(str);
        sendPhoto.setParseMode("Markdown");
        return sendPhoto;

    }

    public static SendMessage XATOLIK(String chatIDI, Telefon telefon1) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatIDI);
        sendMessage.setText("Xatoli bush");
        return sendMessage;
    }

    public static SendMessage TELEFONHAQIDA(String chatIDI, Telefon telefon1) {
        SendMessage sendMessage = new SendMessage(chatIDI,telefon1.getNomi()+"\n"+telefon1.getTelefonHaqidaMalumot());
        return sendMessage;
    }

    public static SendMessage SAVATGA(String chatIDI, Telefon telefon4) {
        Users users = UserServis.findChatId(chatIDI);
        users.Savat.add(telefon4);
        SendMessage sendMessage = new SendMessage(chatIDI,"Muvaqiyatli saqlandi");
        return sendMessage;


    }

    public static SendMessage SavatniKurish(String chatId) {
        SendMessage sendMessage = new SendMessage(chatId, "Savatdagi telefonlar :");
        InlineKeyboardMarkup replyMarkup = Battinku.SavatniKursat(chatId);

        sendMessage.setReplyMarkup(replyMarkup);

        return sendMessage;
    }

    public static SendMessage SavatdanUchirishga(String chatIDI, Telefon telefon5) {
        SendMessage sendMessage = new SendMessage(chatIDI," Muvaqiyatli Uchirildi");
        Users users = UserServis.findChatId(chatIDI);

            users.Savat.remove(telefon5);
           return sendMessage;

    }

    public static SendMessage SotibOlish(String chatIDI) {
        Users users = UserServis.findChatId(chatIDI);
        int qiymati = 0;
        for (Telefon telefon : users.Savat) {
            qiymati+=telefon.getNarxi();
        }
        String str = "Sizdan jami "+qiymati +"$"+"\nTulov Turlari:";
        SendMessage sendMessage = new SendMessage(chatIDI,str);
        sendMessage.setReplyMarkup(Battinku.TULOV(qiymati));
        return sendMessage;
    }

    public static SendMessage SotibYakunlandi(String chatIDI) {
        Users users = UserServis.findChatId(chatIDI);
         users.SotibOlingan.addAll(users.Savat);
         users.Savat.removeAll(users.SotibOlingan);
         SendMessage sendMessage= new SendMessage(chatIDI,"Muvqiyatli bajarildi");
         return sendMessage;
    }

    public static SendMessage TelefonTurlari(String chatId) {
        SendMessage sendMessage = new SendMessage(chatId,textlarUchun.TelefonTurlari);
        Users users = UserServis.findChatId(chatId);
        users.setUserType(UserType.TELEFON);
        sendMessage.setReplyMarkup(Battinku.TelefonTurlariKu());

        return sendMessage;
    }

    public static SendMessage TelefonTurigaQarab(String chatId, String text) {
        SendMessage sendMessage = new SendMessage(chatId,text);
      sendMessage.setReplyMarkup(Battinku.TELEFONLARTURI(text));
      return sendMessage;
    }
}
