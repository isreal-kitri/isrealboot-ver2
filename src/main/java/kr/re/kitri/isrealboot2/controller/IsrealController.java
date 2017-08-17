package kr.re.kitri.isrealboot2.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.re.kitri.isrealboot2.model.AnnouncePost;
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
    public List<AnnouncePost> heroes() {
        System.out.println("공지사항 읽기 테스트");
        return this.isrealService.getAnnounces();
    }

    /**
     *  공지사항 보기
     */
    @GetMapping("/announce/{post_seq}")
    public AnnouncePost announceDetail(@PathVariable int post_seq) {
        System.out.println("공지사항 detail 확인");
        return isrealService.getAnnounce(post_seq);
    }

    /**
     *  공지사항 등록
     */
    @PostMapping("/announce")
    public void registAnn(@RequestBody AnnouncePost announcePost) {
        System.out.println("check..");
        System.out.println(announcePost);

        isrealService.registAnnounce(announcePost);
    }
}
