package com.silverneko.bdd.loyaltycards;

import java.util.HashMap;
import java.util.Map;

public class SuperSmoothieSchema {
  private final Map<String, Integer> pointsPerCategory = new HashMap<>();
  private final DrinkCatalog catalog;

  public SuperSmoothieSchema(DrinkCatalog catalog) {
    this.catalog = catalog;
  }

  public void setPointsPerCategory(String category, Integer points) {
    pointsPerCategory.put(category, points);
  }

  public int getPointsFor(String drink) {
    return pointsPerCategory.get(categoryOf(drink));
  }

  private String categoryOf(String drink) {
    return catalog.getCategoryOf(drink);
  }
}
