package guru.sfg.brewery.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * Created by jt on 2019-01-26.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class BeerInventory extends BaseEntity{

    @Builder
    public BeerInventory(UUID id, Long version, Timestamp createdDate, Timestamp lastModifiedDate, Beer beer,
                         Integer quantityOnHand) {
        super(id, version, createdDate, lastModifiedDate);
        this.beer = beer;
        this.quantityOnHand = quantityOnHand;
    }

    @ManyToOne
    private Beer beer;

    private Integer quantityOnHand = 0;
}
