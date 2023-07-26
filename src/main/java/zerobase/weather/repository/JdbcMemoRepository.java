package zerobase.weather.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import zerobase.weather.domain.Memo;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

@Repository
public class JdbcMemoRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcMemoRepository(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource); //dataSources는 application.properties에 spring.datasource.url에 설정한 정보
    }

    public Memo save(Memo memo){
        String sql = "insert into memo values(?,?)";
        jdbcTemplate.update(sql,memo.getId(), memo.getText());
        return  memo;
    }

    public List<Memo> findAll(){
        String sql = "select * from memo";
        return jdbcTemplate.query(sql, memoRowMapper());
    }

    public Optional<Memo> findById(int id){
        String sql = "select * from memo where id = ?";
        return  jdbcTemplate.query(sql, memoRowMapper(), id).stream().findFirst();
    }
    private RowMapper<Memo> memoRowMapper(){
        //JDBC를 통해서 MYSQL DB에서 DATA를 가져올 시 가져온 데이터 값은 ResultSet 형식의 데이터를 가져온다.
        //ex ) {id = 1, text = 'this is memo~'}
        //ResultSet을 Memo의 형식으로 Mapping 해주는 것을 RowMapper이라고 한다.
        return (rs, rowNum) -> new Memo(
                rs.getInt("id"),
                rs.getString("text")
        );
    }
}
