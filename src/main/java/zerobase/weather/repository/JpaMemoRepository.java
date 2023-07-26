package zerobase.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.weather.domain.Memo;

@Repository
public interface JpaMemoRepository extends JpaRepository<Memo, Integer> {
    //jpa는 java ORM기술의 표준
    //자바에서 orm개념을 활용할때 사용하는 함수들을 jpaRepository에 정의를 해놓았기 때문에 가져와서 사용하기만하면된다.
    //사용할때 어떤클래스를 가져와 연결할 것인지, 클래스 키의 형식이 무엇인지 명시를해 주어야 한다.

}
