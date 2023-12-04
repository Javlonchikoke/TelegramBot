package org.example.bot.battin;
import database.Database;
import org.example.bot.model.Telefon;
import org.example.bot.model.Users;
import org.example.bot.servis.UserServis;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class Battinku {
    public static ReplyKeyboardMarkup BatinChiqarish() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(textlarUchun.Telefonlar);
        keyboardRow.add(textlarUchun.TelefonTurlari);
        keyboardRowList.add(keyboardRow);
        keyboardRow = new KeyboardRow();
        keyboardRow.add(textlarUchun.Dollar);
        keyboardRow.add(textlarUchun.Savat);
        keyboardRowList.add(keyboardRow);

        keyboardRow = new KeyboardRow();
        keyboardRow.add(textlarUchun.DasturchiBilan);
        keyboardRowList.add(keyboardRow);
        replyKeyboardMarkup.setKeyboard(keyboardRowList);
        return replyKeyboardMarkup;

    }

    public static ReplyKeyboardMarkup RuyhadanUtish() {
        KeyboardRow keyboardRow = new KeyboardRow();
        List<KeyboardRow>list = new ArrayList<>();
        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("\uD83D\uDCF1 Telfon nomer");
        keyboardButton.setRequestContact(true);
        keyboardRow.add(keyboardButton);
        list.add(keyboardRow);
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(list);
        return replyKeyboardMarkup;
    }

    public static InlineKeyboardMarkup BarchaTelefonlar() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>>inlineKeyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton>list = new ArrayList<>();
        List<Telefon> telefonList = Database.TELEFON_LIST;
        for (Telefon telefon : telefonList) {
            InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();

            inlineKeyboardButton.setText(telefon.getNomi());
            inlineKeyboardButton.setCallbackData(telefon.getNomi());
            list.add(inlineKeyboardButton);
            inlineKeyboardButtons.add(list);
            list = new ArrayList<>();
        }
        inlineKeyboardMarkup.setKeyboard(inlineKeyboardButtons);
        return inlineKeyboardMarkup;
    }

    public static InlineKeyboardMarkup Buyruqlar(Telefon telefon) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton>buttons = new ArrayList<>();
        InlineKeyboardButton button1 = new InlineKeyboardButton();

        button1.setText("Telefon Haqida tuliq Malumot");
        button1.setCallbackData(telefon.getFile());
        buttons.add(button1);
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText(textlarUchun.Savat);
        button2.setCallbackData(telefon.getId());
        List<InlineKeyboardButton>inlineKeyboardButtons = new ArrayList<>();
        inlineKeyboardButtons.add(button2);
        List<List<InlineKeyboardButton>>list = new ArrayList<>();
        list.add(buttons);
        list.add(inlineKeyboardButtons);
        inlineKeyboardMarkup.setKeyboard(list);
        return inlineKeyboardMarkup;

    }

    public static InlineKeyboardMarkup SavatniKursat(String chatId) {
        Users users = UserServis.findChatId(chatId);
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>>inlineKeyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton>list = new ArrayList<>();
        if(!(users.Savat == null)) {
            for (Telefon telefon : users.Savat) {
                InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
                inlineKeyboardButton.setText(telefon.getNomi());
                inlineKeyboardButton.setCallbackData(telefon.getNomi());
                InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                inlineKeyboardButton1.setText("❌");
                inlineKeyboardButton1.setCallbackData(telefon.getUchirishId());
                list.add(inlineKeyboardButton);
                list.add(inlineKeyboardButton1);
                inlineKeyboardButtons.add(list);
                list = new ArrayList<>();
            }
            if(users.Savat !=null) {
                InlineKeyboardButton button = new InlineKeyboardButton();
                button.setText("Sotib Olish");
                button.setCallbackData(textlarUchun.sotibOlish);
                List<InlineKeyboardButton> list1 = new ArrayList<>();
                list1.add(button);

                inlineKeyboardButtons.add(list1);
            }
            inlineKeyboardMarkup.setKeyboard(inlineKeyboardButtons);
            return inlineKeyboardMarkup;

        }else {
            return  null;
        }

    }

    public static InlineKeyboardMarkup TULOV(int qiymati) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>>list = new ArrayList<>();
        List<InlineKeyboardButton>list1 = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(textlarUchun.Uzcard);
        button.setCallbackData(textlarUchun.Uzcard);
        list1.add(button);
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText(textlarUchun.Humo);
        button1.setCallbackData(textlarUchun.Humo);
        list1.add(button1);
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        List<InlineKeyboardButton>list2 = new ArrayList<>();
        button2.setText(textlarUchun.Visa);
        button2.setCallbackData(textlarUchun.Visa);
        list2.add(button2);
        list.add(list1);
        list.add(list2);
        inlineKeyboardMarkup.setKeyboard(list);
        return inlineKeyboardMarkup;



    }

    public static ReplyKeyboardMarkup TelefonTurlariKu() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        List<KeyboardRow>list = new ArrayList<>();
        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(textlarUchun.Samsung);
        keyboardRow.add(textlarUchun.Ayfon);
        list.add(keyboardRow);
        keyboardRow = new KeyboardRow();
        keyboardRow.add(textlarUchun.Redmi);
        keyboardRow.add(textlarUchun.Xiaomi);
        list.add(keyboardRow);
        keyboardRow = new KeyboardRow();
        keyboardRow.add(textlarUchun.Ortga);
        list.add(keyboardRow);
        replyKeyboardMarkup.setKeyboard(list);
        return replyKeyboardMarkup;
    }

    public static InlineKeyboardMarkup TELEFONLARTURI(String text) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>>inlineKeyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton>list = new ArrayList<>();
        List<Telefon> telefonList = Database.TELEFON_LIST;
        for (Telefon telefon : telefonList) {
            String str = telefon.getNomi().toUpperCase();
            if (str.startsWith(text)) {
                InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();

                inlineKeyboardButton.setText(telefon.getNomi());
                inlineKeyboardButton.setCallbackData(telefon.getNomi());
                list.add(inlineKeyboardButton);
                inlineKeyboardButtons.add(list);
                list = new ArrayList<>();
            }
        }
        inlineKeyboardMarkup.setKeyboard(inlineKeyboardButtons);
        return inlineKeyboardMarkup;





    }
}
