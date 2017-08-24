package kr.re.kitri.isrealboot2;

import kr.re.kitri.isrealboot2.dao.BbsDao;
import kr.re.kitri.isrealboot2.model.AnnouncePost;
import kr.re.kitri.isrealboot2.model.MountainDetail;
import kr.re.kitri.isrealboot2.model.WeatherDetail;
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
		AnnouncePost test = bbsDao.selectAnnounceBySeq(11);
		System.out.println(test);
	}

	@Test
	public void insertAnnounceTest() {
		bbsDao.insertAnnounce(new AnnouncePost(0, "test3", "jinsuk", 0, 0, null, "테스트입니다."));
		List<AnnouncePost> testList = bbsDao.selectAnnounces();
		System.out.println(testList);
	}

	@Test
	public void updateHpsTest() {
		AnnouncePost test = bbsDao.selectAnnounceBySeq(11);
		System.out.println(test);
		bbsDao.updateHps(11);
		AnnouncePost test2 = bbsDao.selectAnnounceBySeq(11);
		System.out.println(test2);
	}

	@Test
	public void select4AnnouncesTest() {
		List<AnnouncePost> testList = bbsDao.select4Announces();
		System.out.println(testList.size());
		System.out.println(testList);
	}

	@Test
	public void selectMtDetailTest() {
		MountainDetail temp = bbsDao.selectMtDetail(0);
		System.out.println(temp);
	}

	@Test
	public void selectWeatherDetailTest() {
		WeatherDetail temp = bbsDao.selectWeatherDetail(0);
		System.out.println(temp);
	}

}


