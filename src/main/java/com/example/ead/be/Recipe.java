package com.example.ead.be;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;
import java.util.ArrayList;
import java.util.List;

public class Recipe {

    @NotBlank(message = "Recipe name must not be blank")
    private String name;

    private List<String> ingredients;

    @Min(value = 1, message = "Prep time must be at least 1 minute")
    private int prepTimeInMinutes;

    public Recipe(String name, List<String> ingredients, int prepTimeInMinutes) {
        this.name = name;
        this.ingredients = ingredients;
        this.prepTimeInMinutes = prepTimeInMinutes;
    }

    public Recipe() {
        ingredients = new ArrayList<String>();
        name = "";
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Recipe{");
        sb.append("name=").append(name);
        sb.append(", ingredients=").append(ingredients);
        sb.append(", prepTimeInMinutes=").append(prepTimeInMinutes);
        sb.append('}');
        return sb.toString();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<String> getIngredients() { return ingredients; }
    public void setIngredients(List<String> ingredients) { this.ingredients = ingredients; }
    public int getPrepTimeInMinutes() { return prepTimeInMinutes; }
    public void setPrepTimeInMinutes(int prepTimeInMinutes) { this.prepTimeInMinutes = prepTimeInMinutes; }
}