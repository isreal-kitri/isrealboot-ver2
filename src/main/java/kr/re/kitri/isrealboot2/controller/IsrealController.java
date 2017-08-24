package kr.re.kitri.isrealboot2.controller;

import kr.re.kitri.isrealboot2.model.AnnouncePost;
import kr.re.kitri.isrealboot2.model.MountainDetail;
import kr.re.kitri.isrealboot2.model.WeatherDetail;
import kr.re.kitri.isrealboot2.service.IsrealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("")
public class IsrealController {

    @Autowired
    private IsrealService isrealService;

    /**
     *  전체 공지사항 보기
     */
    @GetMapping("/announce")
    public List<AnnouncePost> announces() {
        return this.isrealService.getAnnounces();
    }

    /**
     *  조회수 기준 Top4 공지사항 리스트
     */
    @GetMapping("/announce/top4")
    public List<AnnouncePost> top4announces() {
        return this.isrealService.getTop4Announces();
    }

    /**
     *  공지사항 보기
     *  공지사항 조회수 업데이트(클릭 이벤트 발생 시)
     */
    @GetMapping("/announce/{post_seq}")
    public AnnouncePost announceDetail(@PathVariable int post_seq) {
        isrealService.updateHitPerSec(post_seq);
        return isrealService.getAnnounce(post_seq);
    }

    /**
     *  공지사항 등록
     */
    @PostMapping("/announce/regist")
    public void registAnn(@RequestBody AnnouncePost announcePost) {
        isrealService.registAnnounce(announcePost);
    }

    /**
     *  산 상세보기
     */
    @GetMapping("/main/{mt_index}")
    public MountainDetail mountainDetail(@PathVariable int mt_index) {
        return isrealService.getMtDetail(mt_index);
    }

    /**
     *  날씨 정보 상세 보기
     */
    @GetMapping("/weather/{mt_index}")
    public WeatherDetail weatherDetail(@PathVariable int mt_index) {
        System.out.println("checke.........");
        System.out.println(mt_index);
        return isrealService.getWeatherDetail(mt_index);
    }

}
