package com.silverneko.bdd.loyaltycards;

public class MorningFreshnessMember {
  private final String name;
  private final SuperSmoothieSchema schema;
  private int points;

  public MorningFreshnessMember(String name, SuperSmoothieSchema schema) {
    this.name = name;
    this.schema = schema;
  }

  public void orders(Integer amount, String drink) {
    points += schema.getPointsFor(drink) * amount;
  }

  public int getPoints() {
    return points;
  }

  public String getName() {
    return name;
  }
}
