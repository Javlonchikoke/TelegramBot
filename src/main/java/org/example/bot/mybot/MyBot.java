package org.example.bot.mybot;

import database.Database;
import lombok.SneakyThrows;
import org.example.bot.battin.Battin;
import org.example.bot.battin.textlarUchun;
import org.example.bot.model.Telefon;
import org.example.bot.model.UserType;
import org.example.bot.model.Users;
import org.example.bot.servis.UserServis;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Contact;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MyBot extends TelegramLongPollingBot {
    static ExecutorService executorService = Executors.newCachedThreadPool();
    public MyBot(String s) {super(s);}

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
executorService.execute(()-> {

    if (update.hasMessage()) {
        Users users = UserServis.findChatId(String.valueOf(update.getMessage().getChatId()));
        Message message = update.getMessage();
        String chatId = String.valueOf(message.getChatId());
        if (users == null) {
            if (message.hasContact()) {
                Contact contact = message.getContact();
                Users users1 = Users.USER(contact);
                users1.setUserName(message.getChat().getUserName());
                users1.setUserType(UserType.REGESTRED);
                UserServis.Addd(users1);
                try {
                    execute(Battin.inMainMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            } else {
                try {
                    execute(Battin.getContact(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            return;
        }
        if (users.getUserType().equals(UserType.REGESTRED)) {
            try {
                execute(Battin.inMainMenu(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        } else if (users.getUserType().equals(UserType.TELEFON)) {
            try {
                execute(Battin.TelefonTurlari(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }

        if (message.hasText()) {
            String text = message.getText();
            switch (text) {
                case textlarUchun.DasturchiBilan -> {
                    try {
                        execute(Battin.murojat(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case textlarUchun.Telefonlar -> {
                    try {
                        execute(Battin.Telefonlar(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case textlarUchun.Dollar -> {
                    try {
                        execute(Battin.Dollor(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case textlarUchun.Savat -> {
                    try {
                        execute(Battin.SavatniKurish(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case textlarUchun.TelefonTurlari -> {
                    try {
                        execute(Battin.TelefonTurlari(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case textlarUchun.Samsung, textlarUchun.Ayfon, textlarUchun.Redmi, textlarUchun.Xiaomi -> {
                    try {
                        execute(Battin.TelefonTurigaQarab(chatId, text));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }

                case textlarUchun.Ortga -> {
                    try {
                        execute(Battin.inMainMenu(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        }
    } else if (update.hasCallbackQuery()) {
        String dataMessage1 = update.getCallbackQuery().getData();
        String chatIDI = update.getCallbackQuery().getMessage().getChatId().toString();
        if (dataMessage1.equals(textlarUchun.sotibOlish)) {
            try {
                execute(Battin.SotibOlish(chatIDI));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        } else if (dataMessage1.equals(textlarUchun.Uzcard) || dataMessage1.equals(textlarUchun.Humo) || dataMessage1.equals(textlarUchun.Visa)) {
            try {
                execute(Battin.SotibYakunlandi(chatIDI));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
        Telefon telefon1 = null;
        for (Telefon telefon : Database.TELEFON_LIST) {
            if (telefon.getNomi().equals(dataMessage1)) {
                telefon1 = telefon;
                break;
            }
        }
        Telefon telefon3 = null;
        for (Telefon telefon : Database.TELEFON_LIST) {
            if (telefon.getFile().equals(dataMessage1)) {
                telefon3 = telefon;
                break;
            }
        }
        Telefon telefon4 = null;
        for (Telefon telefon : Database.TELEFON_LIST) {
            if (telefon.getId().equals(dataMessage1)) {
                telefon4 = telefon;
                break;
            }
        }
        Telefon telefon5 = null;
        for (Telefon telefon : Database.TELEFON_LIST) {
            if (telefon.getUchirishId().equals(dataMessage1)) {
                telefon5 = telefon;
                break;
            }
        }

        if (Database.TELEFON_LIST.contains(telefon1)) {

            if (!(telefon1 == null)) {
                try {
                    execute(Battin.TELEFON(telefon1, chatIDI));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

        } else if (Database.TELEFON_LIST.contains(telefon3)) {
            if (!(telefon3 == null)) {
                try {
                    execute(Battin.TELEFONHAQIDA(chatIDI, telefon3));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        } else if (Database.TELEFON_LIST.contains(telefon4)) {
            try {
                execute(Battin.SAVATGA(chatIDI, telefon4));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        } else if (Database.TELEFON_LIST.contains(telefon5)) {
            try {
                execute(Battin.SavatdanUchirishga(chatIDI, telefon5));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
    }

});
    }


    @Override
    public String getBotUsername() {
        return "JavlonchikokeOfficials_bot";
    }
}
