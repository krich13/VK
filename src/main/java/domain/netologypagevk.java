package domain;

public class Netologypagevk

public class Post {
    private String id; // идентификатор поста
    private String nameId; // имя владельца поста
    private String imageId; // аватар владельца поста
    private int date; // врем публикации поста
    private String imageUrl; // картинка поста
    private String text; // текст поста
    private boolean mylike; //лайкнул ли пользователь пост
    private int numberofalllikes; // сколько пользователей лайкнуло пост
    private int numberofviews; // сколько человек посмотрело
    private int numberofreposts; //сколько человек сделало перепост

    // + get/set на все поля

    public class CommentsInfo { // в документации он типа object, под такой тип объекта мы создали отдельный класс CommentsInfo
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

        public class InnerThreeDotMenu{ //меню типа объект, под такой тип объекта мы создали отдельный класс innerThreeDotMenu
            //при нажатии на меню есть опции: Пожаловаться и Сохранить в закладки, поэтому внутри класса должно быть 2 метода

    }

