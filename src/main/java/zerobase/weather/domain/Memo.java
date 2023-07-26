package zerobase.weather.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "memo")  //기본키를 명시해주어야한다.
public class Memo {
    @Id //Primary key 명시
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment와 같은 역활을 한다.
    private int id;
    private String text;
}
