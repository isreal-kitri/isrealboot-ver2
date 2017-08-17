package kr.re.kitri.isrealboot2.service;

import kr.re.kitri.isrealboot2.dao.BbsDao;
import kr.re.kitri.isrealboot2.model.AnnouncePost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IsrealService {

    @Autowired
    private BbsDao bbsDao;

    public List<AnnouncePost> getAnnounces() {
        return this.bbsDao.selectAnnounces();
    }

    public AnnouncePost getAnnounce(int seq) {
        return this.bbsDao.selectAnnounceBySeq(seq);
    }

    public void registAnnounce(AnnouncePost announcePost) {
        this.bbsDao.insertAnnounce(announcePost);
    }
}
