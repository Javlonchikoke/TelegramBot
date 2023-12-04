package org.example.bot.servis;

import org.example.bot.model.Users;

import java.util.ArrayList;
import java.util.List;

public class UserServis {
  public static List<Users> usersList = new ArrayList<>();
    public static Users findChatId(String chatId) {
        for (Users users : usersList) {
            if (users.getChatId().equals(chatId)){
                return users;
            }
        }
        return null;
    }

    public static void Addd(Users users1) {
        usersList.add(users1);
    }
}
