package com.azanniel.recyclerviewjava.models;

import java.util.Arrays;
import java.util.List;

public class Emails {

    public static List<Email> fakeEmails() {

        return Arrays.asList(

                Email.EmailBuilder.builder()
                        .setUser("Facebook")
                        .setSubject("Veja nossas três dicas principais para aumentar as suas vendas")
                        .setPreview("Olá Tiago, Você precisa ver esse site para")
                        .setDate("5 jun")
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Facebook")
                        .setSubject("Um amigo quer que você curta uma Página dele")
                        .setPreview("Fulano convidou você para curtir a sua Página no Facebook")
                        .setDate("30 mai")
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Youtube")
                        .setSubject("Tiago Aguiar acabou de enviar um video")
                        .setPreview("Tiago Aguiar enviou ANDROID: GOOGLE MAPS, LOCATION")
                        .setDate("30 mai")
                        .setStared(true)
                        .setUnread(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Instagram")
                        .setSubject("tiagoaguiar.oficial começou a seguir-te")
                        .setPreview("tiagoaguiar.oficial, tens um novo seguidor")
                        .setDate("18 mai")
                        .setStared(false)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Facebook")
                        .setSubject("Veja nossas três dicas principais para aumentar as suas vendas")
                        .setPreview("Olá Tiago, Você precisa ver esse site para")
                        .setDate("5 jun")
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Facebook")
                        .setSubject("Um amigo quer que você curta uma Página dele")
                        .setPreview("Fulano convidou você para curtir a sua Página no Facebook")
                        .setDate("30 mai")
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Youtube")
                        .setSubject("Tiago Aguiar acabou de enviar um video")
                        .setPreview("Tiago Aguiar enviou ANDROID: GOOGLE MAPS, LOCATION")
                        .setDate("30 mai")
                        .setStared(true)
                        .setUnread(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Instagram")
                        .setSubject("tiagoaguiar.oficial começou a seguir-te")
                        .setPreview("tiagoaguiar.oficial, tens um novo seguidor")
                        .setDate("18 mai")
                        .setStared(false)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Facebook")
                        .setSubject("Veja nossas três dicas principais para aumentar as suas vendas")
                        .setPreview("Olá Tiago, Você precisa ver esse site para")
                        .setDate("5 jun")
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Facebook")
                        .setSubject("Um amigo quer que você curta uma Página dele")
                        .setPreview("Fulano convidou você para curtir a sua Página no Facebook")
                        .setDate("30 mai")
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Youtube")
                        .setSubject("Tiago Aguiar acabou de enviar um video")
                        .setPreview("Tiago Aguiar enviou ANDROID: GOOGLE MAPS, LOCATION")
                        .setDate("30 mai")
                        .setStared(true)
                        .setUnread(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Instagram")
                        .setSubject("tiagoaguiar.oficial começou a seguir-te")
                        .setPreview("tiagoaguiar.oficial, tens um novo seguidor")
                        .setDate("18 mai")
                        .setStared(false)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Facebook")
                        .setSubject("Veja nossas três dicas principais para aumentar as suas vendas")
                        .setPreview("Olá Tiago, Você precisa ver esse site para")
                        .setDate("5 jun")
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Facebook")
                        .setSubject("Um amigo quer que você curta uma Página dele")
                        .setPreview("Fulano convidou você para curtir a sua Página no Facebook")
                        .setDate("30 mai")
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Youtube")
                        .setSubject("Tiago Aguiar acabou de enviar um video")
                        .setPreview("Tiago Aguiar enviou ANDROID: GOOGLE MAPS, LOCATION")
                        .setDate("30 mai")
                        .setStared(true)
                        .setUnread(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Instagram")
                        .setSubject("tiagoaguiar.oficial começou a seguir-te")
                        .setPreview("tiagoaguiar.oficial, tens um novo seguidor")
                        .setDate("18 mai")
                        .setStared(false)
                        .build()
        );


    }

}
