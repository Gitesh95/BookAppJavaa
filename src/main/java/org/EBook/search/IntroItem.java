package org.EBook.search;

public class IntroItem {
    private final String title, description;
    private final int imageResId;

    public IntroItem(String title, String description, int imageResId) {
        this.title = title;
        this.description = description;
        this.imageResId = imageResId;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public int getImageResId() { return imageResId; }
}
