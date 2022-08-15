package thymeleafstudy.thymeleaf.form.domain.item;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ItemType {
    BOOK("도서"), FOOD("음식"), ETC("기타");

    private final String description;
}
