package com.example.javafxcw2;

import javafx.scene.control.TableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageeCell extends TableCell<HorseData, Image> {
    private final ImageView imageView;

    public ImageeCell() {
        imageView = new ImageView();
        imageView.setFitWidth(80);
        imageView.setFitHeight(80);
        setGraphic(imageView);
    }

    @Override
    protected void updateItem(Image item, boolean empty) {
        super.updateItem(item, empty);
        if (empty || item == null) {
            imageView.setImage(null);
        } else {
            imageView.setImage(item);
        }
    }
}