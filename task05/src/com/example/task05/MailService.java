package com.example.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.lang.ref.SoftReference;


public class MailService<T> implements Consumer<TypeOfMessage<T>> {

    Map<java.lang.String, List<T>> mailBox = new HashMap<String,List<T>>() {
        @Override
        public List<T> get(Object key) {
            List<T> list = super.get(key);
            return list == null ? new ArrayList<>() : list;
        }
    };
    @Override
    public void accept(TypeOfMessage<T> mailMessage) {
        //list.add((MailMessage) mailMessage);
        if (mailBox.containsKey(mailMessage.getTo())){
            List<T> contents = mailBox.get(mailMessage.getTo());
            contents.add(mailMessage.getContent());
        }
        else {
            List<T> contents = new ArrayList<>();
            contents.add(mailMessage.getContent());
            mailBox.put(mailMessage.getTo(),contents);
        }
    }

    public Map<java.lang.String, List<T>> getMailBox (){
        return mailBox;
    }
}
