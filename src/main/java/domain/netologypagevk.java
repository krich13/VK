package domain;

public class Netologypagevk

public class Post {
    private String id; // идентификатор поста
    private String nameId; // имя владельца поста
    private String imageId; // аватар владельца поста
    private int date; // врем публикации поста
    private String imageUrl; // картинка поста
    private String text; // текст поста
    private int createdBy; //идентификатор администратора, который опубликовал запись (возвращается только для сообществ при запросе с ключом доступа администратора).
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;
    // + get/set на все поля
}

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
}

public class InnerThreeDotMenu { //меню типа объект, под такой тип объекта мы создали отдельный класс innerThreeDotMenu
    //при нажатии на меню есть опции: Пожаловаться и Сохранить в закладки, поэтому внутри класса должно быть 2 метода

    // + get/set на все поля
}

public class CopyRight {
    private int id;
    private string link;
    private string name;
    private string type;
    // + get/set на все поля
}

public class Like {
    private int count;
    private int userLikes;
    private int canLike;
    private int canPublish;
    // + get/set на все поля
}

public class Repost {
    private int count;
    // + get/set на все поля
}

public class Views {
    private int count;
    // + get/set на все поля
}

public class Geo {
    private string type;
    private string coordinates;
    // + get/set на все поля
}

public class Donut {
    private boolean isDonut // запись доступна только платным подписчикам VK Donut;
    private int paidDuration // время, в течение которого запись будет доступна только платным подписчикам VK Donut;
    private boolean canpublishFeeCopy //можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut;
    private string editMode // информация о том, какие значения VK Donut можно изменить в записи. Возможные значения:
    // + get/set на все поля
}
