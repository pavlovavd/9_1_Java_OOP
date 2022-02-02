package ru.netology.domain;

public class Post {
    private int id; // идентификатор записи
    private int ownerId; // владелец стены
    private int fromId; // автор записи (кто опубликовал запись)
    private int createdBy; // индентификатор администратора (возвращается только для сообществ при запросе
    // с ключом доступа администратора)

    private int date;  // Время публикации записи в формате unixtime.

    private String text; // Текст записи
    private int replyOwnerId; // Идентификатор владельца записи, в ответ на которую была оставлена текущая.

    private int replyPostId; // Идентификатор записи, в ответ на которую была оставлена текущая.
    private int friendsOnly = 1; // если запись была создана с опцией «Только для друзей».

}
