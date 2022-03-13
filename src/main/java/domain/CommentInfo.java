package domain;

public class CommentInfo {
    private int count;
    private boolean canPost;
    private String commenterId; // имя владельца комментария
    private String commenterImageId; // аватар владельца комментария
    private int commentDate; // время публикации комментария
    private String commentImageUrl; // картинка комментария
    private String text; // текст комментария
    private boolean mylike; //лайкнул ли комментатор свой комментариц
    private int numberofcommentlikes; // сколько пользователей лайкнуло комментарий

    // + 3 метода Ответить, Поделиться, Добавить свой комментарий
    // + get/set на все поля
}
