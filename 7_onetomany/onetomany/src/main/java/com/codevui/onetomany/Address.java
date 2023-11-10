package com.codevui.onetomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String address;
    @OneToMany(mappedBy = "address" , cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //mỗi 1 địa chỉ sẽ có nhiều người
    //cascade = ALL này là nếu như mình xóa đi address đi 
    //thì nó sẽ tự động xóa nhưng thằng person liên quen đến thằng address đó đi 
    @ToString.Exclude
    public List<Person> persons;    
}
