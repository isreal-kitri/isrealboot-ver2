package kr.re.kitri.isrealboot2.dao;

import kr.re.kitri.isrealboot2.model.AnnouncePost;
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

}
