package org.example.bot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.telegram.telegrambots.meta.api.objects.Contact;
import org.telegram.telegrambots.meta.api.objects.InputFile;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Users {
    private String name;
    private String UserName;
    private String chatId;
    private String phoneNomer;
    private int savolRaqami;
    private UserType userType;
    public List<Telefon>Savat = new ArrayList<>();
    public List<Telefon>SotibOlingan = new ArrayList<>();

    public static Users USER(Contact contact) {
        Users users = new Users();
        users.setChatId(contact.getUserId().toString());
        users.setName(contact.getFirstName());
        users.setPhoneNomer(contact.getPhoneNumber());
        users.setSavolRaqami(0);
        return users;
    }
}
