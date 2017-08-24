package kr.re.kitri.isrealboot2.dao;

import kr.re.kitri.isrealboot2.model.AnnouncePost;
import kr.re.kitri.isrealboot2.model.MountainDetail;
import kr.re.kitri.isrealboot2.model.WeatherDetail;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BbsDao {

    @Autowired
    private SqlSessionTemplate sqlSession;

    public List<AnnouncePost> selectAnnounces() {
        return sqlSession.selectList("mappers.announce.selectAnnounces");
    }

    public AnnouncePost selectAnnounceBySeq(int seq) {
        return sqlSession.selectOne("mappers.announce.selectAnnounceBySeq", seq);
    }

    public void insertAnnounce(AnnouncePost announcePost) {
        sqlSession.insert("mappers.announce.insertAnnounce", announcePost);
    }

    public void updateHps(int seq) {
        sqlSession.update("mappers.announce.updateHps", seq);
    }

    public List<AnnouncePost> select4Announces() {
        return sqlSession.selectList("mappers.announce.selectTop4Announces");
    }

    public MountainDetail selectMtDetail(int index) {
        return sqlSession.selectOne("mappers.announce.joinMtDetail", index);
    }

    public WeatherDetail selectWeatherDetail(int index) {
        return sqlSession.selectOne("mappers.announce.joinWeatherDetail", index);
    }

}
