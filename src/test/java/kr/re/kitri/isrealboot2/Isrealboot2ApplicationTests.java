package kr.re.kitri.isrealboot2;

import kr.re.kitri.isrealboot2.dao.BbsDao;
import kr.re.kitri.isrealboot2.model.AnnouncePost;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Isrealboot2ApplicationTests {

	@Autowired
	private BbsDao bbsDao;

	@Test
	public void contextLoads() {
	}

	@Test
	public void selectAnnouncesTest() {
		List<AnnouncePost> testList = bbsDao.selectAnnounces();
		System.out.println(testList);
	}

	@Test
	public void selectAnnounceBySeqTest() {
		AnnouncePost test = bbsDao.selectAnnounceBySeq(4);
		System.out.println(test);
	}

	@Test
	public void insertAnnounceTest() {
		bbsDao.insertAnnounce(new AnnouncePost(0, "test3", "jinsuk", 0, 0, null, "테스트입니다."));
		List<AnnouncePost> testList = bbsDao.selectAnnounces();
		System.out.println(testList);
	}

}
