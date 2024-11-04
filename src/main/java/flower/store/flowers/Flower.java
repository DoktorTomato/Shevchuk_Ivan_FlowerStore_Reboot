package flower.store.flowers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString @NoArgsConstructor @Entity @Table
public class Flower {
    @Id
    private Long id;
    private FlowerType type;
    private FlowerColor color;
    private double sepalLength;
    private double price;

    public Flower(Flower flower) {
        color = flower.color;
        sepalLength = flower.sepalLength;
        price = flower.price;
        type = flower.type;
    }

    public String getColor() {
        if (this.color == null) {
            return null;
        }
        return color.toString();
    }
}

